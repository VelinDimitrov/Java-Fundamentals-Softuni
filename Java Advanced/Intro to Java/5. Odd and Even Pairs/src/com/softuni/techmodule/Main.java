package com.softuni.techmodule;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int[] numberArr= Arrays.stream(input.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
//        1, 2 -> different

        if (numberArr.length % 2 == 1) {
            System.out.println("invalid length");
        } else {
            for (int i = 0; i < numberArr.length; i+=2) {
                if (numberArr[i] % 2 == 0 && numberArr[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even%n",numberArr[i],numberArr[i+1]);
                } else if (numberArr[i] % 2 == 1 && numberArr[i + 1] % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd%n",numberArr[i],numberArr[i+1]);
                } else {
                    System.out.printf("%d, %d -> different%n",numberArr[i],numberArr[i+1]);
                }
            }
        }

    }
}
