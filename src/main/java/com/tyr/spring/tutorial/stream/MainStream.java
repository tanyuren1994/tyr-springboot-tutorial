package com.tyr.spring.tutorial.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Optional;

@Slf4j
public class MainStream {

    private static final Logger log = LoggerFactory.getLogger(MainStream.class);

    public static void main(String[] args) {

        myStream mainStream = new myStream();
        mainStream.testStream();

        Optional<String> testString = Optional.empty();

        try {
            log.info(testString.get().toString());
        } catch (Exception e) {
            log.error(e.getMessage());
        }


    }
}
