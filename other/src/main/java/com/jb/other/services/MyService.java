package com.jb.other.services;

import com.jb.custom.WeatherProperties;
import com.jb.custom.WeatherService;
import com.jb.other.models.WeatherModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kobis on 15 Jul, 2023
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class MyService {

    private final WeatherService weatherService;
    private final WeatherProperties weatherProperties;

    public WeatherModel generate() {

        log.info(weatherService.getWeatherDetails());

        return WeatherModel.builder()
                .type(weatherProperties.getType())
                .temp(weatherProperties.getTemp())
                .city(weatherProperties.getCity())
                .build();
    }
}
