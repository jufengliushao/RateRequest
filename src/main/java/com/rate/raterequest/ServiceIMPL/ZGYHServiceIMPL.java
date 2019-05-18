package com.rate.raterequest.ServiceIMPL;

import com.rate.raterequest.DBTool.DataSaving;
import com.rate.raterequest.Service.ZGYHService;
import com.rate.raterequest.bean.CountryInfoModel;
import com.rate.raterequest.bean.WebZGYHDateModel;
import com.rate.raterequest.bean.WebZGYHModel;
import com.rate.raterequest.common.URLCommon;
import com.rate.raterequest.mapper.DataMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Qualifier("zgyhServiceIMPL")
public class ZGYHServiceIMPL implements ZGYHService {

    @Override
    public void getNewRateFromZGYH() {
        Document document;
        List<WebZGYHModel> models = new ArrayList<>();
        try {
            document = Jsoup.connect("http://www.boc.cn/sourcedb/whpj/index.html").userAgent("Mozilla/5.0 (Windows NT 6.1; rv:5.0)").get();

            Element element = document.body().getElementsByClass("publish").last(); // 获取父节点的div
            Element table = element.select("table").last();
            Elements trs = table.select("tr");
            for(Element e : trs){
                Elements es = e.select("td");
                WebZGYHModel m = settingBeanData(es);
                models.add(m);
            }
            DataSaving dataSaving = new DataSaving();
            dataSaving.saving_zgyh_rate(models, this);
        }catch (Exception e){
            System.out.println("get html failed");
            return;
        }

    }

    /***
     * 设置model
     * @param tds
     * @return
     */
    private WebZGYHModel settingBeanData(Elements tds) {
        if (tds.size() == 0){
            return null;
        }
        WebZGYHModel model = new WebZGYHModel();
        List<String> list = new ArrayList<>();
        for(Element l : tds){
            list.add(l.text());
        }
        model.setMoneyName(list.get(0));
        model.setXhBuyRate(list.get(1));
        model.setMoneyBuyRate(list.get(2));
        model.setXhCellRate(list.get(3));
        model.setMoneySellRate(list.get(4));
        model.setZhRate(list.get(5));
        model.setAnnounceDate(list.get(6));
        model.setAnnounceTime(list.get(7));
        return model;
    }

    @Autowired
    private DataMapper dataMapper;

    @Override
    public CountryInfoModel getCountryInfo(String moneyName, String tableName) {
        return dataMapper.getCountryInfoZGYH(moneyName, tableName);
    }

    @Override
    public void saveDateInfo(WebZGYHDateModel date, String tableName) {
        dataMapper.saveZGYHDateInfo(date.getDate(), date.getTime(), tableName);
    }

    @Override
    public WebZGYHDateModel getLastDateInfo(String tableName) {
        return dataMapper.getZGYHTimeLast(tableName);
    }

    @Override
    public void insertRateInfo(WebZGYHModel model, int country_id, int time_id, String tableName) {
        dataMapper.saveZGYHRateInfo(model.getXhBuyRate(),
                                    model.getXhCellRate(),
                                    model.getMoneyBuyRate(),
                                    model.getMoneySellRate(),
                                    model.getZhRate(),
                                    country_id, time_id, tableName);
    }
}


