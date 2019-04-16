/*
Author: Narrara
Description: Java Addition Calculator
Course: IST 242 - 001
 */

package com.company;

import java.util.Scanner;



/**
 * @author Narrara
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        System.out.println("Enter another integer number: ");
        int input = scnr.nextInt();
        int input2 = scnr.nextInt();
        System.out.println(input + " + " + input2 + " = " + addition(input, input2));
        

    }

    /**
     * addition method performs addition
     * @param num1 an integer number
     * @param num2 an integer number
     * @return an integer number
     */


 @org.junit.Test



    public static int addition(int num1, int num2) {
        return num1+num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1-num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1*num2;
    }

    public static int division(int num1, int num2) {
        return num1/num2;
    }

public class Test {

}


}
