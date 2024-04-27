package org.lrh.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.remote.dto.req
 * @ClassName: ShortLinkRecycleBinPageReqDTO
 * @Author: 63283
 * @Description: 回收站短链接分页请求参数
 * @Date: 2024/4/27 下午9:16
 */

@Data
public class ShortLinkRecycleBinPageReqDTO extends Page {
    /**
     * 分组标识
     */
    private List<String> gidList;
}
