package com.tyr.spring.tutorial.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Printer {

    public static final Print printer = s -> System.out.println(s);

//    public void executePrinter(String s) {
//        printer.printString(s);
//    }

}
