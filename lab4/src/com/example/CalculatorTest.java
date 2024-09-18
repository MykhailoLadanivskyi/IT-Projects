package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testCalculateSum_validInput() {
        double result = Calculator.calculateSum(5, 10, 2);
        assertEquals(17, result, "The sum of 5, 10, and 2 should be 17");
    }

    @Test
    public void testCalculateSum_negativeNumbers() {
        double result = Calculator.calculateSum(-5, -10, -2);
        assertEquals(-17, result, "The sum of -5, -10, and -2 should be -17");
    }

    @Test
    public void testCalculateSum_zero() {
        double result = Calculator.calculateSum(0, 0, 0);
        assertEquals(0, result, "The sum of 0, 0, and 0 should be 0");
    }

    @Test
    public void testCalculateSum_mixedNumbers() {
        double result = Calculator.calculateSum(-5, 10, 3);
        assertEquals(8, result, "The sum of -5, 10, and 3 should be 8");
    }
}
