package com.jb.other.web;

import com.jb.other.models.WeatherModel;
import com.jb.other.services.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kobis on 15 Jul, 2023
 */
@RestController
@RequestMapping("api/weather")
@RequiredArgsConstructor
public class MyController {

    private final MyService myService;

    @GetMapping("info")
    public WeatherModel weatherModel(){
        return myService.generate();
    }
}
