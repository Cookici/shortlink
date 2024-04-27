package org.lrh.shortlink.projectcore.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: RecycleBinSaveReqDTO
 * @Author: 63283
 * @Description: 回收站保存请求对象
 * @Date: 2024/4/27 下午2:45
 */

@Data
public class RecycleBinSaveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;


}
