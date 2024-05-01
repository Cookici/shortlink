package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkRecycleBinPageReqDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: ShortLinkMapper
 * @Author: 63283
 * @Description: 短链接持久层
 * @Date: 2024/3/24 22:12
 */

public interface ShortLinkMapper extends BaseMapper<ShortLinkDO> {

    /**
     * 短链接访问统计自增
     * @param gid gid
     * @param fullShortUrl fullShortUrl
     * @param totalPv totalPv
     * @param totalUv totalUv
     * @param totalUip totalUip
     */
    void incrementStats(@Param("gid") String gid,
                        @Param("fullShortUrl") String fullShortUrl,
                        @Param("totalPv") Integer totalPv,
                        @Param("totalUv") Integer totalUv,
                        @Param("totalUip") Integer totalUip);

    /**
     * 分页统计回收站短链接
     * @param requestParam 请求参数
     * @return 分页数据
     */
    IPage<ShortLinkDO> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
