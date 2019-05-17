package com.rate.raterequest.Service;

import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.DataModel;
import com.rate.raterequest.bean.RateModel;
import com.rate.raterequest.bean.RecordModel;
import com.rate.raterequest.request.HttpAPIService;


/***
 * 中国人民银行的相关操作
 */
public interface RMYHService {
    /***
     * 获取最新的人民银行的数据
     * @return
     */
    public RateModel getNewDatas(HttpAPIService httpAPIService);

    /***
     * 获取国家信息
     * @param en - 国家币种英文简写
     * @return 国家model
     */
    public CountryInfoModel getCountryInfo(String en);

    /***
     * 插入时间戳数据 并返回对应的id
     * @param rateModel
     * @param tableName
     * @return DataModel 对应插入的数据
     */
    public void saveDateInfo(RateModel rateModel, String tableName);

    /***
     * 根据ts查找对应dateinfo
     * @param ts
     * @param tableName
     * @return
     */
    public DataModel searchDateInfo(String ts, String tableName);

    /***
     * 插入每条数据
     * @param recordModel
     * @param ts_id
     * @param country_id
     * @param tableName
     */
    public void insertRecordData(RecordModel recordModel, int ts_id, int country_id, String tableName);
}
