package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 String name=input.nextLine();
	 String regex="[A-Z][a-z]+ [A-Z][a-z]+$";

        while (!name.equals("end")) {
            if (Pattern.matches(regex, name)) {
                System.out.println(name);
            }
            name=input.nextLine();
        }
    }
}
