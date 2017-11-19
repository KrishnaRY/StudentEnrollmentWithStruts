package com.github.elizabetht;


import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public FilterRegistrationBean filterDispatcher() {
    	 FilterRegistrationBean registration = new FilterRegistrationBean();
         registration.setFilter(new StrutsPrepareAndExecuteFilter());
         registration.addUrlPatterns("/*");
         registration.setName("struts2");
         return registration;
    }




    
}