package org.lrh.shortlink.projectcore.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.resp
 * @ClassName: ShortLinkCreateRespDTO
 * @Author: 63283
 * @Description: 短链接创建响应对象
 * @Date: 2024/3/24 22:28
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkCreateRespDTO {

    /**
     * 分组信息
     */
    private String gid;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 短链接
     */
    private String fullShortUrl;
}
