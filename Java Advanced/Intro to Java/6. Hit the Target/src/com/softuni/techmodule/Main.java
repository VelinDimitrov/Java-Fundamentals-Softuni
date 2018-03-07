package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    int specialNum=input.nextInt();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == specialNum) {
                    System.out.printf("%d + %d = %d%n",i,j,i+j);
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == specialNum) {
                    System.out.printf("%d - %d = %d%n",i,j,i-j);
                }
            }
        }
    }
}
