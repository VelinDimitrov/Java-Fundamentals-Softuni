package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int[] numberArr= Arrays.stream(input.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
	String[] commandLine= input.readLine().split(" ");
	String typeOfNum=commandLine[2];
	int numberOfNumbers=Integer.parseInt(commandLine[1]);
        List<Integer> wantedType=new ArrayList<>();
        int index=0;
        while (wantedType.size()<numberOfNumbers && numberArr.length > index) {
            if (typeOfNum.equals("even")) {
                if (numberArr[index] % 2 == 0) {
                    wantedType.add(numberArr[index]);
                }
            } else if (typeOfNum.equals("odd")){
                if (numberArr[index] % 2 == 1) {
                    wantedType.add(numberArr[index]);
                }
            }
            index++;
        }
        for (int num :
                wantedType) {
            System.out.print(num+" ");
        }
    }
}
