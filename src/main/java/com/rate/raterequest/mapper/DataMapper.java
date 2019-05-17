package com.rate.raterequest.mapper;

import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.DataModel;
import com.rate.raterequest.common.DBTables;
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
}
