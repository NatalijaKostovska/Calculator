package com.example.kalkulator.Service;

import org.springframework.stereotype.Service;

@Service
public class SerivceCalculatorImpl implements ServiceCalculator {

    @Override
    public Double addition(Double firstNumber, Double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public Double devision(Double firstNumber, Double secondNumber) {
        return firstNumber/secondNumber;
    }
}
