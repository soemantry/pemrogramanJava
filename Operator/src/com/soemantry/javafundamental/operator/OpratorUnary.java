package com.soemantry.javafundamental.operator;

public class OpratorUnary {

    public static void main(String[] args) {

       System.out.println("Operator Unary Plus");
       int nilaiAwal = 5;
       int hasil  = +nilaiAwal;
       System.out.println("Hasil Unary plus 5 = " +hasil);
       System.out.println();

       System.out.println("HAsil Unary Minus 5");
       int nilaikedua = 5;
       nilaikedua = -nilaikedua;
       System.out.print("Hasil Unary minus 5 = " +nilaikedua);
       System.out.println();

       System.out .println("Operator peningkatan satu nilai satu ");
       int nilaiketiga = 5;
       nilaiketiga++;
       System.out.println("Hasil pengingkatan satu point dari 5 = " +nilaiketiga);
       System.out.println();

       System.out.println("Hasil pengurangan satu nilai dari " );
       int nilaikempat = 5;
       nilaikempat--;
       System.out.println("Hasil pengurangan dari 5 yaitu =" +nilaikempat);
       System.out.println();

       System.out.println("Operator Komplemen Logika");
       boolean sukses = false; //nilai suskses adalah false
       System.out.println("Hasil false = " +!sukses);
       System.out.println();
    }
}
