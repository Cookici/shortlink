package org.lrh.shortlink.projectcore.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.projectcore.common.convention.result.Result;
import org.lrh.shortlink.projectcore.common.convention.result.Results;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkGroupStatsAccessRecordReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkGroupStatsReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsAccessRecordReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkStatsAccessRecordRespDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkStatsRespDTO;
import org.lrh.shortlink.projectcore.service.ShortLinkStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.controller
 * @ClassName: ShortLinkStatsController
 * @Author: 63283
 * @Description: 短链接监控控制层
 * @Date: 2024/5/1 上午11:37
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkStatsController {

    private final ShortLinkStatsService shortLinkStatsService;

    /**
     * 访问单个短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/v1/stats")
    public Result<ShortLinkStatsRespDTO> shortLinkStats(ShortLinkStatsReqDTO requestParam) {
        return Results.success(shortLinkStatsService.oneShortLinkStats(requestParam));
    }

    /**
     * 访问分组短链接指定时间内监控数据
     */
    @GetMapping("/api/short-link/v1/stats/group")
    public Result<ShortLinkStatsRespDTO> groupShortLinkStats(ShortLinkGroupStatsReqDTO requestParam) {
        return Results.success(shortLinkStatsService.groupShortLinkStats(requestParam));
    }

    /**
     * 访问单个短链接指定时间内访问记录监控数据
     */
    @GetMapping("/api/short-link/v1/stats/access-record")
    public Result<IPage<ShortLinkStatsAccessRecordRespDTO>> shortLinkStatsAccessRecord(ShortLinkStatsAccessRecordReqDTO requestParam) {
        return Results.success(shortLinkStatsService.shortLinkStatsAccessRecord(requestParam));
    }

    /**
     * 访问分组短链接指定时间内访问记录监控数据
     */
    @GetMapping("/api/short-link/v1/stats/access-record/group")
    public Result<IPage<ShortLinkStatsAccessRecordRespDTO>> groupShortLinkStatsAccessRecord(ShortLinkGroupStatsAccessRecordReqDTO requestParam) {
        return Results.success(shortLinkStatsService.groupShortLinkStatsAccessRecord(requestParam));
    }

}
