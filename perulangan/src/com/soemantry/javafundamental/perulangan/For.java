package com.soemantry.javafundamental.perulangan;

import java.util.Scanner;

public class For {

    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka untuk diulang : ");
        int angka = scanner.nextInt();
        for (int a = angka ; a<= 10 ; a++) {
            System.out.println("Angka : " +a);
        }

        if (angka <=10){
            System.out.println("Selamat Anda Berhasil");
        } else {
            System.out.println("Anda Belum Berhasil");
        }
    }
}
