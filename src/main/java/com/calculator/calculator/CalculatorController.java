package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorService calculatorService = new CalculatorService();

    @GetMapping()
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один из двух параметров (или оба) не указан!!!";
        } else {
            return calculatorService.plus(num1, num2);
        }
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один из двух параметров (или оба) не указан!!!";
        } else {
            return calculatorService.minus(num1, num2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один из двух параметров (или оба) не указан!!!";
        } else {
            return calculatorService.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: Один из двух параметров (или оба) не указан!!!";
        } else if (num2 == 0) {
            return  "num2 = 0. Деление не возможно.";
        }
        else {
            return calculatorService.divide(num1, num2);}
    }
}
