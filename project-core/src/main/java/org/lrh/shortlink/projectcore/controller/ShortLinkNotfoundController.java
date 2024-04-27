package org.lrh.shortlink.projectcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.controller
 * @ClassName: ShortLinkNotfoundController
 * @Author: 63283
 * @Description: 短链接不存在跳转控制器
 * @Date: 2024/4/27 下午1:46
 */
@Controller
public class ShortLinkNotfoundController {

    /**
     * 短链接不存在跳转页面
     * @return /templates/notfound.html
     */
    @RequestMapping("/page/notfound")
    public String notfound() {
        return "notfound";
    }
}
