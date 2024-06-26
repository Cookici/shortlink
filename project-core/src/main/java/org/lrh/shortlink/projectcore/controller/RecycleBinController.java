package org.lrh.shortlink.projectcore.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.projectcore.common.convention.result.Result;
import org.lrh.shortlink.projectcore.common.convention.result.Results;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinRecoverReqDTO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinRemoveReqDTO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinSaveReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkPageRespDTO;
import org.lrh.shortlink.projectcore.service.RecycleBinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.controller
 * @ClassName: RecycleBinController
 * @Author: 63283
 * @Description: 回收站控制层
 * @Date: 2024/4/27 下午2:43
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    private final RecycleBinService recycleBinService;

    /**
     * 短链接移至回收站
     * @param requestParam 请求参数
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     * @param requestParam 请求参数
     * @return 分页数据
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam){
        return Results.success(recycleBinService.pageRecycleBinShortLink(requestParam));
    }

    /**
     * 恢复短链接
     * @param requestParam 请求参数
     * @return void
     */
    @PostMapping("/api/short-link/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody RecycleBinRecoverReqDTO requestParam){
        recycleBinService.recoverRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 删除回收站短链接
     * @param requestParam 请求参数
     * @return void
     */
    @PostMapping("/api/short-link/v1/recycle-bin/remove")
    public Result<Void> removeRecycleBin(@RequestBody RecycleBinRemoveReqDTO requestParam){
        recycleBinService.removeRecycleBin(requestParam);
        return Results.success();
    }



}
