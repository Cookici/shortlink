package org.lrh.shortlink.projectcore.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: ShortLinkRecycleBinPageReqDTO
 * @Author: 63283
 * @Description: 回收站短链接分页请求参数
 * @Date: 2024/4/27 下午6:46
 */
@Data
public class ShortLinkRecycleBinPageReqDTO extends Page<ShortLinkDO> {
    /**
     * 分组标识
     */
    private List<String> gidList;
}
