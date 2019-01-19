package com.ntt.nttsocialmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class NttSocialMediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttSocialMediaApplication.class, args);
	}

//	@Bean
//	HiddenHttpMethodFilter hiddenHttpMethodFilter() {
//		return new HiddenHttpMethodFilter();
//	}
}
