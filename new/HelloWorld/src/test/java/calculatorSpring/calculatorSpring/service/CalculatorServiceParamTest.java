package calculatorSpring.calculatorSpring.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.calculatorSpring.calculatorSpring.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceParamTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "5, 5, 10",
        "-2, 1, -1"
    })
    void testPlus(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
        "5, 5, 0",
        "-2, 1, -3"
    })
    void testMinus(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
        "5, 5, 25",
        "-2, 1, -2"
    })
    void testMultiply(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
        "5, 5, 1",
        "-4, 2, -2"
    })
    void testDivide(int num1, int num2, int expected) {
        assertEquals(expected, calculatorService.divide(num1, num2));
    }
}
