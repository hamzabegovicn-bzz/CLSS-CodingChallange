package dev.zwazel.medium;

import java.util.Scanner;

/**
 * Write a program that takes a number as input and outputs a pyramid of that width.
 * Example: if number is 3, console output should be:
    *
   **
  ***
 */
public class PyramidPrinter {
    public static String pyramidString(int baseWidth){
        //TODO generate pyramid here
        for(int i=1; i<=baseWidth; i++){
            for(int y=baseWidth-1; y>=0; y--){
                System.out.print(" ");
            }
            for(int x=0; x<i; x++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return "";
    }
}