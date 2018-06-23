package com.ebaykorea.ecouponshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EcouponshopApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(EcouponshopApplication.class, args);
	}

	/*@Override
	public void addInterceptors(InterceptorRegistry registry){ registry.addInterceptor(new MyInterceptor());}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers){
		resolvers.add(new MyHeaderArgumentResolver());
	}*/
}
