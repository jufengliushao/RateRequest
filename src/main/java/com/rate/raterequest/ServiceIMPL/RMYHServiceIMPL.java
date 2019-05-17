package com.rate.raterequest.ServiceIMPL;

import com.rate.raterequest.DBTool.DataSaving;
import com.rate.raterequest.DBTool.DataSetting;
import com.rate.raterequest.Service.RMYHService;
import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.DataModel;
import com.rate.raterequest.bean.RateModel;
import com.rate.raterequest.bean.RecordModel;
import com.rate.raterequest.mapper.DataMapper;
import com.rate.raterequest.request.HttpAPIService;
import com.rate.raterequest.request.RequestAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/***
 * 人民银行service实现
 */
@Service
@Qualifier("rmyhServiceIMPL")
public class RMYHServiceIMPL implements RMYHService {
    private RequestAPI requestAPI = new RequestAPI();

    @Override
    public RateModel getNewDatas(HttpAPIService httpAPIService) {
        // 请求网页获取数据
        RateModel rateModel = requestAPI.request_rmyh_rate(httpAPIService);
        // 保存数据
        DataSaving dataSaving = new DataSaving();
        dataSaving.saving_rmyh_data(rateModel, this);
        return rateModel;
    }

    @Autowired
    private DataMapper dataMapper;

    @Override
    public CountryInfoModel getCountryInfo(String en) {
        CountryInfoModel co = dataMapper.searchCountryInfo(en);
        return co;
    }

    @Override
    public void saveDateInfo(RateModel rateModel, String tableName) {
        dataMapper.insertDateInfo(rateModel.getData().getLastDateEn(),
                                  rateModel.getData().getLastDate(),
                                rateModel.getHeader().getTs(),
                                tableName);
    }

    @Override
    public DataModel searchDateInfo(String ts, String tableName) {
        return dataMapper.searchDateModel(ts, tableName);
    }

    @Override
    public void insertRecordData(RecordModel recordModel, int ts_id, int country_id, String tableName) {
        dataMapper.insertPriceData( ts_id,
                                    recordModel.getPrice(),
                                    DataSetting.getChinaRate(recordModel),
                                    DataSetting.getRateChina(recordModel),
                                    country_id,
                                    recordModel.getBp(),
                                    Double.parseDouble(recordModel.getBpDouble()),
                                    recordModel.getVrtName(),
                                    recordModel.getVrtEName(),
                                    tableName);
    }
}
