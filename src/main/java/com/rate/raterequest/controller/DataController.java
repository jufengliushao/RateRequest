package com.rate.raterequest.controller;

import com.rate.raterequest.Service.RMYHService;
import com.rate.raterequest.Service.ZGYHService;
import com.rate.raterequest.bean.RateModel;
import com.rate.raterequest.bean.ResponseModel;
import com.rate.raterequest.request.HttpAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableScheduling
@RequestMapping("/rate")
public class DataController {
    @Autowired
    @Qualifier("rmyhServiceIMPL")
    private RMYHService rmyhService; // 人民银行的相关操作

    @Autowired
    @Qualifier("zgyhServiceIMPL")
    private ZGYHService zgyhService; // 中国银行相关操作

    @Autowired
    private HttpAPIService httpAPIService;

    @RequestMapping("/test")
    public String test(){
        System.out.println("success");
        return "success";
    }

    @RequestMapping("/requestNewData")
    @Scheduled(cron = "0 16 9 ? * * ") // 每天上午9:16分触发
    public ResponseModel requestData() {
        RateModel rateModel = rmyhService.getNewDatas(httpAPIService);
        ResponseModel responseModel;
        if (rateModel == null){
            responseModel = new ResponseModel(201, "get new data fail");
        }
        responseModel = new ResponseModel(200, "success");
        return responseModel;
    }

    /***
     * 获取中国银行的数据
     * @return
     */
    @RequestMapping("/getZGYHRate")
    public String requestZGYH() {
        zgyhService.getNewRateFromZGYH();
        return "success";
    }


}
