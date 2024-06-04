package se.dsve.calculator.calculatosService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if(num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Divider can't be zero");
        }
    }
}
