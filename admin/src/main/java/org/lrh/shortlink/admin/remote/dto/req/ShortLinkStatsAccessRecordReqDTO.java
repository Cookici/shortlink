package org.lrh.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: ShortLinkStatsAccessRecordReqDTO
 * @Author: 63283
 * @Description: 短链接监控访问记录请求参数
 * @Date: 2024/5/1 上午11:35
 */
@Data
public class ShortLinkStatsAccessRecordReqDTO extends Page {

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 开始日期
     */
    private String startDate;

    /**
     * 结束日期
     */
    private String endDate;

    /**
     * 启用标识 0：启用 1：未启用
     */
    private Integer enableStatus;
}
