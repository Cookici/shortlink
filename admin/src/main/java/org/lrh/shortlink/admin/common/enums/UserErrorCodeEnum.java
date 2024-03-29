package org.lrh.shortlink.admin.common.enums;

import org.lrh.shortlink.admin.common.convention.errorcode.IErrorCode;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.enums
 * @ClassName: UserErrorCodeEnum
 * @Author: 63283
 * @Description: 用户错误码
 * @Date: 2024/3/18 15:15
 */

public enum UserErrorCodeEnum implements IErrorCode {
    /**
     * 用户记录不存在
     */
    USER_NULL("B000200", "用户记录不存在"),

    /**
     * 用户名已存在
     */
    USER_NAME_EXIST("B000201", "用户名已存在"),

    /**
     * 用户记录已存在
     */
    USER_EXIST("B000202", "用户记录已存在"),

    /**
     * 用户记录新增失败
     */
    USER_SAVE_ERROR("B000203", "用户记录新增失败");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
