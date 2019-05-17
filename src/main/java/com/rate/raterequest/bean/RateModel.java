package com.rate.raterequest.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/***
 * 请求的主类
 */
public class RateModel {

    @JSONField(name = "head")
    private HeaderModel header;
    private DataModel data;
    private List<RecordModel> records;

    public RateModel(HeaderModel header, DataModel data, List<RecordModel> records) {
        this.header = header;
        this.data = data;
        this.records = records;
    }

    public RateModel() {
    }

    public HeaderModel getHeader() {
        return header;
    }

    public void setHeader(HeaderModel header) {
        this.header = header;
    }

    public DataModel getData() {
        return data;
    }

    public void setData(DataModel data) {
        this.data = data;
    }

    public List<RecordModel> getRecords() {
        return records;
    }

    public void setRecords(List<RecordModel> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "RateModel{" +
                "header=" + header +
                ", data=" + data +
                ", records=" + records +
                '}';
    }
}
