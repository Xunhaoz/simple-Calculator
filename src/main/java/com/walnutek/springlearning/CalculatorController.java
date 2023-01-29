package com.walnutek.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public ResponseEntity<Double> add(@RequestBody Calculator calculator) {
        double result = calculatorService.add(calculator.getNum1(), calculator.getNum2());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public ResponseEntity<Double> subtract(@RequestBody Calculator calculator) {
        double result = calculatorService.subtract(calculator.getNum1(), calculator.getNum2());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody Calculator calculator) {
        double result = calculatorService.multiply(calculator.getNum1(), calculator.getNum2());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/divide")
    public ResponseEntity<Double> divide(@RequestBody Calculator calculator) {
        double result = calculatorService.divide(calculator.getNum1(), calculator.getNum2());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
