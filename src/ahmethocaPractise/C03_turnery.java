package ahmethocaPractise;

public class C03_turnery {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin
        int kenar1= 10;
        int kenar2=10;
        int kenar3=10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "eskenar ücgen"  : "degil");

        // kullamıcıdan 2 sayı alkücük aolanınyazdır

        int sayi1=12;
        int sayi2=11;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

    }
}
