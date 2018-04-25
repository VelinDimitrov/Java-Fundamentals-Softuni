package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

	    int[] operations= Arrays.stream(input.readLine().split(" "))
             .mapToInt(x->Integer.parseInt(x))
             .toArray();

        List<Integer> listOfNums= Arrays.stream(input.readLine().split("\\s+"))
                .map(x->Integer.parseInt(x))
                .collect(Collectors.toList());

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        int elementsToPush=operations[0];
        int numberOfPopElements=operations[1];
        int containedNum=operations[2];

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(listOfNums.get(i));
        }

        for (int i = 0; i < numberOfPopElements; i++) {
            stack.pop();
        }

        if (stack.contains(containedNum)) {
            System.out.println("true");
        } else {
            if (stack.size() != 0) {
                System.out.println(stack.stream().min(Integer::compare).get());
            } else {
                System.out.println(0);
            }
        }


    }
}
