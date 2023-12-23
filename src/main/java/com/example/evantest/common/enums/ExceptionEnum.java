package com.example.evantest.common.enums;

public enum ExceptionEnum {
    SUCCESS(200, "请求成功"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

    ;


    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误描述
     */
    private String message;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public static String format(ExceptionEnum resultCodeEnum, String field) {
        return String.format(resultCodeEnum.getMsg(), field);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return message;
    }

}
