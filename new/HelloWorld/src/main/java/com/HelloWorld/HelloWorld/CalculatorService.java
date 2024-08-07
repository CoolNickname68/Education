package com.HelloWorld.HelloWorld;

import org.springframework.stereotype.Service;



@Service
public class CalculatorService {

    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    public String divide(int num1, int num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}