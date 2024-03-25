package org.lrh.shortlink.projectcore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore
 * @ClassName: ShortLinkProjectCoreApplication
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/18 14:09
 */
@SpringBootApplication
@MapperScan("org.lrh.shortlink.projectcore.dao.mapper")
public class ShortLinkProjectCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkProjectCoreApplication.class, args);
    }
}
