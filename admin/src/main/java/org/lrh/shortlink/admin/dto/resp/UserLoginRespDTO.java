package org.lrh.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.dto.resp
 * @ClassName: UserLoginRespDTO
 * @Author: 63283
 * @Description: 用户登录接口返回响应
 * @Date: 2024/3/18 16:23
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRespDTO {

    /**
     * 用户Token
     */
    private String token;
}