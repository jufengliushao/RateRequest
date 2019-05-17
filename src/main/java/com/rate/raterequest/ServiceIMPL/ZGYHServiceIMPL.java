package com.rate.raterequest.ServiceIMPL;

import com.rate.raterequest.Service.ZGYHService;
import com.rate.raterequest.common.URLCommon;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("zgyhServiceIMPL")
public class ZGYHServiceIMPL implements ZGYHService {

    @Override
    public void getNewRateFromZGYH() {
        Document document;
        try {
            document = Jsoup.connect(URLCommon.ZGYH_URL).get();
            Element element = document.body().getElementsByClass("publish").last(); // 获取父节点的div
            System.out.println(element);
        }catch (Exception e){
            System.out.println("get html failed");
            return;
        }
        String title = document.title();
        System.out.println(title);
    }
}
