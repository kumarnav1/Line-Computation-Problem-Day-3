package com.bl.line_comparision_problem;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem Project");
        int x1Point, x2Point, y1Point, y2Point;
        Double totalLength;

        System.out.println("Enter the properties of line");
        x1Point = takeInput(1, 'x');
        x2Point = takeInput(2, 'x');
        y1Point = takeInput(1, 'y');
        y2Point = takeInput(2, 'y');

        totalLength = calculateLength(x1Point, x2Point, y1Point, y2Point);

        System.out.println("The Length of the Line : " + totalLength);
    }

    static int takeInput(int point, char tempChar) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + tempChar + point + " Point : ");
        return scanner.nextInt();
    }

    static Double calculateLength(int x1Point, int x2Point, int y1Point, int y2Point) {

        double diffForX = x2Point - x1Point;
        double diffForY = y2Point - y1Point;
        double powForX = Math.pow(diffForX, 2);
        double powForY = Math.pow(diffForY, 2);
        double bothAddition = powForX + powForY;
        return Math.sqrt(bothAddition);
    }
}