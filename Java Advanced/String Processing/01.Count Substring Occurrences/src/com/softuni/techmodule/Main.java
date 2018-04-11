package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     String line=input.nextLine().toLowerCase();
	     String ocurringWord=input.nextLine().toLowerCase();

       int counter=0;
       int indexOfOcurrance=line.indexOf(ocurringWord);
        while (indexOfOcurrance!=-1) {
            counter++;
            indexOfOcurrance=line.indexOf(ocurringWord,indexOfOcurrance+1);
        }

        System.out.println(counter);
    }
}
