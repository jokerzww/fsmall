package com.fsteam.fsmall.config;

import com.fsteam.fsmall.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class JWTInterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor((new JWTInterceptor()))
                .addPathPatterns("/user/test")          // 拦截的路径
                .excludePathPatterns("/user/login");    // 不拦截的路径
    }
}
