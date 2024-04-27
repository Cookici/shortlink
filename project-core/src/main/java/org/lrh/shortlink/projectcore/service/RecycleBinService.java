package org.lrh.shortlink.projectcore.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinRecoverReqDTO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinRemoveReqDTO;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinSaveReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkPageRespDTO;

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

    /**
     * 分页查询回收站短链接
     * @param requestParam 回收站请求参数
     * @return 回收站分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);

    /**
     * 恢复短链接
     * @param requestParam 请求参数
     */
    void recoverRecycleBin(RecycleBinRecoverReqDTO requestParam);

    /**
     * 删除回收站短链接
     * @param requestParam 请求参数
     */
    void removeRecycleBin(RecycleBinRemoveReqDTO requestParam);
}
