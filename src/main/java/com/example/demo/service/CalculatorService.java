package com.example.demo.service;

import com.example.demo.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String calcAnswer(Calculator calculator)
    {
        int answer = 0;
        String calcAnswer = "";
        int number1;
        int number2;

        number1 = calculator.getNumber1();
        number2 = calculator.getNumber2();

        if (calculator.getOperator() == '+'){
            answer = number1 + number2;
            calcAnswer = "Answer = "+answer;
        }
        else if (calculator.getOperator() == '-'){
            answer = number1 - number2;
            calcAnswer = "Answer = "+answer;
        }
        else if (calculator.getOperator() == '/'){
                try {
                    answer = number1 / number2;
                    calcAnswer = "Answer = "+answer;
                }
                catch (Exception e){
                    calcAnswer = e.getMessage();
                }
        }
        else if (calculator.getOperator() == '*'){
            try {
                answer = number1 * number2;
                calcAnswer = "Answer = "+answer;
            }
            catch (Exception e){
                calcAnswer = e.getMessage();

            }
        }

        return calcAnswer;
    }

}
