package com.soemantry.javafundamental.operator;

public class OperatorEquality {

    public static void main(String[] args) {

        int angka1 = 2;
        int angka2 = 3;
        boolean hasil;

        System.out.println("Sama dengan");
        hasil = angka1 == angka2;
        System.out.println("Hasil 'angka1 == angka2' adalah " +hasil);
        System.out.println();

        System.out.println("Tidak Sama dengan...");
        hasil = angka1 != angka2;
        System.out.println("Hasil 'angka 1 != angka2' adalah " +hasil);
        System.out.println();

        System.out.println("lebih besar dari ");
        hasil = angka1 >= angka2;
        System.out.println("Hasil 'angka1 >= angka2' adalah " +hasil);
        System.out.println();

        System.out.println("kurang dari..");
        hasil = angka1 < angka2;
        System.out.println("Hasil 'angka1 < angka2' adlaah  " +hasil);
        System.out.println();

        System.out.println("Sama atau lebih besar dari ");
        hasil= angka1>=angka2;
        System.out.println("Hasil dari 'angka1>=angka2' adalah " +hasil);
        System.out.println();

        System.out.println("kurang dari sama dengan..");
        hasil = angka1 <=angka2;
        System.out.println("Hasil 'angka1 <= angka2' adalah " +hasil );
        System.out.println();

    }
}
