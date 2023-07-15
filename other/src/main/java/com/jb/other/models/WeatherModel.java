package com.jb.other.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kobis on 15 Jul, 2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeatherModel {

    private String type;
    private int temp;
    private String city;
}
