package ders10_StringConcatenation;

public class C06_Nullpointer {
    public static void main(String[] args) {
        String str1=" ";

        System.out.println(str1);
        System.out.println(str1.concat("Java"));
        String str2;
        str2="java candir";
        System.out.println(str2);
        String str3=null;
        System.out.println(str3);
       // System.out.println(str3.concat("Java"));
        System.out.println(str3+"Java");
    }
}
