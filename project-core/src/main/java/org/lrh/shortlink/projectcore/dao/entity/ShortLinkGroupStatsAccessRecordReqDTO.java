package org.lrh.shortlink.projectcore.dao.entity;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.entity
 * @ClassName: ShortLinkGroupStatsAccessRecordReqDTO
 * @Author: 63283
 * @Description: 分组短链接监控访问记录请求参数
 * @Date: 2024/5/11 下午2:09
 */

@Data
public class ShortLinkGroupStatsAccessRecordReqDTO extends Page<LinkAccessLogsDO> {

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

