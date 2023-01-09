package ders10_StringConcatenation;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        // sifre kontrulu yapan bir kontrol hazırla
        /*

        1- mail @ iarei yoksa gecersiz mail
        2- @gmail.com yoksa gmail adrsi giriniz
        3- @gmail.com ile bitmiyorsa yazım hatası
         */


        String email= "ahmet@bulutluoz.com";
        if (!email.contains("@")){
            System.out.println("gecersiz email");}
             else if (!email.endsWith("@gmail.com")){
                System.out.println("yazim hatasi");

            }

    }
}
