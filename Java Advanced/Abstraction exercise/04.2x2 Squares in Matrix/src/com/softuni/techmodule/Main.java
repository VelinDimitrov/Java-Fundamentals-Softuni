package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
        int rows= input.nextInt();
        int cols=input.nextInt();
        input.nextLine();
        char[][] matrix=new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=input.next().charAt(0);
            }
            input.nextLine();
        }
        System.out.println(numberOfEqualSquares(matrix));


    }

    private static int numberOfEqualSquares(char[][] matrix) {
        int count=0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                boolean isUpperRowEqal=matrix[i][j]==matrix[i][j+1];
                boolean isDownRowEqal=matrix[i+1][j]==matrix[i+1][j+1];
                boolean areEqual=matrix[i][j]==matrix[i+1][j];
                if (areEqual && isDownRowEqal && isUpperRowEqal) {
                    count++;
                }

            }
        }
        return count;
    }

}
