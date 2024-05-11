package org.lrh.shortlink.projectcore.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.common.config
 * @ClassName: GotoDomainWhiteListConfiguration
 * @Author: 63283
 * @Description: 跳转域名白名单配置文件
 * @Date: 2024/4/7 21:59
 */
@Data
@Component
@ConfigurationProperties(prefix = "short-link.goto-domain.white-list")
public class GotoDomainWhiteListConfiguration {
    /**
     * 是否开启跳转原始链接域名白名单验证
     */
    private Boolean enable;

    /**
     * 跳转原始域名白名单网站名称集合
     */
    private String names;

    /**
     * 可跳转的原始链接域名
     */
    private List<String> details;
}
