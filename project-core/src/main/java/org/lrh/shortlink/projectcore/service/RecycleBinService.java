package org.lrh.shortlink.projectcore.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinSaveReqDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service
 * @ClassName: RecycleBinService
 * @Author: 63283
 * @Description: 回收站管理接口层
 * @Date: 2024/4/27 下午2:48
 */

public interface RecycleBinService extends IService<ShortLinkDO> {
    /**
     * 保存回收站
     * @param requestParam 请求参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);
}
