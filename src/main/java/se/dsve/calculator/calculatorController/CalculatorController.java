package se.dsve.calculator.calculatorController;

import org.springframework.web.bind.annotation.*;

import se.dsve.calculator.calculatosService.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public double add(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return calculatorService.divide(num1, num2);
    }
}
