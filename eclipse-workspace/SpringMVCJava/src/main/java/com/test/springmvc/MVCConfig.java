package com.test.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//Used instead of Dispatcher xml file
@Configuration
@EnableWebMvc
@ComponentScan("com.test")
public class MVCConfig  extends WebMvcConfigurerAdapter{

}
