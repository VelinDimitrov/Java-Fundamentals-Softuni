package com.softuni.techmodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int numberOfElements=Integer.parseInt(input.nextLine());
        List<Byte> numArr=new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            numArr.add(Byte.parseByte(input.nextLine() ));
        }

        String commands=input.nextLine();
        while (!commands.equals("party over")) {
                int[] command= Arrays.stream(commands.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int position=command[1];
            switch (command[0]) {
                case -1:


                    for (int i = 0; i <numArr.size() ; i++) {
                        StringBuilder binary=new StringBuilder(Integer.toBinaryString(numArr.get(position))).reverse();
                        if (binary.charAt(i) == '0') {
                            binary.setCharAt(position, '1');

                        } else {
                            binary.setCharAt(position, '0');
                        }
                        byte newNum=Byte.parseByte(binary.toString(), 2);
                        numArr.set(i,newNum );
                    }

                    break;
                case 0:
                    for (int i = 0; i < numArr.size(); i++) {
                        StringBuilder stringBuilder =new StringBuilder(Integer.toBinaryString(numArr.get(i))).reverse();
                        stringBuilder.setCharAt(position,'0' );
                        byte newNum1=Byte.parseByte(stringBuilder.toString(), 2);
                        numArr.set(i,newNum1 );
                    }
                    break;
                case 1:
                    for (int i = 0; i < numArr.size(); i++) {
                        StringBuilder stringBuilder =new StringBuilder(Integer.toBinaryString(numArr.get(i))).reverse();
                        stringBuilder.setCharAt(position,'1' );
                        byte newNum1=Byte.parseByte(stringBuilder.toString(), 2);
                        numArr.set(i,newNum1 );
                    }
                    break;


            }

            commands=input.nextLine();
        }
        for (Byte num : numArr) {
            System.out.println(num);
        }
    }
}
