package ahmethocaPractise;

import java.util.Scanner;

public class C01_denrs1 {
    public static void main(String[] args) {

        // kulanıcıdan sayı al
        // sayi pozotif ise 2 katını degilse sayıya 10 ekle yazdır

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi*2);}
    }
}
