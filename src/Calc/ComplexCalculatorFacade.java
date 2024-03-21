package Calc;

import java.util.logging.Logger;

public class ComplexCalculatorFacade {
    private ComplexCalculator calculator;
    private Logger logger;

    public ComplexCalculatorFacade(ComplexCalculator calculator) {
        this.calculator = calculator;
        this.logger = Logger.getLogger(ComplexCalculatorFacade.class.getName());
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.add(a, b);
        logger.info("Addition: " + a + " + " + b + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.info("Multiplication: " + a + " * " + b + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        try {
            ComplexNumber result = calculator.divide(a, b);
            logger.info("Division: " + a + " / " + b + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            logger.warning("Division by zero error");
            throw e;
        }
    }
}