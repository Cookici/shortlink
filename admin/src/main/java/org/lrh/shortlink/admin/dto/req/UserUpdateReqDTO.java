package org.lrh.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.req
 * @ClassName: UserUpdateReqDTO
 * @Author: 63283
 * @Description: 用户注册请求参数
 * @Date: 2024/3/18 16:24
 */
@Data
public class UserUpdateReqDTO {
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
}
