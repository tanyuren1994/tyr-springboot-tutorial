package com.tyr.spring.tutorial.httpClient;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Slf4j
public class MainHttp {

    @Value("HELLO")
    private static String constant;

    private static final Logger log = LoggerFactory.getLogger(MainHttp.class);

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        log.info(constant);
        HttpRequest myRequest = HttpRequest
                .newBuilder(new URI("https://postman-echo.com/get"))
                .version(HttpClient.Version.HTTP_2)
                .header("key1","value")
                .timeout(Duration.of(10, ChronoUnit.SECONDS))
                .GET()
                .build();

        HttpClient myClient = HttpClient.newBuilder().build();

        HttpResponse<String> myResponse = myClient.send(myRequest, HttpResponse.BodyHandlers.ofString());

        log.info(myResponse.body());
    }
}
