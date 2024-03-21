package org.lrh.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.req
 * @ClassName: ShortLinkGroupSaveReqDTO
 * @Author: 63283
 * @Description: 短链接分组创建参数
 * @Date: 2024/3/21 20:24
 */
@Data
public class ShortLinkGroupSaveReqDTO {


    /**
     * 分组名
     */
    private String name;

}
