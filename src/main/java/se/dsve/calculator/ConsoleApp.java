package se.dsve.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.dsve.calculator.calculatosService.CalculatorService;

public class ConsoleApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorApplication.class);
        CalculatorService calculatorService = context.getBean(CalculatorService.class);
        new Menu(calculatorService).displayMenu();
        context.close();
    }
}
