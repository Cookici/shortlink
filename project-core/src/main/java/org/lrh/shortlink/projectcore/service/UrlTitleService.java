package org.lrh.shortlink.projectcore.service;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service
 * @ClassName: UrlTitleService
 * @Author: 63283
 * @Description: URL 标题接口层
 * @Date: 2024/4/27 下午1:59
 */

public interface UrlTitleService {

    /**
     * 根据Url获取标题
     * @param url 网站url地址
     * @return 网站标题
     */
    String getUrlTitle(String url);

}
