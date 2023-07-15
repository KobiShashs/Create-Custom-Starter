package com.jb.custom;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WeatherProperties.class)
public class MyCustomWeatherAutoConfiguration {

    @Bean
    public WeatherProperties weatherProperties(){
        return new WeatherProperties();
    }
    @Bean
    public WeatherService weatherService() {
        WeatherProperties weatherProperties = new WeatherProperties();
        return new WeatherService(weatherProperties);
    }
    @Bean
     public WeatherService weatherService(WeatherProperties properties) {
       return new WeatherService(properties);
    }
}