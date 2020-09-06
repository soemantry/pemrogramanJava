package com.soemantry.javafundamental.array;

public class MultiArray {

    public static void main(String[] args) {

        char[][] angka = new char[2][];
        angka [0] = new char[2];
        angka [1] = new char[3];

        //DImensi 1 indexsnya 0 elemen  panjang elemen 2
        // indexs yaitun panjangnya angka
        //elemen yaitu panjangnya kolom
        angka[0][0] = 'A';
        angka[0][1] = 'B';

        //DImensi 1 indexsnya 1 ,  panjang elemen 3
        angka[1][0] = 'C';
        angka[1][1] = 'D';
        angka[1][2] = 'E';

        //tmapilkan dari dimensi 1 indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengan indeks 0 : " +angka[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengan indeks 1 : " +angka[0][1]);

        //tmapilkan dari dimensi 1 indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 0 : " +angka[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 1 : " +angka[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 2 : " +angka[1][2]);
    }
}
