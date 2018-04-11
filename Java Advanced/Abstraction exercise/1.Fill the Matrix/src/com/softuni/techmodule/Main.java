package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(", ");
        int N = Integer.parseInt(arr[0]);

        int[][] matrix = new int[N][N];
        int num = 1;
        if (arr[1].equals("A")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = num++;
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[j][i] = num++;
                    }
                } else {
                    for (int j = matrix.length - 1; j >= 0; j--) {
                        matrix[j][i] = num++;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

    }
}
