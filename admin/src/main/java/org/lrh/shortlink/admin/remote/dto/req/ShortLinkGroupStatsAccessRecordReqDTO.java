package org.lrh.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.remote.dto.req
 * @ClassName: ShortLinkGroupStatsAccessRecordReqDTO
 * @Author: 63283
 * @Description: 分组短链接监控访问记录请求参数
 * @Date: 2024/5/11 下午2:36
 */

@Data
public class ShortLinkGroupStatsAccessRecordReqDTO extends Page {

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
