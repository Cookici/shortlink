package org.lrh.shortlink.admin.common.config;

import org.lrh.shortlink.admin.common.biz.user.UserTransmitFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.biz.user
 * @ClassName: UserConfiguration
 * @Author: 63283
 * @Description: 用户配置自动装配
 * @Date: 2024/3/21 21:06
 */
@Configuration
public class UserConfiguration {
    /**
     * 用户信息传递过滤器
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter() {
        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransmitFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(0);
        return registration;
    }
}
