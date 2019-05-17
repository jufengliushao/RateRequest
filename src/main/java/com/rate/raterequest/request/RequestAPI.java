package com.rate.raterequest.request;

import com.alibaba.fastjson.JSON;
import com.rate.raterequest.bean.RateModel;
import com.rate.raterequest.common.URLCommon;

/**
 * 请求类
 */
public class RequestAPI {

    /***
     * 请求中国人民银行的数据
     */
    public RateModel request_rmyh_rate(HttpAPIService httpAPIService) {
        RateModel rateModel;
        String str = null;
        try {
            str = httpAPIService.doGet(URLCommon.RMYH_URL);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        rateModel = JSON.parseObject(str, RateModel.class);
        return rateModel;
    }

    public void request_rmyh(HttpAPIService httpAPIService) {
        String str = null;
        try {
            str = httpAPIService.doGet("http://www.boc.cn/sourcedb/whpj/");
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str);
    }


    public RequestAPI() {
    }
}
