package com.soemantry.javafundamental.percabangan;

public class SwitchTanpaBreak {

    public static void main(String[] args ) {

        char input = 'C';
        int output = 0;

        switch (input ) {
            case  'A' :
                output++;
            case 'B' :
                output++;
            case 'C' :
                output++;
            case 'D' :
                output++;
            default :
                output++;
        }
        System.out.println("NIlai akhirnya adalah = " +output);
    }
}
