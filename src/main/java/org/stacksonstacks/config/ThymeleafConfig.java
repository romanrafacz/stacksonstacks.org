package org.stacksonstacks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@Configuration
public class ThymeleafConfig {
	
	@Bean
	public SpringSecurityDialect springSecurityDialect(){
		return new SpringSecurityDialect();
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		if (!registry.hasMappingForPattern("/css/**")){
			registry.addResourceHandler("/css/**").addResourceLocations("classpath:/");
		}
	}

}
