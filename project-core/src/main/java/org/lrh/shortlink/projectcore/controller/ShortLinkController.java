package org.lrh.shortlink.projectcore.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.projectcore.common.convention.result.Result;
import org.lrh.shortlink.projectcore.common.convention.result.Results;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkCreateReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkPageReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkCreateRespDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkPageRespDTO;
import org.lrh.shortlink.projectcore.service.ShortLinkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.controller
 * @ClassName: ShortLinkController
 * @Author: 63283
 * @Description: 短链接控制层
 * @Date: 2024/3/24 22:23
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam){
        return Results.success(shortLinkService.pageShortLink(requestParam));
    }


}
