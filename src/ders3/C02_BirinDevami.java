package ders3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C02_BirinDevami {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Double> gununSicaklari=new ArrayList<>();

        int sonlandirmaDegeri=100;

        double girilenSicaklik =0;
        int sayac = 0;

        do {
            System.out.println("Listeye eklemek icin bir sicaklik degeri girin"
                    +"\nsicaklik girisini sonlandirmak icin 100 girin");

            girilenSicaklik= scan.nextDouble();

            if(girilenSicaklik !=100) {
                gununSicaklari.add(girilenSicaklik);
                sayac++;

            }
        } while(girilenSicaklik !=100); {
            System.out.println("veri girisi sonlandirildi");
        }
        Collections.sort(gununSicaklari);

        System.out.println("Gunun en dusuk sicakligi :" + gununSicaklari.get(0));
        System.out.println("Gunun en yuksek sicakligi :" + gununSicaklari.get(sayac-1));



    }
    }

