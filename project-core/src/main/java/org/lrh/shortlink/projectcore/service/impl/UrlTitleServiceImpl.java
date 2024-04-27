package org.lrh.shortlink.projectcore.service.impl;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.lrh.shortlink.projectcore.service.UrlTitleService;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;


/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service.impl
 * @ClassName: UrlTitleServiceImpl
 * @Author: 63283
 * @Description: URL 标题接口实现层
 * @Date: 2024/4/27 下午1:59
 */
@Service
public class UrlTitleServiceImpl implements UrlTitleService {

    @SneakyThrows
    @Override
    public String getUrlTitle(String url) {
        HttpURLConnection connection = null;
        try {
            URL targetUrl = new URL(url);
            connection = (HttpURLConnection) targetUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Document document = Jsoup.connect(url).get();
                return document.title();
            }
            return "Error while fetching url title.";
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}
