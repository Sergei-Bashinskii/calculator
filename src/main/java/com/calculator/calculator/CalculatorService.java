package com.calculator.calculator;

public class CalculatorService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int x = num1;
        int y = num2;
        int sum = x + y;
        String output = x + " + " + y + " = " + sum;
        return output;
    }

    public String minus(Integer num1, Integer num2) {
        int x = num1;
        int y = num2;
        int sum = x - y;
        String output = x + " - " + y + " = " + sum;
        return output;
    }

    public String multiply(Integer num1, Integer num2) {
        int x = num1;
        int y = num2;
        int sum = x * y;
        String output = x + " * " + y + " = " + sum;
        return output;
    }

    public String divide(Integer num1, Integer num2) {
        int x = num1;
        int y = num2;
        int sum = x / y;
        String output = x + " / " + y + " = " + sum;
        return output;
    }

}
