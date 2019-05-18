package com.rate.raterequest.Service;

import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.WebZGYHDateModel;
import com.rate.raterequest.bean.WebZGYHModel;

/***
 * 中国银行汇率处理
 */
public interface ZGYHService {
    /***
     * 从中国银行获取新的数据
     */
    public void getNewRateFromZGYH();

    /***
     * 根据钱币的名字获取国家信息
     * @param moneyName
     * @param tableName
     * @return
     */
    public CountryInfoModel getCountryInfo(String moneyName, String tableName);

    /***
     * 保存中国银行的时间信息
     * @param date
     * @param tableName
     */
    public void saveDateInfo(WebZGYHDateModel date, String tableName);

    /***
     * 获取最新的时间戳数据
     * @param tableName
     * @return
     */
    public WebZGYHDateModel getLastDateInfo(String tableName);

    /***
     * 保存数据到中国银行的数据表中
     * @param model
     * @param country_id
     * @param time_id
     * @param tableName
     */
    public void insertRateInfo(WebZGYHModel model, int country_id, int time_id, String tableName);
}
