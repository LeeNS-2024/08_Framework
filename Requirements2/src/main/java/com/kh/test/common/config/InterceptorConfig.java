package com.kh.test.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.test.common.interceptor.MemberTypeInterceptor;
@Configuration // 서버 실행시 내부 메서드 모두 실행 / 추가한 구문
public class InterceptorConfig implements WebMvcConfigurer{

	@Bean // 추가한 구문
	public MemberTypeInterceptor memberTypeInterceptor() {
		return new MemberTypeInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor( memberTypeInterceptor() )
		.addPathPatterns("/**")
		.excludePathPatterns("/css/**", "/js/**", "/images/**", "/favicon.ico"); 
	}
}