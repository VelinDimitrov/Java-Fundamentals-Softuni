package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     StringBuilder word=new StringBuilder(input.nextLine());

        System.out.println(word.codePointAt(1));
    }
}
