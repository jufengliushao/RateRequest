package com.rate.raterequest.bean;

/***
 * 中国银行的model
 */
public class WebZGYHModel {
    /**
     * 货币名字
     */
    private String moneyName;

    /**
     * 现汇买入价
     */
    private String xhBuyRate;

    /***
     * 现钞买入价
     */
    private String moneyBuyRate;

    /***
     * 现钞卖出价
     */
    private String moneySellRate;

    /***
     * 现汇卖出价
     */
    private String xhCellRate;

    /***
     * 中行折算价
     */
    private String zhRate;

    /***
     * 发布日期
     */
    private String announceDate;

    /***
     * 发布时间
     */
    private String announceTime;

    public String getMoneyName() {
        return moneyName;
    }

    public void setMoneyName(String moneyName) {
        this.moneyName = moneyName;
    }

    public String getXhBuyRate() {
        return xhBuyRate;
    }

    public void setXhBuyRate(String xhBuyRate) {
        this.xhBuyRate = xhBuyRate;
    }

    public String getMoneyBuyRate() {
        return moneyBuyRate;
    }

    public void setMoneyBuyRate(String moneyBuyRate) {
        this.moneyBuyRate = moneyBuyRate;
    }

    public String getMoneySellRate() {
        return moneySellRate;
    }

    public void setMoneySellRate(String moneySellRate) {
        this.moneySellRate = moneySellRate;
    }

    public String getXhCellRate() {
        return xhCellRate;
    }

    public void setXhCellRate(String xhCellRate) {
        this.xhCellRate = xhCellRate;
    }

    public String getZhRate() {
        return zhRate;
    }

    public void setZhRate(String zhRate) {
        this.zhRate = zhRate;
    }

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }

    public String getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(String announceTime) {
        this.announceTime = announceTime;
    }

    public WebZGYHModel(String moneyName, String xhBuyRate, String moneyBuyRate, String moneySellRate, String xhCellRate, String zhRate, String announceDate, String announceTime) {
        this.moneyName = moneyName;
        this.xhBuyRate = xhBuyRate;
        this.moneyBuyRate = moneyBuyRate;
        this.moneySellRate = moneySellRate;
        this.xhCellRate = xhCellRate;
        this.zhRate = zhRate;
        this.announceDate = announceDate;
        this.announceTime = announceTime;
    }

    public WebZGYHModel() {
    }

    @Override
    public String toString() {
        return "WebZGYHModel{" +
                "moneyName='" + moneyName + '\'' +
                ", xhBuyRate='" + xhBuyRate + '\'' +
                ", moneyBuyRate='" + moneyBuyRate + '\'' +
                ", moneySellRate='" + moneySellRate + '\'' +
                ", xhCellRate='" + xhCellRate + '\'' +
                ", zhRate='" + zhRate + '\'' +
                ", announceDate='" + announceDate + '\'' +
                ", announceTime='" + announceTime + '\'' +
                '}';
    }
}
