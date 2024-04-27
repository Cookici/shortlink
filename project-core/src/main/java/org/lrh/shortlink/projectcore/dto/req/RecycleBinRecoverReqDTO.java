package org.lrh.shortlink.projectcore.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: RecycleBinRecoverReqDTO
 * @Author: 63283
 * @Description: 回收站恢复功能
 * @Date: 2024/4/27 下午9:53
 */
@Data
public class RecycleBinRecoverReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
