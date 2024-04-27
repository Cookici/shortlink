package org.lrh.shortlink.projectcore.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.projectcore.common.convention.result.Result;
import org.lrh.shortlink.projectcore.common.convention.result.Results;
import org.lrh.shortlink.projectcore.service.UrlTitleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.controller
 * @ClassName: UrlTitleController
 * @Author: 63283
 * @Description: URL 标题控制层
 * @Date: 2024/4/27 下午1:57
 */
@RestController
@RequiredArgsConstructor
public class UrlTitleController {

    private final UrlTitleService urlTitleService;

    /**
     * 根据URL获取网站标题
     * @param url 网站url
     */
    @GetMapping("/api/short-link/title")
    public Result<String> getTitleByUrl(@RequestParam("url") String url) {
        return Results.success(urlTitleService.getUrlTitle(url));
    }


}

