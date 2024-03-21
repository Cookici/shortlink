package org.lrh.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.lrh.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.resp
 * @ClassName: UserRespDTO
 * @Author: 63283
 * @Description: 用户返回参数响应
 * @Date: 2024/3/18 14:46
 */
@Data
public class UserRespDTO {
    /**
     * ID
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
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
