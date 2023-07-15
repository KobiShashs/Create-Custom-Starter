package com.jb.custom;

import org.springframework.stereotype.Service;

/**
 * Created by kobis on 15 Jul, 2023
 */
@Service
public class WeatherService {

    private final WeatherProperties properties;

    public WeatherService(WeatherProperties properties) {
        this.properties = properties;
    }

    public String getWeatherDetails() {
        return String.format("City: %s, Type: %s, Temperature: %d",
                properties.getCity(), properties.getType(), properties.getTemp());
    }
}
