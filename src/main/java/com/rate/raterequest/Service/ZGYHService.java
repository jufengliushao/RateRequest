package com.rate.raterequest.Service;

/***
 * 中国银行汇率处理
 */
public interface ZGYHService {
    /***
     * 从中国银行获取新的数据
     */
    public void getNewRateFromZGYH();
}
