package org.lrh.shortlink.admin.common.constant;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.constant
 * @ClassName: RedisCacheConstant
 * @Author: 63283
 * @Description: 短链接后管 Redis 缓存常量类
 * @Date: 2024/3/18 16:27
 */

public class RedisCacheConstant {
    /**
     * 用户注册分布式锁
     */
    public static final String LOCK_USER_REGISTER_KEY = "short-link:lock_user-register:";

    /**
     * 分组创建分布式锁
     */
    public static final String LOCK_GROUP_CREATE_KEY = "short-link:lock_group-create:%s";

    /**
     * 用户登录缓存标识
     */
    public static final String USER_LOGIN_KEY = "short-link:login:";
}
