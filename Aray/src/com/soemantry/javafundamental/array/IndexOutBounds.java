package com.soemantry.javafundamental.array;

public class IndexOutBounds {

    public static void main(String[] args ) {
        int[] angka = {1,2,3,4};
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        ///akses indexs 4
        System.out.println(angka[4]);
    }
}
