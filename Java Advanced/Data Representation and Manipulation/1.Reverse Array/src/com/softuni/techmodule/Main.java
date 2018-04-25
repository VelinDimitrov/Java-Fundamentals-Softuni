package com.softuni.techmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int[] arr= Arrays.stream(reader.readLine().split(" "))
                .mapToInt(x->Integer.parseInt(x))
                .toArray();

        reverseArray(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }

    private static void reverseArray(int[] arr,int start,int end) {
        if (start < end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(arr, ++start, --end);
        }
    }
}
