package org.lrh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.remote.ShortLinkActualRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: UrlTitleController
 * @Author: 63283
 * @Description: URL 标题控制层
 * @Date: 2024/4/27 下午2:13
 */
@RestController
@RequiredArgsConstructor
public class UrlTitleController {

    private final ShortLinkActualRemoteService shortLinkActualRemoteService;

    /**
     * 根据URL获取网站标题
     * @param url 网站url
     */
    @GetMapping("/api/short-link/admin/v1/title")
    public Result<String> getTitleByUrl(@RequestParam("url") String url) {
        return shortLinkActualRemoteService.getTitleByUrl(url);
    }

}
