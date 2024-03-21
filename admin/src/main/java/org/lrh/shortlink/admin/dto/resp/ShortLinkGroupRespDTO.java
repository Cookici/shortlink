package org.lrh.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.remote.dto.resp
 * @ClassName: ShortLinkGroupRespDTO
 * @Author: 63283
 * @Description: 短链接分组返回实体对象
 * @Date: 2024/3/21 20:58
 */
@Data
public class ShortLinkGroupRespDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 分组排序
     */
    private Integer sortOrder;

    /**
     * 分组下短链接数量
     */
    private Integer shortLinkCount;
}
