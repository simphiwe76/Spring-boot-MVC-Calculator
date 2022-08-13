package com.example.demo.controller;

import com.example.demo.model.Calculator;
import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @ResponseBody
    @PostMapping(value = "Calculator/Answer")
    public String calculateAnswer(@RequestBody Calculator calculator){
        return calculatorService.calcAnswer(calculator);
    }

}
