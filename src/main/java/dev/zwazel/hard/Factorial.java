package dev.zwazel.hard;

/**
 * Write a program that calculates and prints out the factorial of a given number using recursion.
 * <p>
 * Example: Factorial of 5 is "5 * 4 * 3 * 2 * 1" = 120
 */
public class Factorial {
    public static int factorial(int number) {
        int result = 0;
        for(int i = 0; i<number; i++){
            for(int multiplyby = 0; multiplyby != i; multiplyby--){
                result = number * multiplyby;
            }
        }
        return result; // TODO implement here
    }
}
