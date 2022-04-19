package com.wusong.platfrom.auth.web.config;

import com.wusong.platfrom.auth.web.interceptor.AuthorizationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * javadoc MvcConfig
 * @author: wangdy
 * @create: 2022/2/10 下午2:24
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public AuthorizationInterceptor authorizationInterceptor() {
        return new AuthorizationInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizationInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/open/**")
                .excludePathPatterns("/auth-web/mini/**");
    }
}
