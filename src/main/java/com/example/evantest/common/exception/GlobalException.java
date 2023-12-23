package com.example.evantest.common.exception;

import com.example.evantest.common.core.domain.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@ControllerAdvice(annotations = {RestController.class})
public class GlobalException {


    /**
     * 处理除0异常捕获
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)//异常类型通过注解拿到
    public R<String> exceptionHandler(Exception exception){
        return R.error(exception.getMessage());

    }

}
