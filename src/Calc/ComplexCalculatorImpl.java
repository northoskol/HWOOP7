package Calc;

public class ComplexCalculatorImpl implements ComplexCalculator {
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws ArithmeticException {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(real, imaginary);
    }
}
