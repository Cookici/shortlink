package org.lrh.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.lrh.shortlink.admin.common.database.BaseDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dao.entity
 * @ClassName: UserDO
 * @Author: 63283
 * @Description: 用户持久类实体
 * @Date: 2024/3/18 14:37
 */
@Data
@TableName("t_user")
public class UserDO extends BaseDO {

    /**
     * ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;

}
