package com.softuni.javaAdvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Character,Integer> chars=new TreeMap<>();
        String sentence=input.readLine();
        for (int i = 0; i < sentence.length(); i++) {
            char symbolFromSentence=sentence.charAt(i);
            
            if (!chars.containsKey(symbolFromSentence)) {
                chars.put(symbolFromSentence, 1);
            } else {
                chars.put(symbolFromSentence,chars.get(symbolFromSentence)+1);
            } 
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.printf("%c: %d time/s\n",entry.getKey(),entry.getValue());
        }

    }
}
