package org.lrh.shortlink.projectcore.toolkit;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import jakarta.servlet.http.HttpServletRequest;

import java.net.URI;
import java.util.Date;
import java.util.Optional;

import static org.lrh.shortlink.projectcore.common.constant.ShortLinkConstant.DEFAULT_CACHE_VALID_TIME;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.toolkit
 * @ClassName: LinkUtil
 * @Author: 63283
 * @Description: 短链接工具类
 * @Date: 2024/4/7 22:00
 */

public class LinkUtil {
    /**
     * 获取短链接缓存有效期时间
     *
     * @param validDate 有效期时间
     * @return 有限期时间戳
     */
    public static long getLinkCacheValidTime(Date validDate) {
        return Optional.ofNullable(validDate)
                .map(each -> DateUtil.between(new Date(), each, DateUnit.MS))
                .orElse(DEFAULT_CACHE_VALID_TIME);
    }


}
