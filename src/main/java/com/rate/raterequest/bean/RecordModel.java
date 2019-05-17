package com.rate.raterequest.bean;

import com.alibaba.fastjson.annotation.JSONField;

/***
 * 具体数据参数模型
 */
public class RecordModel {
    @JSONField(name = "vrtCode")
    private String vrtCode; // 当前的标号

    @JSONField(name = "price")
    private String price; // 价格

    @JSONField(name = "bp")
    private String bp; // 浮动 绝对值 - 需要参考bpDouble

    @JSONField(name = "vrtName")
    private String vrtName; // 中文名

    @JSONField(name = "vrtEName")
    private String vrtEName; // 英文标号

    @JSONField(name = "bpDouble")
    private String bpDouble; // 带符号的数据

    @JSONField(name = "foreignCName")
    private String foreignCName; // 英文缩写

    @JSONField(name = "approvedTime")
    private String approvedTime; // 版本

    @JSONField(name = "approvedTimeEn")
    private String approvedTimeEn; // 版本

    @JSONField(name = "showDate")
    private String showDate; // 版本

    @JSONField(name = "showDateForCn")
    private String showDateForCn; // 版本

    @JSONField(name = "lastMonthAvgPrice")
    private String lastMonthAvgPrice; // 版本

    @JSONField(name = "monthPrice")
    private String monthPrice; // 版本

    @JSONField(name = "quarterPrice")
    private String quarterPrice; // 版本

    @JSONField(name = "yearPrice")
    private String yearPrice; // 版本

    @JSONField(name = "isShowBp")
    private String isShowBp; // 版本

    @JSONField(name = "show")
    private String show; // 版本

    @JSONField(name = "bannerPic")
    private String bannerPic; // 版本

    @JSONField(name = "bannerCss")
    private String bannerCss; // 版本



    public String getVrtCode() {
        return vrtCode;
    }

    public void setVrtCode(String vrtCode) {
        this.vrtCode = vrtCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getVrtName() {
        return vrtName;
    }

    public void setVrtName(String vrtName) {
        this.vrtName = vrtName;
    }

    public String getVrtEName() {
        return vrtEName;
    }

    public void setVrtEName(String vrtEName) {
        this.vrtEName = vrtEName;
    }

    public String getBpDouble() {
        return bpDouble;
    }

    public void setBpDouble(String bpDouble) {
        this.bpDouble = bpDouble;
    }

    public String getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getApprovedTimeEn() {
        return approvedTimeEn;
    }

    public void setApprovedTimeEn(String approvedTimeEn) {
        this.approvedTimeEn = approvedTimeEn;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowDateForCn() {
        return showDateForCn;
    }

    public void setShowDateForCn(String showDateForCn) {
        this.showDateForCn = showDateForCn;
    }

    public String getLastMonthAvgPrice() {
        return lastMonthAvgPrice;
    }

    public void setLastMonthAvgPrice(String lastMonthAvgPrice) {
        this.lastMonthAvgPrice = lastMonthAvgPrice;
    }

    public String getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(String monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String getQuarterPrice() {
        return quarterPrice;
    }

    public void setQuarterPrice(String quarterPrice) {
        this.quarterPrice = quarterPrice;
    }

    public String getYearPrice() {
        return yearPrice;
    }

    public void setYearPrice(String yearPrice) {
        this.yearPrice = yearPrice;
    }

    public String getIsShowBp() {
        return isShowBp;
    }

    public void setIsShowBp(String isShowBp) {
        this.isShowBp = isShowBp;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getBannerPic() {
        return bannerPic;
    }

    public void setBannerPic(String bannerPic) {
        this.bannerPic = bannerPic;
    }

    public String getBannerCss() {
        return bannerCss;
    }

    public void setBannerCss(String bannerCss) {
        this.bannerCss = bannerCss;
    }

    public String getForeignCName() {
        return foreignCName;
    }

    public void setForeignCName(String foreignCName) {
        this.foreignCName = foreignCName;
    }

    public RecordModel(String vrtCode, String price, String bp, String vrtName, String vrtEName, String bpDouble, String foreignCName, String approvedTime, String approvedTimeEn, String showDate, String showDateForCn, String lastMonthAvgPrice, String monthPrice, String quarterPrice, String yearPrice, String isShowBp, String show, String bannerPic, String bannerCss) {
        this.vrtCode = vrtCode;
        this.price = price;
        this.bp = bp;
        this.vrtName = vrtName;
        this.vrtEName = vrtEName;
        this.bpDouble = bpDouble;
        this.foreignCName = foreignCName;
        this.approvedTime = approvedTime;
        this.approvedTimeEn = approvedTimeEn;
        this.showDate = showDate;
        this.showDateForCn = showDateForCn;
        this.lastMonthAvgPrice = lastMonthAvgPrice;
        this.monthPrice = monthPrice;
        this.quarterPrice = quarterPrice;
        this.yearPrice = yearPrice;
        this.isShowBp = isShowBp;
        this.show = show;
        this.bannerPic = bannerPic;
        this.bannerCss = bannerCss;
    }

    @Override
    public String toString() {
        return "RecordModel{" +
                "vrtCode='" + vrtCode + '\'' +
                ", price='" + price + '\'' +
                ", bp='" + bp + '\'' +
                ", vrtName='" + vrtName + '\'' +
                ", vrtEName='" + vrtEName + '\'' +
                ", bpDouble='" + bpDouble + '\'' +
                ", foreignCName='" + foreignCName + '\'' +
                ", approvedTime='" + approvedTime + '\'' +
                ", approvedTimeEn='" + approvedTimeEn + '\'' +
                ", showDate='" + showDate + '\'' +
                ", showDateForCn='" + showDateForCn + '\'' +
                ", lastMonthAvgPrice='" + lastMonthAvgPrice + '\'' +
                ", monthPrice='" + monthPrice + '\'' +
                ", quarterPrice='" + quarterPrice + '\'' +
                ", yearPrice='" + yearPrice + '\'' +
                ", isShowBp='" + isShowBp + '\'' +
                ", show='" + show + '\'' +
                ", bannerPic='" + bannerPic + '\'' +
                ", bannerCss='" + bannerCss + '\'' +
                '}';
    }
}
