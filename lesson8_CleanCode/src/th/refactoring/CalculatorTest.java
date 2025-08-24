package th.refactoring;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstOperand = 20;
        int secondOperand = 4;

        int resultAddition = Calculator.calculate(firstOperand, secondOperand, Calculator.ADDITION);
        int resultSubtraction = Calculator.calculate(firstOperand, secondOperand, Calculator.SUBTRACTION);
        int resultMultiplication = Calculator.calculate(firstOperand, secondOperand, Calculator.MULTIPLICATION);
        int resultDivision = Calculator.calculate(firstOperand, secondOperand, Calculator.DIVISION);

        System.out.println(firstOperand + " + " + secondOperand + " = " + resultAddition);
        System.out.println(firstOperand + " - " + secondOperand + " = " + resultSubtraction);
        System.out.println(firstOperand + " * " + secondOperand + " = " + resultMultiplication);
        System.out.println(firstOperand + " / " + secondOperand + " = " + resultDivision);
    }
}
