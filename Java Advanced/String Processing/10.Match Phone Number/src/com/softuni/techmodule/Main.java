package com.softuni.techmodule;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
String num=input.nextLine();
String regex="\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        while (!num.equals("end")) {
            if (Pattern.matches(regex, num)) {
                System.out.println(num);
            }
            num=input.nextLine();
        }

    }
}
