package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }
    @Test
    public void testMultiple() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiple(3, 2));
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(3, 2));
    }
    @Test
    public void testDividePercent() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide_percent(3, 2));
    }

}