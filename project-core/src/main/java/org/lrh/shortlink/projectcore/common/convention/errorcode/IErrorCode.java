package org.lrh.shortlink.projectcore.common.convention.errorcode;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.enums
 * @ClassName: IErrorCode
 * @Author: 63283
 * @Description: 平台错误码
 * @Date: 2024/3/18 15:11
 */

public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
