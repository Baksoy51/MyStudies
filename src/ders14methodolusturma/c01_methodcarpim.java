package ders14methodolusturma;

import java.util.Scanner;

public class c01_methodcarpim {
    //main method içcerisnde kullanıcıdan iki sayi alın
    //bu iki sayiyi parametre kabul edin
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("iki sayi gir");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

    }

    public static double carpimMethodu(double sayi1, double sayi2 ){
        System.out.println("calisti");
        return  sayi1*sayi2;
    }
}
