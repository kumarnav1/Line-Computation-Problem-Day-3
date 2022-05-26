package com.bl.line_comparison_problem;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Problem Project");

        ComputeLine computeLine = new ComputeLine();
        computeLine.takeInputs();
        computeLine.printCalculatedLines();
        computeLine.isEqualPrint();
    }
}