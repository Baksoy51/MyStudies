package ders10_StringConcatenation;

public class C03_startwith {
    public static void main(String[] args) {
        String str="manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti"));

        System.out.println(str.startsWith("m"));

        System.out.println("j ");
        System.out.println(str.startsWith("acarken", 6));

        System.out.println(str.startsWith("java", 10));
    }
}
