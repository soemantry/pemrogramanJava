package com.soemantry.javafundamental.operator;

import java.util.Scanner;

public class OperatorAritmatika {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : " );
        String nama1 = scanner.next();

        System.out.println("Oprasi Perkalian");
        int hasilperkalian = 10 * 3;
        System.out.println("Hasil 10 x 3 = " +hasilperkalian);
        System.out.println("Masukan Angkanya untuk perkalian");
        System.out.print("Angka Pertama = ");
        int angka1 = scanner.nextInt();
        System.out.print("Angka Kedua = ");
        int angka2 = scanner.nextInt();
        int jumlahperkalian = angka1*angka2;
        System.out.println("Hasil Perkalianya yaitu " +jumlahperkalian);
        System.out.println();

        System.out.println("Oprasi Modulus");
        int hasilmodulus = 11 % 2;
        System.out.println("Hasilnya adalah " + hasilmodulus);
        System.out.println();

        System.out.println("Oprasi Pembagian");
        int hasilpembagian = 10/5;
        System.out.print( "hasil pembagiannya adalah " +hasilpembagian);
        System.out.println();



    }
}
