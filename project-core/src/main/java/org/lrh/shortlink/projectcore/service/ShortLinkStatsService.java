package org.lrh.shortlink.projectcore.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsAccessRecordReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkStatsAccessRecordRespDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkStatsRespDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service
 * @ClassName: ShortLinkStatsService
 * @Author: 63283
 * @Description: 短链接监控接口层
 * @Date: 2024/5/1 上午11:38
 */

public interface ShortLinkStatsService {


    /**
     * 获取单个短链接监控数据
     *
     * @param requestParam 获取短链接监控数据入参
     * @return 短链接监控数据
     */
    ShortLinkStatsRespDTO oneShortLinkStats(ShortLinkStatsReqDTO requestParam);

    /**
     * 访问单个短链接指定时间内访问记录监控数据
     *
     * @param requestParam 获取短链接监控访问记录数据入参
     * @return 访问记录监控数据
     */
    IPage<ShortLinkStatsAccessRecordRespDTO> shortLinkStatsAccessRecord(ShortLinkStatsAccessRecordReqDTO requestParam);



}
