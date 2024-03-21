package org.lrh.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.req
 * @ClassName: UserLoginReqDTO
 * @Author: 63283
 * @Description: 用户登录请求参数
 * @Date: 2024/3/18 16:25
 */
@Data
public class UserLoginReqDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
