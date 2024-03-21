package org.lrh.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lrh.shortlink.admin.common.database.BaseDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dao.entity
 * @ClassName: GroupDO
 * @Author: 63283
 * @Description: 短链接分组实体
 * @Date: 2024/3/21 20:05
 */
@Data
@TableName("t_group")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDO extends BaseDO {
    /**
     * id
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 创建分组用户名
     */
    private String username;

    /**
     * 分组排序
     */
    private Integer sortOrder;
}
