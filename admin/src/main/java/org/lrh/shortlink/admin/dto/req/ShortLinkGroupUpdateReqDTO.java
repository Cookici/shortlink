package org.lrh.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.req
 * @ClassName: ShortLinkGroupUpdateReqDTO
 * @Author: 63283
 * @Description: 短链接分组修改参数
 * @Date: 2024/3/21 21:21
 */
@Data
public class ShortLinkGroupUpdateReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
