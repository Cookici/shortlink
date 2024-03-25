package org.lrh.shortlink.projectcore.dto.req;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: ShortLinkPageReqDTO
 * @Author: 63283
 * @Description: 短链接分页请求参数
 * @Date: 2024/3/25 14:30
 */
@Data
public class ShortLinkPageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 排序标识
     */
    private String orderTag;
}
