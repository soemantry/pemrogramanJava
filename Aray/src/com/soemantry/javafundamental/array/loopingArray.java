package com.soemantry.javafundamental.array;

public class loopingArray {

    public static void main(String[] args ) {

        int[] angka = new int [1000];

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 1000000
        for ( int x = 0; x< angka.length; x++) {
            angka[x] = x+1;
            System.out.println(angka[x]);
        }
    }
}