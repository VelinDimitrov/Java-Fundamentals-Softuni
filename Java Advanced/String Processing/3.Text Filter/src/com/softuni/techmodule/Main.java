package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         String[] bannedWords=input.nextLine().split(", ");
         String text=input.nextLine();

        for (String bannedWord : bannedWords) {
            text=text.replace(bannedWord,new String(new char[bannedWord.length()]).replace("\0", "*"));
        }
        System.out.println(text);
    }
}
