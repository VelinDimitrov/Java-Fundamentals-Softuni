package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    int Ax=input.nextInt();
        int Ay=input.nextInt();
        input.nextLine();
        int Bx=input.nextInt();
        int By=input.nextInt();
        input.nextLine();
        int Cx=input.nextInt();
        int Cy=input.nextInt();
        double formula=Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
        if (formula == 0) {
            System.out.println("0");
        } else {
            System.out.println((int)formula);
        }
    }
}
