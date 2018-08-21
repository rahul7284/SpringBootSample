package com.ezest.rest.webservices.restfulwebservices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
  
	private static final Contact DEFAUL_CONTACT = new Contact("Rahul Pyasi", 
			"http://www.google.com", "rp@gmail.com");

	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo
			("Awesome API INFO", "AweSome API Description", "1.0", "termsOfServiceUrl",
					DEFAUL_CONTACT, "license", "licenseUrl");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
	}
}
