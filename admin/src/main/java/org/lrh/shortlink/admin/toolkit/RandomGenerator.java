package org.lrh.shortlink.admin.toolkit;

import java.security.SecureRandom;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.toolkit
 * @ClassName: RandomGenerator
 * @Author: 63283
 * @Description: 分组ID随机生成器
 * @Date: 2024/3/18 17:17
 */

public final class RandomGenerator {
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * 生成随机分组ID
     *
     * @return 分组ID
     */
    public static String generateRandom() {
        return generateRandom(6);
    }

    /**
     * 生成随机分组ID
     *
     * @param length 生成多少位
     * @return 分组ID
     */
    public static String generateRandom(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
