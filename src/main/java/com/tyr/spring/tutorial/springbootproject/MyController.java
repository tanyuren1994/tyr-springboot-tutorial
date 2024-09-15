package com.tyr.spring.tutorial.springbootproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/hello")
    public String getString() {
        log.info("accessing /hello");
        return "HELLO WORLD";
    }
}
