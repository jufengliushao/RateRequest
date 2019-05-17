package com.rate.raterequest.bean;


import java.beans.Transient;

public class DataModel {

    private String id;
    private String lastDateEn;
    private String lastDate;
    private String ts;


    public DataModel(String id, String lastDateEn, String lastDate, String ts) {
        this.id = id;
        this.lastDateEn = lastDateEn;
        this.lastDate = lastDate;
        this.ts = ts;
    }

    public String getLastDateEn() {
        return lastDateEn;
    }

    public void setLastDateEn(String lastDateEn) {
        this.lastDateEn = lastDateEn;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "id='" + id + '\'' +
                ", lastDateEn='" + lastDateEn + '\'' +
                ", lastDate='" + lastDate + '\'' +
                ", ts='" + ts + '\'' +
                '}';
    }
}
