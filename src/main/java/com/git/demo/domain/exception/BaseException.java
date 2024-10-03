package com.git.demo.domain.exception;

import com.git.demo.domain.errorcode.BaseErrorCode;
import org.springframework.http.HttpStatus;

public class BaseException extends RuntimeException {

    private final String errorCode;
    private final String errorMessage;
    private final HttpStatus httpStatus;

    public BaseException(String errorCode, String errorMessage, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public BaseException(BaseErrorCode errorCode, String errorMessage, HttpStatus httpStatus) {
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }


    public BaseException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = null;
    }

    public BaseException(BaseErrorCode errorCode, String errorMessage) {
        this.errorCode = errorCode.getCode();
        this.errorMessage = errorMessage;
        this.httpStatus = null;
    }

    public BaseException(String message, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public BaseException(String message, Throwable cause, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public BaseException(Throwable cause, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMessage, HttpStatus httpStatus) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }
}

