package com.rate.raterequest.bean;

import com.alibaba.fastjson.annotation.JSONField;

/***
 * 汇率请求头
 * 需要的是时间戳
 */

public class HeaderModel {
    @JSONField(name = "version")
    private String version; // 版本

    @JSONField(name = "provider")
    private String provider;

    @JSONField(name = "req_code")
    private String req_code;

    @JSONField(name = "rep_code")
    private String rep_code;

    @JSONField(name = "rep_message")
    private String rep_message;

    @JSONField(name = "ts")
    private String ts; // 时间戳

    @JSONField(name = "producer")
    private String producer;

    public String getVersion() {
        return version;
    }

    public HeaderModel(String version, String provider, String req_code, String rep_code, String rep_message, String ts, String producer) {
        this.version = version;
        this.provider = provider;
        this.req_code = req_code;
        this.rep_code = rep_code;
        this.rep_message = rep_message;
        this.ts = ts;
        this.producer = producer;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getReq_code() {
        return req_code;
    }

    public void setReq_code(String req_code) {
        this.req_code = req_code;
    }

    public String getRep_code() {
        return rep_code;
    }

    public void setRep_code(String rep_code) {
        this.rep_code = rep_code;
    }

    public String getRep_message() {
        return rep_message;
    }

    public void setRep_message(String rep_message) {
        this.rep_message = rep_message;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "HeaderModel{" +
                "version='" + version + '\'' +
                ", provider='" + provider + '\'' +
                ", req_code='" + req_code + '\'' +
                ", rep_code='" + rep_code + '\'' +
                ", rep_message='" + rep_message + '\'' +
                ", ts='" + ts + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
