package com.example.evantest.common.exception;

import com.example.evantest.common.enums.ExceptionEnum;

public class BusinessException extends RuntimeException{

    private ExceptionEnum exceptionEnum;
    private Integer code;
    private String message;

    public BusinessException() {
        super();
    }

    public BusinessException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.exceptionEnum = exceptionEnum;
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
    }

    public BusinessException(ExceptionEnum exceptionEnum,String field) {
        super(exceptionEnum.getMsg());
        this.exceptionEnum = exceptionEnum;
        this.code = exceptionEnum.getCode();
        this.message = String.format(exceptionEnum.getMsg(), field);
    }

    public BusinessException(String errorMsg) {
        super(errorMsg);
        this.code = ExceptionEnum.INTERNAL_SERVER_ERROR.getCode();
        this.message = errorMsg;
    }

    public BusinessException(Integer code, String errorMsg) {
        super(errorMsg);
        this.code = code;
        this.message = errorMsg;
    }

    public BusinessException(Integer code, String msg, Object... args) {
        super(String.format(msg, args));
        this.code = code;
        this.message = String.format(msg, args);
    }

    public ExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
