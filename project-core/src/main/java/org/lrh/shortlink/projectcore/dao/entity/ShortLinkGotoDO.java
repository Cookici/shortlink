package org.lrh.shortlink.projectcore.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.entity
 * @ClassName: ShortLinkGoto
 * @Author: 63283
 * @Description: 短链接跳转实体
 * @Date: 2024/4/26 下午11:31
 */

@Data
@Builder
@TableName("t_link_goto")
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkGotoDO {

    /**
     * ID
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;
}
