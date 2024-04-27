package org.lrh.shortlink.projectcore.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: RecycleBinRemoveReqDTO
 * @Author: 63283
 * @Description: 回收站删除短链接功能
 * @Date: 2024/4/27 下午10:14
 */
@Data
public class RecycleBinRemoveReqDTO {
    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
