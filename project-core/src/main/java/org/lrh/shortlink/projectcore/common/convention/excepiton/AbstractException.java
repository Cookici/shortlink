package org.lrh.shortlink.projectcore.common.convention.excepiton;

import lombok.Getter;
import org.lrh.shortlink.projectcore.common.convention.errorcode.IErrorCode;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.convention.excepiton
 * @ClassName: AbstractException
 * @Author: 63283
 * @Description: 抽象项目中三类异常体系，客户端异常、服务端异常以及远程服务调用异常
 * @see ClientException
 * @see ServiceException
 * @see RemoteException
 * @Date: 2024/3/18 15:17
 */
@Getter
public abstract class AbstractException extends RuntimeException{
    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(StringUtils.hasLength(message) ? message : null).orElse(errorCode.message());
    }
}
