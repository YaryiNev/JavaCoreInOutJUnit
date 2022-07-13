package org.example;

import org.junit.jupiter.api.*;

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
    public void PI_INIT() {
        MathMethods mathMethods = new MathMethods();
        boolean result = MathMethods.PI == 3.14;
        Assertions.assertTrue(result);
    }
}
