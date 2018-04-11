package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
        int rows=input.nextInt();
        int cols=input.nextInt();
        input.nextLine();

        //fill matrix
        String[][] matrix=new String[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=input.next();
            }
        }

        //find longest diagonal,line or column
        int longestCount=0;
        String repeatedWord="";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

            }
        }



    }
}
