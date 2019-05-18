package com.rate.raterequest.mapper;

import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.DataModel;
import com.rate.raterequest.bean.WebZGYHDateModel;
import org.apache.ibatis.annotations.*;

/***
 * 数据存储mapper
 */
public interface DataMapper {

    /***
     * 查找国家信息
     * @return 国家model
     */
    @Select("select * from " + "CountryInfo" + " where money_en = #{en}")
    public CountryInfoModel searchCountryInfo(String en);


    /***
     * 插入数据
     * @param last_date_en
     * @param last_date_cn
     * @param ts
     * @param tableName 表名
     */
    @Insert("insert into ${tableName} (last_date_en, last_date_cn, ts) values ('${last_date_en}', '${last_date_cn}', '${ts}')")
    public void insertDateInfo(@Param("last_date_en") String last_date_en,
                               @Param("last_date_cn") String last_date_cn,
                               @Param("ts") String ts,
                               String tableName);

    /***
     * 查找ts对应的model
     * @param ts
     * @param tableName
     * @return
     */
    @Select("select * from  ${tableName} where ts = '${ts}'")
    @Results({
            @Result(property = "lastDateEn", column = "last_date_en"),
            @Result(property = "lastDate", column = "last_date_cn")
    })
    public DataModel searchDateModel(@Param("ts") String ts, @Param("tableName") String tableName);

    /***
     * 插入数据
     * @param ts_id
     * @param price
     * @param china_rate
     * @param rate_china
     * @param country_id
     * @param bp
     * @param bpdouble
     * @param vrtName
     * @param vrtEName
     * @param tableName
     */
    @Insert("insert into ${tableName} (ts_id, price, china_rate, rate_china, country_id, bp, bpdouble, vrtName, vrtEName) " +
            "values(${ts_id}, '${price}', '${china_rate}', '${rate_china}', ${country_id}, '${bp}', ${bpdouble}, '${vrtName}', '${vrtEName}')")
    public void insertPriceData(@Param("ts_id") int ts_id,
                                @Param("price") String price,
                                @Param("china_rate") String china_rate,
                                @Param("rate_china") String rate_china,
                                @Param("country_id") int country_id,
                                @Param("bp") String bp,
                                @Param("bpdouble") Double bpdouble,
                                @Param("vrtName") String vrtName,
                                @Param("vrtEName") String vrtEName,
                                String tableName);

    /***
     * 根据中国银行的货币中文名称获取数据
     * @param moneyName
     * @param tableName
     * @return
     */
    @Select("select * from ${tableName} where money_cn = '${moneyName}'")
    public CountryInfoModel getCountryInfoZGYH(@Param("moneyName") String moneyName,
                                               @Param("tableName") String tableName);

    /***
     * 向中国银行的时间戳中插入数据
     * @param date
     * @param time
     * @param tableName
     */
    @Insert("insert into ${tableName} (date, time) values('${date}', '${time}')")
    public void saveZGYHDateInfo(@Param("date") String date,
                                 @Param("time") String time,
                                 @Param("tableName") String tableName);


    /****
     * 找到最新的中国银行的时间戳
     * @param tableName
     * @return
     */
    @Select("select *from ${tableName} order by id desc limit 0,1 ")
    public WebZGYHDateModel getZGYHTimeLast(@Param("tableName") String tableName);


    /***
     * 存入数据
     * @param xhBuyRate
     * @param xhSellRate
     * @param moneyBuyRate
     * @param moneySellRate
     * @param zhRate
     * @param country_id
     * @param time_id
     * @param tableName
     */
    @Insert("insert into ${tableName} (xhBuyRate, xhSellRate, moneyBuyRate, moneySellRate, zhRate, country_id, time_id)" +
            "values ('${xhBuyRate}', '${xhSellRate}', '${moneyBuyRate}', '${moneySellRate}', '${zhRate}', ${country_id}, ${time_id})")
    public void saveZGYHRateInfo(@Param("xhBuyRate") String xhBuyRate,
                                 @Param("xhSellRate") String xhSellRate,
                                 @Param("moneyBuyRate") String moneyBuyRate,
                                 @Param("moneySellRate") String moneySellRate,
                                 @Param("zhRate") String zhRate,
                                 @Param("country_id") int country_id,
                                 @Param("time_id") int time_id,
                                 @Param("tableName") String tableName);
}
