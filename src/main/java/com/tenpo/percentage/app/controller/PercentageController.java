package com.tenpo.percentage.app.controller;

import com.tenpo.percentage.app.model.Percentage;
import com.tenpo.percentage.app.service.PercentageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/v1/percantage")
public class PercentageController {

    @Autowired
    public PercentageService percentageService;

    @GetMapping
    public Mono<ResponseEntity<Percentage>> getPercentage() {
        return Mono.just(
                ResponseEntity.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(percentageService.getPercentage())
        );
    }
}
