package org.lrh.shortlink.projectcore.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: ShortLinkGroupStatsReqDTO
 * @Author: 63283
 * @Description: 分组短链接监控请求参数
 * @Date: 2024/5/11 下午1:29
 */

@Data
public class ShortLinkGroupStatsReqDTO {

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
}
