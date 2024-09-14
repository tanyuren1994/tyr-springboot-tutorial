package com.tyr.spring.tutorial.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Printer {

    private static final Logger log = LoggerFactory.getLogger(Printer.class);

    private static String a = "HELLO WORLD from variable";

    public Print printer = s -> {
        log.info(s);
        log.info(a);
        a = "I changed the variable";
        log.info(a);
    };

    public void executePrinter(String s) {
        printer.printString(s);
    }

}
