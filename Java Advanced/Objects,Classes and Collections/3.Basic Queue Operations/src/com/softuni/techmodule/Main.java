package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> queue =new ArrayDeque<>();

        int[] operations = Arrays.stream(input.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> numList= Arrays.stream(input.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < operations[0]; i++) {
            queue.add(numList.get(i));
        }

        for (int i = 0; i < operations[1]; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        if (queue.contains(operations[2])) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(queue.stream().min(Integer::compare).get());
            } else {
                System.out.println(0);
            }
        }
    }
}
