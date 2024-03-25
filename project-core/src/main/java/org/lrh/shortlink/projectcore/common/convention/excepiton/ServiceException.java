package org.lrh.shortlink.projectcore.common.convention.excepiton;


import org.lrh.shortlink.projectcore.common.convention.errorcode.BaseErrorCode;
import org.lrh.shortlink.projectcore.common.convention.errorcode.IErrorCode;

import java.util.Optional;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.convention.excepiton
 * @ClassName: ServiceException
 * @Author: 63283
 * @Description: 服务端异常
 * @Date: 2024/3/18 15:20
 */

public class ServiceException extends AbstractException {
    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
