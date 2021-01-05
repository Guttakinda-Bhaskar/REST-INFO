package com.example.demo.Config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	public static final Contact DEFAULT_CONTACT = new Contact(
//		      "Ranga Karanam", "http://www.in28minutes.com", "in28minutes@gmail.com");
//		  
//		  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
//		      "Awesome API Title", "Awesome API Description", "1.0",
//		      "urn:tos", DEFAULT_CONTACT, 
//		      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",Arrays.asList());
//
//		  @SuppressWarnings("unused")
//		private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
//		      new HashSet<String>(Arrays.asList("application/json",
//		          "application/xml"));
//	
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
