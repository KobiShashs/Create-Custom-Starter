package com.jb.other.config;

import com.jb.custom.WeatherProperties;
import com.jb.custom.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kobis on 15 Jul, 2023
 */
@Configuration
public class WeatherConfig {

    @Bean
    public WeatherProperties weatherProperties(){
        return new WeatherProperties();
    }

    @Bean
    public WeatherService weatherService(){
        return new WeatherService(weatherProperties());
    }
}
