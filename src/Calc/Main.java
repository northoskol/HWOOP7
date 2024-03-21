package Calc;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр калькулятора комплексных чисел
        ComplexCalculator calculator = new ComplexCalculatorImpl();

        // Создаем фасад для управления калькулятором и логирования
        ComplexCalculatorFacade facade = new ComplexCalculatorFacade(calculator);

        // Примеры операций с комплексными числами
        ComplexNumber num1 = new ComplexNumber(6, 3);
        ComplexNumber num2 = new ComplexNumber(5, -2);

        // Сложение
        ComplexNumber sum = facade.add(num1, num2);
        System.out.println("Сложение: " + sum);

        // Умножение
        ComplexNumber product = facade.multiply(num1, num2);
        System.out.println("Умножение: " + product);

        // Деление
        ComplexNumber quotient = facade.divide(num1, num2);
        System.out.println("Деление: " + quotient);
    }
}
