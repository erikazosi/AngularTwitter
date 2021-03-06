package com.twitter.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.twitter.controller")
@EnableSpringDataWebSupport
public class WebConfig extends WebMvcConfigurerAdapter {

    /*public ViewResolver viewResolver() {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("/WEB-INF/pages/");
        res.setSuffix(".jsp");
        res.setExposeContextBeansAsAttributes(true);

        return res;

    }*/

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
