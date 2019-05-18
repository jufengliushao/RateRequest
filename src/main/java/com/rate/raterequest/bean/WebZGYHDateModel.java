package com.rate.raterequest.bean;

/***
 * 中国银行的汇率时间戳
 */
public class WebZGYHDateModel {
    private int id;
    private String date;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public WebZGYHDateModel(int id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "WebZGYHDateModel{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public WebZGYHDateModel() {
    }
}
