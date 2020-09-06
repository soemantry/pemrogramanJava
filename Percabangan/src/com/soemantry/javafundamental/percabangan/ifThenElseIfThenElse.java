package com.soemantry.javafundamental.percabangan;

import java.util.Scanner;

public class ifThenElseIfThenElse {
    public  static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char katagori;

        System.out.print("Masukan Nama Anda = ");
        String nama = scanner.next();
        System.out.print("Masukan Nilai Anda = ");
        int nilaiUjian = scanner.nextInt();

        if (nilaiUjian >= 90 ) {
            katagori = 'A';
        } else if (nilaiUjian >= 80 ) {
            katagori = 'B';
        } else if (nilaiUjian >= 70 ) {
            katagori = 'C';
        } else if (nilaiUjian >= 60 ) {
            katagori = 'D';
        } else if (nilaiUjian >= 50 ) {
            katagori = 'E';
        } else {
            katagori = 'F';
        }
        System.out.println("Selamat! " +nama);
        System.out.println("Nilai Ujian Akhir Anda adalah " +katagori);

        if (nilaiUjian >= 70 ) {
            System.out.println("Selamat Anda LULUS");
        } else {
            System.out.println("Anda Belum Lulus");
        }
    }
}
