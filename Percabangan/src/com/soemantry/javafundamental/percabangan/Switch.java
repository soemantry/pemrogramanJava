package com.soemantry.javafundamental.percabangan;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args ) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukan NIlai Input = " );
        int input = scanner.nextInt();

        switch (input) {
            case 1 :
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3 :
                System.out.println("3");
                break;
            case 4 :
                System.out.println("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6 :
                System.out.println("6");
                break;
            case 7 :
                System.out.println("7");
                break;
            case 8 :
                System.out.println("8");
                break;
            case 9 :
                System.out.println("9");
                break;
            default:
                break;

        }
        System.out.println("Inputannya adalah = " +input);
    }
}
