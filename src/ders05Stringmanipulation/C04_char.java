package ders05Stringmanipulation;

public class C04_char {
    public static void main(String[] args) {

        String str= "Java Candir";
        System.out.println(str.charAt(0)); // ilk harfi verir
        System.out.println(str.charAt(5)); //5. indeks deki char ı verir
        System.out.println(str.charAt(10)); // char sayısı=son index+1

        System.out.println(str.charAt(11));
    }
}
