package com.tenpo.percentage.app.controller;

import com.tenpo.percentage.app.model.Percentage;
import com.tenpo.percentage.app.service.PercentageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.when;

@WebFluxTest(PercentageController.class)
public class PercentageControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private PercentageService percentageService;

    @BeforeEach
    public void setup() {
        Percentage mockPercentage = new Percentage();
        mockPercentage.setValue(15);
        when(percentageService.getPercentage()).thenReturn(mockPercentage);
    }

    @Test
    public void getPercentageTest() {
        webTestClient.get()
                .uri("/v1/percantage")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Percentage.class);
    }
}
