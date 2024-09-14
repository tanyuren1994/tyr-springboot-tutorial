package com.tyr.spring.tutorial.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Slf4j
public class myStream {
    private static final Logger log = LoggerFactory.getLogger(myStream.class);
    List<String> items = new ArrayList<>();

    Predicate<String> myPredicate = (Predicate<String>) o -> o.length() > 3;

    public List<String> create() {

        items.add("one one2 one3");
        items.add("two");
        items.add("three");

        return items;
    }

    public void testStream() {
        this.items = this.create();
        Stream<String> myStream = items.stream();
        myStream.map(String::toLowerCase)
                .peek(log::info)
                .flatMap(s -> {
                    String[] split = s.split(" ");
                    return List.of(split).stream();
                })
//                .filter(myPredicate)
//                .limit(2)
                .forEach(s -> {
                    log.info(String.valueOf(s));
                });
    }

}
