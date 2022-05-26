package com.bl.line_comparision_problem;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem Project");
        int x1Point, x2Point, y1Point, y2Point;
        int p1Point, p2Point, q1Point, q2Point;
        Double totalLengthOne;
        Double totalLengthTwo;

        System.out.println("Enter the properties of line one");
        x1Point = takeInput(1, 'x');
        x2Point = takeInput(2, 'x');
        y1Point = takeInput(1, 'y');
        y2Point = takeInput(2, 'y');
        System.out.println("Enter the properties of line two");
        p1Point = takeInput(1, 'p');
        p2Point = takeInput(2, 'q');
        q1Point = takeInput(1, 'p');
        q2Point = takeInput(2, 'q');

        totalLengthOne = calculateLength(x1Point, x2Point, y1Point, y2Point);
        System.out.println("The Length of the Line One : " + totalLengthOne);

        totalLengthTwo = calculateLength(p1Point, p2Point, q1Point, q2Point);
        System.out.println("The Length of the Line Two : " + totalLengthTwo);

        isEqual(totalLengthOne, totalLengthTwo);
    }

    static int takeInput(int point, char tempChar) {

        Scanner refVarSc = new Scanner(System.in);
        System.out.print("Enter " + tempChar + point + " Point : ");
        return refVarSc.nextInt();
    }

    static double calculateLength(int aPoint, int bPoint, int cPoint, int dPoint) {

        Double totalLength;
        double diffForX = bPoint - aPoint;
        double diffForY = dPoint - cPoint;
        double powForX = Math.pow(diffForX, 2);
        double powForY = Math.pow(diffForY, 2);
        double bothAddition = powForX + powForY;
        totalLength = Math.sqrt(bothAddition);
        return totalLength;
    }

    static void isEqual(Double firstLength, Double secondLength) {

        if (firstLength.equals(secondLength)) {
            System.out.println("The lines are equal");
        } else
            System.out.println("The lines are not equal");
    }
}