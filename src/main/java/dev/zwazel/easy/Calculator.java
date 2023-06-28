package dev.zwazel.easy;

/**
 * Warmup challenge: Write a calculator that can add, subtract, multiply, and divide two numbers.
 */
public class Calculator {
    static float result = 0;
    public static float calculate(char operator, float number1, float number2) {
        switch (operator) {
            case '+':
                //TODO add
                result = number1 + number2;
                break;
            case '-':
                //TODO subtract
                result = number1 - number2;
                break;
            case '/':
                //TODO divide
                if (number2 == 0){
                    throw new ArithmeticException();
                }
                else{
                    result = number1 / number2;
                }
                break;
            case '*':
                //TODO multiply
                result = number1 * number2;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return result; //default case for unknown operator
    }
}
