package com.company;

import java.util.Scanner;

public class IsoscelesTriangle {

    private static String blankSpace = " ";
    public static void getIsoscelesTriangle(int noOfLine){
        for(int itr = 1; itr <= noOfLine; itr++){
            for(int blankSpaceNumber = 0; blankSpaceNumber < (noOfLine - itr); blankSpaceNumber++)
                System.out.print(blankSpace);
            for(int asteriskNumber = 0; asteriskNumber < ((itr*2)-1); asteriskNumber++)
                System.out.print(new Asterisk().getAsterisk());
            System.out.println();
        }
    }

    public static void main(String[] args) {
	    Scanner S = new Scanner(System.in);

	    System.out.print("Enter number of line = ");
	    int noOfLine = S.nextInt();
        getIsoscelesTriangle(noOfLine);
    }
}
