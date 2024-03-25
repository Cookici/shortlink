package org.lrh.shortlink.projectcore.common.convention.excepiton;


import org.lrh.shortlink.projectcore.common.convention.errorcode.BaseErrorCode;
import org.lrh.shortlink.projectcore.common.convention.errorcode.IErrorCode;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.convention.excepiton
 * @ClassName: RemoteException
 * @Author: 63283
 * @Description: 远程服务调用异常
 * @Date: 2024/3/18 15:19
 */

public class RemoteException extends AbstractException {
    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
