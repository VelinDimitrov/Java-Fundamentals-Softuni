package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    int a=input.nextInt();
	    double b= input.nextDouble();
        double c= input.nextDouble();
        StringBuilder binary=new StringBuilder(Integer.toBinaryString(a));
        while (binary.length()<10) {
            binary.insert(0,"0" );
        }
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|",a, binary,b,c);
    }
}
