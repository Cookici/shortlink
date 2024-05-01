package org.lrh.shortlink.projectcore.common.constant;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.common.constant
 * @ClassName: RedisKeyConstant
 * @Author: 63283
 * @Description: Redis Key常量类
 * @Date: 2024/4/27 上午12:24
 */

public class RedisKeyConstant {
    /**
     * 短链接跳转前缀Key
     */
    public static final String GOTO_SHORT_LINK_KEY = "short-link_goto_%s";

    /**
     * 短链接空值跳转问题Key
     */
    public static final String GOTO_IS_NULL_SHORT_LINK_KEY = "short-link_is-null_goto_%s";
    /**
     * 短链接跳转分布式锁Key
     */
    public static final String LOCK_GOTO_SHORT_LINK_KEY = "short-link_lock_goto_%s";

    /**
     * 短链接统计判断是否新用户缓存标识
     */
    public static final String SHORT_LINK_STATS_UV_KEY = "short-link:stats:uv:";

    /**
     * 短链接统计判断是否新 IP 缓存标识
     */
    public static final String SHORT_LINK_STATS_UIP_KEY = "short-link:stats:uip:";

    /**
     * 短链接修改分组 ID 锁前缀 Key
     */
    public static final String LOCK_GID_UPDATE_KEY = "short-link:lock:update-gid:%s";


}
