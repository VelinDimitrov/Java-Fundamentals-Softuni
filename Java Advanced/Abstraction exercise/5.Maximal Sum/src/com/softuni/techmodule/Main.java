package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);

        int rows=input.nextInt();
        int cols=input.nextInt();
        int[][] matrix=new int[rows][cols];
        input.nextLine();

        //filling matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=input.nextInt();
            }
            input.nextLine();
        }

        //find best Sum
        int bestSum=0;
        int rowIndex=0;
        int colIndex=0;

        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                int upperThreeNums=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2];
                int middleThreeNums=matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2];
                int downThreeNums=matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                int sum=upperThreeNums+middleThreeNums+downThreeNums;
                if (sum > bestSum) {
                    rowIndex=i;
                    colIndex=j;
                    bestSum=sum;
                }
            }
        }

       printBestSumMatrix(matrix,bestSum,rowIndex,colIndex);


    }

    private static void printBestSumMatrix(int[][] matrix, int bestSum, int rowIndex, int colIndex) {
        System.out.println("Sum = "+bestSum);
        for (int i = rowIndex; i < rowIndex+3; i++) {
            for (int j = colIndex; j < colIndex+3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}
