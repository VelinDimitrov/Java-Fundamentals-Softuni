package com.softuni.techmodule;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
	     int numberOfPeople=Integer.parseInt(input.nextLine());
	     String[] people=new String[numberOfPeople];
	     int[] pointsOfPeople=new int[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            String name=input.nextLine();
            people[i]=name;
            pointsOfPeople[i]=Integer.parseInt(input.nextLine());
        }

        int indexOfBestScorePerson=0;
        int bestPoints=0;
        for (int i = 0; i < people.length; i++) {
            pointsOfPeople[i]=pointsOfPeople[i]+getPointsOutOfName(people[i]);
            if (pointsOfPeople[i] > bestPoints) {
                indexOfBestScorePerson=i;
                bestPoints=pointsOfPeople[i];
            }
        }

        System.out.printf("The winner is %s - %d points",people[indexOfBestScorePerson],bestPoints);


    }

    private static int getPointsOutOfName(String person) {
       int sum=0;
        for (int i = 0; i < person.length(); i++) {
            int pointOfChar=person.charAt(i);
            if (pointOfChar % 2 == 0) {
                sum += pointOfChar;
            } else {
                sum-=pointOfChar;
            }
        }
        return sum;
    }
}
