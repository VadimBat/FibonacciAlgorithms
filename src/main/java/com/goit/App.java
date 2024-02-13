package com.goit;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        log.info("fibonacci for 25 = {}", Fibonacci.fibonacciIterate(25));
        log.info("fibonacci for 15 = {}", Fibonacci.fibonacciRecurse(15));
        log.info("fibonacci for 10 = {}", Fibonacci.fibonacciDynamic(10));
    }
}
