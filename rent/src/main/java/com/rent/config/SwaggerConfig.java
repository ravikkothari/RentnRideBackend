package com.rent.config;


import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  extends WebMvcConfigurationSupport
{
    @Bean
    public Docket api() {
        // @formatter:off
        //Register the controllers to swagger
        //Also it is configuring the Swagger 
        return new Docket(DocumentationType.SWAGGER_2).select()
                 .apis(RequestHandlerSelectors.basePackage("com.rent.controller"))



 



                .build()
                .apiInfo(apiDetails());
        // @formatter:on
    }
    private ApiInfo apiDetails() {
        return new ApiInfo(
            "Rent-N-Ride Application",
            "India's Largest Rental Platform",
            "1.0",
            "Many Cars To Rent", 
            new springfox.documentation.service.Contact("Rent-N-Ride", "https://www.rentnride.com", "teamhelp@rentnride.com"),
            "Rent-N-Ride License",
            "https://www.rentnride.com",
            Collections.emptyList());
        
    }
     @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) 
        {
            //enabling swagger part for visual documentation
            registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
}




