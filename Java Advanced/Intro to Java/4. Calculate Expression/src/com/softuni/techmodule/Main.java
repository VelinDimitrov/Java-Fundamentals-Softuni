package com.softuni.techmodule;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
     Scanner input =new Scanner(System.in);
     double firstNumber=input.nextDouble();
        double secondNumber=input.nextDouble();
        double thirdNumber=input.nextDouble();
        double f1Pow=(firstNumber+secondNumber+thirdNumber)/Math.sqrt(thirdNumber);
        double f1=Math.pow((firstNumber*firstNumber+secondNumber*secondNumber)/(firstNumber*firstNumber-secondNumber*secondNumber), f1Pow);
        double f2=Math.pow(firstNumber*firstNumber+secondNumber*secondNumber-Math.pow(thirdNumber,3 ),firstNumber-secondNumber );
        double diff=Math.abs(((firstNumber+secondNumber+thirdNumber)/3)-(f1+f2)/2);
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,diff);
    }
}
