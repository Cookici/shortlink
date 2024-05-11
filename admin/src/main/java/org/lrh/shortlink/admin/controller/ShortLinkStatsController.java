package org.lrh.shortlink.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.remote.ShortLinkActualRemoteService;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkGroupStatsAccessRecordReqDTO;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkGroupStatsReqDTO;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkStatsAccessRecordReqDTO;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkStatsReqDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkStatsAccessRecordRespDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkStatsRespDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: ShortLinkStatsController
 * @Author: 63283
 * @Description: 短链接监控控制层
 * @Date: 2024/5/5 下午7:33
 */
@RestController(value = "shortLinkStatsControllerByAdmin")
@RequiredArgsConstructor
public class ShortLinkStatsController {
    private final ShortLinkActualRemoteService shortLinkActualRemoteService;

    /**
     * 访问单个短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/admin/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return shortLinkActualRemoteService.oneShortLinkStats(
                requestParam.getFullShortUrl(),
                requestParam.getGid(),
                requestParam.getEnableStatus(),
                requestParam.getStartDate(),
                requestParam.getEndDate()
        );
    }

    /**
     * 访问分组短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/admin/v1/stats/group")
    public Result<ShortLinkStatsRespDTO> groupShortLinkStats(ShortLinkGroupStatsReqDTO requestParam) {
        return shortLinkActualRemoteService.groupShortLinkStats(
                requestParam.getGid(),
                requestParam.getStartDate(),
                requestParam.getEndDate()
        );
    }

    /**
     * 访问单个短链接指定时间内访问记录监控数据
     */
    @GetMapping("/api/short-link/admin/v1/stats/access-record")
    public Result<Page<ShortLinkStatsAccessRecordRespDTO>> shortLinkStatsAccessRecord(ShortLinkStatsAccessRecordReqDTO requestParam) {
        return shortLinkActualRemoteService.shortLinkStatsAccessRecord(
                requestParam.getFullShortUrl(),
                requestParam.getGid(),
                requestParam.getStartDate(),
                requestParam.getEndDate(),
                requestParam.getEnableStatus(),
                requestParam.getCurrent(),
                requestParam.getSize()
        );
    }

    /**
     * 访问分组短链接指定时间内访问记录监控数据
     */
    @GetMapping("/api/short-link/admin/v1/stats/access-record/group")
    public Result<Page<ShortLinkStatsAccessRecordRespDTO>> groupShortLinkStatsAccessRecord(ShortLinkGroupStatsAccessRecordReqDTO requestParam) {
        return shortLinkActualRemoteService.groupShortLinkStatsAccessRecord(
                requestParam.getGid(),
                requestParam.getStartDate(),
                requestParam.getEndDate(),
                requestParam.getCurrent(),
                requestParam.getSize()
        );
    }

}
