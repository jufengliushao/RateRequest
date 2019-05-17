package com.rate.raterequest.bean;

/***
 * 国家信息model
 */
public class CountryInfoModel {
    /***
     * id - 编号
     */
    private String id;

    /***
     * country_name - 国家名称 中文
     */
    private String country_name;

    /***
     * money_en - 币种英文简写
     */
    private String money_en;

    /***
     * icon - 国家icon名称
     */
    private String icon;

    /***
     * money_cn - 币种中文名称
     */
    private String money_cn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getMoney_en() {
        return money_en;
    }

    public void setMoney_en(String money_en) {
        this.money_en = money_en;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMoney_cn() {
        return money_cn;
    }

    public void setMoney_cn(String money_cn) {
        this.money_cn = money_cn;
    }

    public CountryInfoModel(String id, String country_name, String money_en, String icon, String money_cn) {
        this.id = id;
        this.country_name = country_name;
        this.money_en = money_en;
        this.icon = icon;
        this.money_cn = money_cn;
    }

    @Override
    public String toString() {
        return "CountryInfoModel{" +
                "id='" + id + '\'' +
                ", country_name='" + country_name + '\'' +
                ", money_en='" + money_en + '\'' +
                ", icon='" + icon + '\'' +
                ", money_cn='" + money_cn + '\'' +
                '}';
    }
}
