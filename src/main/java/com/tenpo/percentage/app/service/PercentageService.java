package com.tenpo.percentage.app.service;

import com.tenpo.percentage.app.model.Percentage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
@Slf4j
public class PercentageService {

    public Percentage getPercentage() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        Percentage percentage = Percentage.builder()
                .value(new Random().nextInt(100) + 1)
                .build();

        log.info("Percentage value: " + percentage.getValue() + " Time: " + localTime.format(formatter));
        return percentage;
    }

}