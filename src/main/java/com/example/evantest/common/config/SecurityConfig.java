package com.example.evantest.common.config;

//import com.example.evantest.interceptor.LoginInterceptor;
import com.example.evantest.interceptor.LogInterceptor;
import com.example.evantest.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//AOP : 拦截器
@Configuration
public class SecurityConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //  excludePathPatterns为不用检测的api
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/system/user/index");

        registry.addInterceptor(new LogInterceptor());

    }


}
