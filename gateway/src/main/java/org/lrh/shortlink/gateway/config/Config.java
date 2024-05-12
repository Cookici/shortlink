package org.lrh.shortlink.gateway.config;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.gateway.config
 * @ClassName: Config
 * @Author: 63283
 * @Description: 过滤器配置
 * @Date: 2024/5/11 下午4:08
 */

@Data
public class Config {

    /**
     * 白名单前置路径
     */
    private List<String> whitePathList;
}
