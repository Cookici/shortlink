package org.lrh.shortlink.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin
 * @ClassName: ShortLinkAdminApplication
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/18 14:08
 */
@SpringBootApplication
@MapperScan("org.lrh.shortlink.admin.dao.mapper")
public class ShortLinkAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminApplication.class,args);
    }
}

