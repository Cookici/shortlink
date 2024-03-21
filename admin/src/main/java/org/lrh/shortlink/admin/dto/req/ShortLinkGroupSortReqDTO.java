package org.lrh.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.req
 * @ClassName: ShortLinkGroupSortReqDTO
 * @Author: 63283
 * @Description: 短链接分组排序参数
 * @Date: 2024/3/21 21:28
 */

@Data
public class ShortLinkGroupSortReqDTO {
    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
