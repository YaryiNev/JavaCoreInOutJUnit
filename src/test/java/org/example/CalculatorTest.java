package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {

    @Test
    public void validCalculateCircleArea() {
        MathMethods mathMethods = new MathMethods();

        int radius = 6;
        double expectedResult = 113.03999999999999;
        double result = MathMethods.calculateCircleArea(radius);

        Assertions.assertEquals(result, expectedResult);
    }
    
    @Test
    public void calculateCircleLenght() {
        MathMethods mathMethods = new MathMethods();

        int radius = 6;
        double expectedResult = 37.68;
        double result = MathMethods.calculateCircleLenght(radius);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    public void PI_NO_NULL() {
        MathMethods mathMethods = new MathMethods();
        double result = MathMethods.PI;
        double expected = 3.14;
        Assertions.assertNotNull(expected);
    }
}
