
package com.infotech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.infotech")
public class SpringConfig {

	/*
	 * @Bean public Communication communication() { return new Communication(); }
	 * 
	 * @Bean public Message message() { return new ActiveMQMessage(); }
	 */

}
