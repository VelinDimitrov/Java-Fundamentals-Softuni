package com.softuni.techmodule;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     int rows=input.nextInt();
	     int cols=input.nextInt();
	     String[][] matrix= new String[rows][cols];
	     int ch=(int)'a';
		for (int i = 0; i <rows ; i++) {
			for (int j = 0; j < cols; j++) {
				char betweenChar=(char)(ch+j);
				char startingChar=(char) ch;
				matrix[i][j]=String.valueOf(startingChar);
				matrix[i][j]+=betweenChar;
				matrix[i][j]+=startingChar;
			}
			ch++;
		}

		for (String[] strings : matrix) {
			for (String string : strings) {
				System.out.print(string+" ");
			}
			System.out.println();
		}
    }
}
