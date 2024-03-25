package org.lrh.shortlink.projectcore.common.database;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.common.database
 * @ClassName: BaseDO
 * @Author: 63283
 * @Description: 数据库持久层对象基础属性
 * @Date: 2024/3/24 22:11
 */
@Data
public class BaseDO {
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标识 0：未删除 1：已删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}
