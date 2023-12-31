package com.example.calculator.service.impl;

import com.example.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String plus(Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return num1 + " x " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
