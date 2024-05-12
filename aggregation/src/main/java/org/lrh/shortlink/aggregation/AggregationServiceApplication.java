package org.lrh.shortlink.aggregation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink
 * @ClassName: aggregation
 * @Author: 63283
 * @Description: 短链接聚合应用
 * @Date: 2024/5/11 下午4:15
 */

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "org.lrh.shortlink.admin",
        "org.lrh.shortlink.projectcore"
})
@MapperScan(value = {
        "org.lrh.shortlink.projectcore.dao.mapper",
        "org.lrh.shortlink.admin.dao.mapper"
})
public class AggregationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}
