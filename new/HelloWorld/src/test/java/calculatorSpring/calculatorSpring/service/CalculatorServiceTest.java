package calculatorSpring.calculatorSpring.service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculatorSpring.calculatorSpring.service.CalculatorService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals(10, calculatorService.plus(5, 5));
        assertEquals(-1, calculatorService.plus(-2, 1));
    }

    @Test
    void testMinus() {
        assertEquals(0, calculatorService.minus(5, 5));
        assertEquals(-3, calculatorService.minus(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calculatorService.multiply(5, 5));
        assertEquals(-2, calculatorService.multiply(-2, 1));
    }

    @Test
    void testDivide() {
        assertEquals(1, calculatorService.divide(5, 5));
        assertEquals(-2, calculatorService.divide(-4, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5, 0));
        assertEquals("Деление на ноль невозможно.", exception.getMessage());
    }
}
