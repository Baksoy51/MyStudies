package ders1;

public class C04_youtebe {
    public static void main(String[] args) {

        int sayi=941555;
        int top=0;
        int birleB=0;

        birleB=sayi%10;
        top=top+birleB;
        sayi=sayi/10;

        birleB=sayi%10;
        top=top+birleB;
        sayi=sayi/10;

        birleB=sayi%10;
        top=top+birleB;
        sayi=sayi/10;

        birleB=sayi%10;
        top=top+birleB;
        sayi=sayi/10;

        birleB=sayi%10;
        top=top+birleB;
        sayi=sayi/10;

        System.out.println(top);

    }
}
