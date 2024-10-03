package com.git.demo.domain.exception;

import com.git.demo.domain.errorcode.BaseErrorCode;
import org.springframework.http.HttpStatus;

public class BusinessException extends BaseException {
    public BusinessException(String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(errorCode, errorMessage, httpStatus);
    }

    public BusinessException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public BusinessException(BaseErrorCode errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public BusinessException(String message, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message, errorCode, errorMessage, httpStatus);
    }

    public BusinessException(String message, Throwable cause, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message, cause, errorCode, errorMessage, httpStatus);
    }

    public BusinessException(Throwable cause, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(cause, errorCode, errorMessage, httpStatus);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode, errorMessage, httpStatus);
    }
}
