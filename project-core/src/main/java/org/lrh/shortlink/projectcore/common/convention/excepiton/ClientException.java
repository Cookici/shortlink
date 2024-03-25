package org.lrh.shortlink.projectcore.common.convention.excepiton;


import org.lrh.shortlink.projectcore.common.convention.errorcode.BaseErrorCode;
import org.lrh.shortlink.projectcore.common.convention.errorcode.IErrorCode;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.common.convention.excepiton
 * @ClassName: ClientException
 * @Author: 63283
 * @Description: 客户端异常
 * @Date: 2024/3/18 15:19
 */

public class ClientException extends AbstractException{
    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
