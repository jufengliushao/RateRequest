package com.rate.raterequest.DBTool;

import com.rate.raterequest.Service.RMYHService;
import com.rate.raterequest.Service.ZGYHService;
import com.rate.raterequest.bean.*;
import com.rate.raterequest.common.DBTables;

import java.util.List;

/***
 * 保存数据
 */
public class DataSaving {
    private RateModel _rateModel; // 当前传入的model
    private RMYHService _service; // 当前service对象
    private DataModel _dateInfo; // 保存过的时间戳
    private ZGYHService _zgyhService; // 中国银行的service
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
                                    c.getId(),
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

    /***
     * 保存中国银行捕获的数据
     * @param models
     * @param as
     */
    public void saving_zgyh_rate(List<WebZGYHModel> models, ZGYHService as){
        if (models.size() < 1){
            return;
        }
        _zgyhService = as;
        // 保存时间戳
        WebZGYHDateModel date = new WebZGYHDateModel();
        date.setDate(models.get(1).getAnnounceDate());
        date.setTime(models.get(1).getAnnounceTime());

        boolean isExist = _zgyhService.saveDateInfo(date, DBTables.DATE_ZGYH_TABLE);
        if (!isExist){
            return;
        }

        date = _zgyhService.getLastDateInfo(DBTables.DATE_ZGYH_TABLE);
        for(WebZGYHModel m : models){
            // 保存数据
            saveZGYHData(m, date);
        }
    }

    /***
     * 单个保存中国银行的数据
     * @param model
     */
    private void saveZGYHData(WebZGYHModel model, WebZGYHDateModel date){
        if (model == null){
            return;
        }
        // 获取国家信息
        CountryInfoModel country = _zgyhService.getCountryInfo(model.getMoneyName(), DBTables.COUNTRY_RATE_TABLE);
        // 保存信息
        _zgyhService.insertRateInfo(model, country.getId(), date.getId(), DBTables.RATE_ZGYH_TABLE);
    }
}
