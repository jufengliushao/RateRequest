package com.rate.raterequest.common;

/***
 * 数据库表格名称
 */
public class DBTables {
    /***
     * 时间戳表格
     */
    public static String DATETIME_RATE_TABLE = "DateInfo";

    /***
     * 国家信息表格
     */
    public static String COUNTRY_RATE_TABLE = "CountryInfo";

    /***
     * 美元戳表格
     */
    public static String USD_RATE_TABLE = "USD_Money";

    /***
     * 欧元戳表格
     */
    public static String EUR_RATE_TABLE = "EUR_Money";

    /***
     * 阿联酋戳表格
     */
    public static String AED_RATE_TABLE = "AED_Money";

    /***
     * 澳大利亚戳表格
     */
    public static String AUD_RATE_TABLE = "AUD_Money";

    /***
     * 加拿大戳表格
     */
    public static String CAD_RATE_TABLE = "CAD_Money";

    /***
     * 瑞士戳表格
     */
    public static String CHF_RATE_TABLE = "CHF_Money";

    /***
     * 丹麦戳表格
     */
    public static String DKK_RATE_TABLE = "DKK_Money";

    /***
     * 英国戳表格
     */
    public static String GBP_RATE_TABLE = "GBP_Money";

    /***
     * 香港戳表格
     */
    public static String HKD_RATE_TABLE = "HKD_Money";

    /***
     * 匈牙利戳表格
     */
    public static String HUF_RATE_TABLE = "HUF_Money";

    /***
     * 日本戳表格
     */
    public static String JPY_RATE_TABLE = "JPY_Money";

    /***
     * 韩国戳表格
     */
    public static String KRW_RATE_TABLE = "KRW_Money";

    /***
     * 墨西哥戳表格
     */
    public static String MXN_RATE_TABLE = "MXN_Money";

    /***
     * 马来西亚戳表格
     */
    public static String MYR_RATE_TABLE = "MYR_Money";

    /***
     * 挪威戳表格
     */
    public static String NOK_RATE_TABLE = "NOK_Money";

    /***
     * 新西兰戳表格
     */
    public static String NZD_RATE_TABLE = "NZD_Money";

    /***
     * 波兰戳表格
     */
    public static String PLN_RATE_TABLE = "PLN_Money";

    /***
     * 俄罗斯戳表格
     */
    public static String RUB_RATE_TABLE = "RUB_Money";

    /***
     * 沙特戳表格
     */
    public static String SAR_RATE_TABLE = "SAR_Money";

    /***
     * 瑞典戳表格
     */
    public static String SEK_RATE_TABLE = "SEK_Money";

    /***
     * 新加坡戳表格
     */
    public static String SGD_RATE_TABLE = "SGD_Money";

    /***
     * 泰国戳表格
     */
    public static String THB_RATE_TABLE = "THB_Money";

    /***
     * 土耳其戳表格
     */
    public static String TRY_RATE_TABLE = "TRY_Money";

    /***
     * 南非戳表格
     */
    public static String ZAR_RATE_TABLE = "ZAR_Money";

    /***
     * 中国银行的时间戳表格
     */
    public static String DATE_ZGYH_TABLE = "ZGYHDate";

    /***
     * 中国银行的数据表格
     */
    public static String RATE_ZGYH_TABLE = "ZGYHRate";

    /***
     *
     * @param str
     * @return
     */
    public static String getTableName(String str){
        String result = str.toUpperCase();
        return result + "_Money";
    }
}
