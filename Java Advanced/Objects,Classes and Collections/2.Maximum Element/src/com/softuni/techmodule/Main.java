package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<Long> stack=new ArrayDeque<>();
        int numberOfCommands= Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command=reader.readLine().split(" ");
            switch (command[0]) {
                case "1":
                    stack.push(Long.valueOf(command[1]));
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "3":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.stream().max(Long::compare).get());
                    }
                    break;
            }
        }
    }
}
