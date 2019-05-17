package com.rate.raterequest.DBTool;

import com.rate.raterequest.Service.RMYHService;
import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.DataModel;
import com.rate.raterequest.bean.RateModel;
import com.rate.raterequest.bean.RecordModel;
import com.rate.raterequest.common.DBTables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/***
 * 保存数据
 */
public class DataSaving {
    private RateModel _rateModel; // 当前传入的model
    private RMYHService _service; // 当前service对象
    private DataModel _dateInfo; // 保存过的时间戳
    /***
     * 保存人民银行的汇率信息
     * @param rateModel
     */
    public void saving_rmyh_data(RateModel rateModel, RMYHService service){
        System.out.println("保存人民银行的数据");
        _rateModel = rateModel;
        _service = service;
        if(!saveDateInfo()){
            // 数据表中已经存在对应的时间戳，不进行更新
            return;
        };
        // 没有存过数据，进行存储
        for (RecordModel recordModel: rateModel.getRecords()){
            saveRecord(recordModel);
        }
    }

    /***
     * 保存当前记录信息信息
     */
    private void saveRecord(RecordModel recordModel){
        // 获取当前国家信息
        CountryInfoModel c =  _service.getCountryInfo(recordModel.getForeignCName());
        // 存储数据
        _service.insertRecordData(recordModel,
                                    Integer.parseInt(_dateInfo.getId()),
                                    Integer.parseInt(c.getId()),
                                    DBTables.getTableName(recordModel.getForeignCName()));
    }

    /***
     * 保存当前的datainfo
     */
    private boolean saveDateInfo() {
        DataModel dataModel = _service.searchDateInfo(_rateModel.getHeader().getTs(), DBTables.DATETIME_RATE_TABLE);
        if (dataModel != null){
            _dateInfo = dataModel;
            return false;
        }
        _service.saveDateInfo(_rateModel, DBTables.DATETIME_RATE_TABLE);
        _dateInfo = _service.searchDateInfo(_rateModel.getHeader().getTs(), DBTables.DATETIME_RATE_TABLE);
        return true;
    }


}
