package com.jb.custom;

/**
 * Created by kobis on 15 Jul, 2023
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("custom.weather")
@Data
public class WeatherProperties {

    private String type = "HOT";
    private int temp = 28;
    private String city = "Tel Aviv";

}
