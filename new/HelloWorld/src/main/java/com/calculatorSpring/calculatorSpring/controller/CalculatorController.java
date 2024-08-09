package com.calculatorSpring.calculatorSpring.controller;


import com.calculatorSpring.calculatorSpring.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        int result = calculatorService.plus(num1, num2);
        return String.format("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        int result = calculatorService.minus(num1, num2);
        return String.format("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        int result = calculatorService.multiply(num1, num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        validateParams(num1, num2);
        int result = calculatorService.divide(num1, num2);
        return String.format("%d / %d = %d", num1, num2, result);
    }

    private void validateParams(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Оба параметра num1 и num2 должны быть заданы.");
        }
    }
}

