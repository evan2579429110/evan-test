package com.example.evantest.common.core.domain;

import com.example.evantest.common.enums.ExceptionEnum;
import lombok.*;
import org.slf4j.MDC;

import java.io.Serializable;

import static com.example.evantest.common.constant.Constant.TRACE_ID;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T data;

    @Getter
    @Setter
    private String traceId = MDC.get(TRACE_ID);


    public static <T> R<T> success() {
        return restResult(null, ExceptionEnum.SUCCESS.getCode(), "操作成功");
    }

    public static <T> R<T> success(T data) {
        return restResult(data, ExceptionEnum.SUCCESS.getCode(), "操作成功");
    }

    public static <T> R<T> success(T data, String msg) {
        return restResult(data, ExceptionEnum.SUCCESS.getCode(), msg);
    }


    public static <T> R<T> fail() {
        return restResult(null, ExceptionEnum.INTERNAL_SERVER_ERROR.getCode(), ExceptionEnum.INTERNAL_SERVER_ERROR.getMsg());
    }

    public static <T> R<T> fail(String msg) {
        return restResult(null, ExceptionEnum.INTERNAL_SERVER_ERROR.getCode(), msg);
    }

    public static <T> R<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> R<T> fail(ExceptionEnum exceptionEnum) {
        return restResult(null, exceptionEnum.getCode(), exceptionEnum.getMsg());
    }


    public static <T> R<T> error() {
        return restResult(null, ExceptionEnum.INTERNAL_SERVER_ERROR.getCode(), "操作失败");
    }

    public static <T> R<T> error(String msg) {
        return restResult(null, ExceptionEnum.INTERNAL_SERVER_ERROR.getCode(), msg);
    }

    public static <T> R<T> error(int code, String msg) {
        return restResult(null, code, msg);
    }

    public static <T> R<T> error(ExceptionEnum exceptionEnum) {
        return restResult(null, exceptionEnum.getCode(), exceptionEnum.getMsg());
    }


    private static <T> R<T> restResult(T data, int code, String msg) {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
