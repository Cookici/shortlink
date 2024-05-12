package org.lrh.shortlink.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.gateway.dto
 * @ClassName: GatewayErrorResult
 * @Author: 63283
 * @Description: 网关错误返回信息
 * @Date: 2024/5/11 下午4:09
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GatewayErrorResult {

    /**
     * HTTP 状态码
     */
    private Integer status;

    /**
     * 返回信息
     */
    private String message;
}

