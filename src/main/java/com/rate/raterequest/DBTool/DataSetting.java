package com.rate.raterequest.DBTool;

import com.rate.raterequest.bean.RecordModel;
import com.rate.raterequest.common.PropertiesStatic;

import java.text.DecimalFormat;

/***
 * 处理数据存储需要的计算等工作
 */
public class DataSetting {
    /***
     * 获取人民币对外币种的汇率
     * @param recordModel
     * @return
     */
    public static String getChinaRate(RecordModel recordModel){
        String[] names = recordModel.getVrtEName().split("/");
        if (names[0].equals(PropertiesStatic.CHIAN_ENGHLOSH_SHORT)){
            // 是人民币对外币
            // 直接返回price
            return recordModel.getPrice();
        }
        // 是外币对人民币的价格
        // 返回 1 / price 并四舍五入
        double rate = 0;
        try {
            rate = 1 / Double.parseDouble(recordModel.getPrice());
        }catch (Exception e){
            // 转换出错
            rate = 0;
        }
        DecimalFormat df = new DecimalFormat("#.00000");
        return df.format(rate) + "";
    }

    /***
     * 获取外币对人民币的汇率
     * @param recordModel
     * @return
     */
    public static String getRateChina(RecordModel recordModel) {
        String[] names = recordModel.getVrtEName().split("/");
        if (names[1].equals(PropertiesStatic.CHIAN_ENGHLOSH_SHORT)){
            // 是外币对人民币
            // 直接返回price
            return recordModel.getPrice();
        }
        // 是人民币对外币
        double rate = 0;
        try {
            rate = 1 / Double.parseDouble(recordModel.getPrice());
        }catch (Exception e){
            // 转换出错
            rate = 0;
        }
        DecimalFormat df = new DecimalFormat("#.00000");
        return df.format(rate) + "";
    }
}
