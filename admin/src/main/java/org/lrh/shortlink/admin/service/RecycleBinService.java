package org.lrh.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service
 * @ClassName: RecycleBinService
 * @Author: 63283
 * @Description: URL 回收站接口层
 * @Date: 2024/4/27 下午9:18
 */

public interface RecycleBinService {

    /**
     * 分页查询回收站短链接
     *
     * @param requestParam 请求参数
     * @return 返回参数包装
     */
    Result<Page<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
