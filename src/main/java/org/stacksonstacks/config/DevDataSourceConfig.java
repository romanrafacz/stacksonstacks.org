package org.stacksonstacks.config;

import javax.sql.DataSource;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Controller;

@Configuration
@Profile("dev")
public class DevDataSourceConfig {
	
	@Bean
	public DataSource datasource(){
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.build();
	}
	
	@Bean
	public ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
		return registration;
	}

}
