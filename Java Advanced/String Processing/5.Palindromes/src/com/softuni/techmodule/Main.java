package com.softuni.techmodule;






import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 String[] words=input.nextLine().split("[, !?.]+");
        TreeSet<String> palindrome=new TreeSet<>();
        for (String word : words) {
            if (isPalindrome(word)) {
                palindrome.add(word);
            }
        }
        System.out.println(Arrays.toString(palindrome.toArray()));

    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
