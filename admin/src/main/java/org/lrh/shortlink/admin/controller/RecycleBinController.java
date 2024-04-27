package org.lrh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.common.convention.result.Results;
import org.lrh.shortlink.admin.remote.ShortLinkActualRemoteService;
import org.lrh.shortlink.admin.remote.dto.req.RecycleBinSaveReqDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: RecycleBinController
 * @Author: 63283
 * @Description: 回收站控制层
 * @Date: 2024/4/27 下午2:58
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {
    private final ShortLinkActualRemoteService shortLinkActualRemoteService;

    /**
     * 短链接移至回收站
     *
     * @param requestParam 请求参数
     * @return void
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        shortLinkActualRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }
}
