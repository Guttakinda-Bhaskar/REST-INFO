package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket restApi() {
		return new Docket(DocumentationType.SWAGGER_2)  
		        .apiInfo(apiinfo())  
				.select()                                  
		          .apis(RequestHandlerSelectors.any())              
		          .paths(PathSelectors.any()).build();
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiinfo() {
		return new ApiInfo("Gofunders", "This is Digital Paltform", "Version-2.0", "Created By Guttakindbhaskar",
				"www.Gofounder.net", "Apache Licenced -50142", "Contact The Developer");
	}
}