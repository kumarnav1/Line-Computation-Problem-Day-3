package com.bl.line_comparison_problem;

import java.util.Scanner;

public class ComputeLine {

    private double totalLengthOne;
    private double totalLengthTwo;
    private int x1Point;
    private int x2Point;
    private int y1Point;
    private int y2Point;
    private int p1Point;
    private int p2Point;
    private int q1Point;
    private int q2Point;

    void takeInputs() {

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
    }

    void printCalculatedLines() {

        totalLengthOne = calculateLength(x1Point, x2Point, y1Point, y2Point);
        System.out.println("The Length of the Line One : " + totalLengthOne);
        totalLengthTwo = calculateLength(p1Point, p2Point, q1Point, q2Point);
        System.out.println("The Length of the Line Two : " + totalLengthTwo);
    }

    void isEqualPrint() {

        isEqualEqualsMethod(totalLengthOne, totalLengthTwo);
        isLinesEqualCompareToMethod(totalLengthOne, totalLengthTwo);
    }

    int takeInput(int point, char tempChar) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + tempChar + point + " Point : ");
        return scanner.nextInt();
    }

    double calculateLength(int aPoint, int bPoint, int cPoint, int dPoint) {

        double totalLength;
        double diffForX = bPoint - aPoint;
        double diffForY = dPoint - cPoint;
        double powForX = Math.pow(diffForX, 2);
        double powForY = Math.pow(diffForY, 2);
        double bothAddition = powForX + powForY;
        totalLength = Math.sqrt(bothAddition);
        return totalLength;
    }

    void isEqualEqualsMethod(Double firstLength, Double secondLength) {

        if (firstLength.equals(secondLength)) {
            System.out.println("The both lines are equal");
        } else
            System.out.println("The both lines are not equal");
    }

    void isLinesEqualCompareToMethod(Double firstLength, Double secondLength) {

        int valueAfterComparison = firstLength.compareTo(secondLength);
        if (valueAfterComparison != 0) {
            if (!(valueAfterComparison > 0)) {
                System.out.println("The line Two is greater than line One");
                return;
            }
            System.out.println("The lines One is greater than line Two");
        }
    }
}