package com.soemantry.javafundamental.perulangan;

import java.util.Scanner;

public class ForBersarang {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka untuk ForBersarang = ");
        int angka = scanner.nextInt();

        for (int i = 0; i <= angka; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}