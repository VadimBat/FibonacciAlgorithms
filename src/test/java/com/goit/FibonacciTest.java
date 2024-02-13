package com.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    //Given
    @Test
    void fibonacciIterateTest() {
        //When
        long actual = Fibonacci.fibonacciIterate(10);
        //Then
        long expected = 55;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciRecurseTest() {
        //When
        long actual = Fibonacci.fibonacciRecurse(10);
        //Then
        long expected = 55;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciDynamicTest() {
        //When
        long actual = Fibonacci.fibonacciDynamic(10);
        //Then
        long expected = 55;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciDynamicIllegalNumbersTest() {
        //When & Then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Fibonacci.fibonacciDynamic(-10)
        );
    }

    @Test
    void fibonacciIterateIllegalNumbersTest() {
        //When & Then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Fibonacci.fibonacciIterate(-55)
        );
    }

    @Test
    void fibonacciRecurseIllegalNumbersTest() {
        //When & Then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Fibonacci.fibonacciRecurse(-17)
        );
    }
}