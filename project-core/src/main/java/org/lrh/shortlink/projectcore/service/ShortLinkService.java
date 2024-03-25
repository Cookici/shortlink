package org.lrh.shortlink.projectcore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkCreateReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkCreateRespDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service
 * @ClassName: ShortLinkService
 * @Author: 63283
 * @Description: 短链接接口层
 * @Date: 2024/3/24 22:13
 */

public interface ShortLinkService  extends IService<ShortLinkDO> {

    /**
     * 创建短链接
     *
     * @param requestParam 创建短链接请求参数
     * @return 短链接创建信息
     */
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);
}
