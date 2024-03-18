package org.lrh.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.resp
 * @ClassName: UserActualRespDTO
 * @Author: 63283
 * @Description: 用户返回参数响应
 * @Date: 2024/3/18 15:38
 */
@Data
public class UserActualRespDTO {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

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
