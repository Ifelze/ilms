package com.ifelze.ilms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.ifelze.ilms.config.JwtFilter;

@SpringBootApplication
public class IlmsApplication {
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/ilms/*");

		return registrationBean;
	}
	public static void main(String[] args) {
		SpringApplication.run(IlmsApplication.class, args);
	}
}
