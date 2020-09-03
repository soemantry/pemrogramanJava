package com.soemantry.javafundamental.operator;

import com.sun.source.tree.ConditionalExpressionTree;

import java.util.concurrent.locks.Condition;

public class OperatorConditional {

    public static void main(String[] args) {
        int angka1 = 4;
        int angka2 = 5;

        System.out.println("Conditional And"); //salah satu tidak sesuai maka hasilnya flase
        boolean hasil = angka1 == 3 && angka2 ==5;
        boolean hasil1 = angka1 != 3 && angka2 ==5;

        System.out.println("Hasil Operator and pada syarat angka1 == 3 dan angka2 ==5 adalah " +hasil);
        System.out.println("Hasil Operator AND pada syarat angka1 != 3 dan angka2 ==5 adalah" +hasil1);
        System.out.println();
        System.out.println("Conditional OR"); // salah satu benar maka hasilnya true

        hasil = angka1 == 3 || angka2 == 5;
        hasil1 = angka1 != 3 || angka2 == 5;

        System.out.println("Hasil Operator AND pada syarat angka1 == 3 dan angka2 ==5 adalah " +hasil);
        System.out.print("Hasil Opertor AND pada syarat angka1 !=3 dan angka2 == 5 adalah " +hasil1);
        System.out.println();
    }
}
