package org.lrh.shortlink.projectcore.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.common.enums
 * @ClassName: VailDateTypeEnum
 * @Author: 63283
 * @Description: 有效期类型
 * @Date: 2024/4/7 21:47
 */
@RequiredArgsConstructor
public enum VailDateTypeEnum {
    /**
     * 永久有效期
     */
    PERMANENT(0),

    /**
     * 自定义有效期
     */
    CUSTOM(1);

    @Getter
    private final int type;
}
