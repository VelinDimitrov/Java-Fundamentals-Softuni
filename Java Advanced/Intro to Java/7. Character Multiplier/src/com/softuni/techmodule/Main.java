package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	    String firstStr=input.next();
        String secondStr=input.next();
        int sum=0;
        String biggerStr=firstStr.length()>secondStr.length()?firstStr:secondStr;
        String littleStr=firstStr.equals(biggerStr)?secondStr:firstStr;
        int i;
        for (i = 0; i < littleStr.length(); i++) {

                int multyplication=biggerStr.charAt(i)*littleStr.charAt(i);
                sum+=multyplication;

        }
        while (i < biggerStr.length()) {
            sum+=biggerStr.charAt(i);
            i++;
        }
        System.out.println(sum);
    }
}
