package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double a =input.nextDouble();
        double b=input.nextDouble();
        double result= a*b;
        System.out.printf("%.2f",result);
    }
}
