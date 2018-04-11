package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	    int sizeOfMatrix= Integer.parseInt(input.nextLine());
	    int[][] matrix=new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix[i][j]=input.nextInt();
            }
            input.nextLine();
        }
        System.out.println(calculateDiagonalDifference(matrix));


    }

    private static int calculateDiagonalDifference(int[][] matrix) {
        int primaryDiagonal=0;
        int secondaryDiagonal=0;
        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonal+=matrix[i][i];
            secondaryDiagonal+=matrix[i][matrix.length-i-1];
        }

        return Math.abs(primaryDiagonal-secondaryDiagonal);
    }
}
