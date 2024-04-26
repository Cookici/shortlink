package org.lrh.shortlink.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.common.convention.result.Results;
import org.lrh.shortlink.admin.remote.ShortLinkActualRemoteService;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkUpdateReqDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: ShortLinkController
 * @Author: 63283
 * @Description: 短链接后管管理层
 * @Date: 2024/3/25 16:06
 */
@RestController(value = "shortLinkControllerByAdmin")
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkActualRemoteService shortLinkActualRemoteService;

    /**
     * 修改短链接
     */
    @PostMapping("/api/short-link/admin/v1/update")
    public Result<Void> updateShortLink(@RequestBody ShortLinkUpdateReqDTO requestParam) {
        shortLinkActualRemoteService.updateShortLink(requestParam);
        return Results.success();
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/admin/v1/page")
    public Result<Page<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam){
        return shortLinkActualRemoteService.pageShortLink(requestParam.getGid(), requestParam.getOrderTag(), requestParam.getCurrent(), requestParam.getSize());
    }

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/admin/v1/create")
    Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam){
        return shortLinkActualRemoteService.createShortLink(requestParam);
    }



}
