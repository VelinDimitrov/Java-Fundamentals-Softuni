package com.softuni.techmodule;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 int n=Integer.parseInt(input.nextLine());

        List<Integer> list= Arrays.stream(input.nextLine().split(", "))
                .map(x->Integer.parseInt(x))
                .collect(Collectors.toList());

        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) != list.get(i + 1) - 1) {
                System.out.println(list.get(i)+1);
                break;
            }
        }
    }
}
