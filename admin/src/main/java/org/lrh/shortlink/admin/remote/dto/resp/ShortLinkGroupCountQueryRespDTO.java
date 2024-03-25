package org.lrh.shortlink.admin.remote.dto.resp;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.resp
 * @ClassName: ShortLinkCroupCountQueryDTO
 * @Author: 63283
 * @Description: 短链接分组查询返回参数
 * @Date: 2024/3/25 17:04
 */
@Data
public class ShortLinkGroupCountQueryRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 短链接数量
     */
    private Integer shortLinkCount;

}
