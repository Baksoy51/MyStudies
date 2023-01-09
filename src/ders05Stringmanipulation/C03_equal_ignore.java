package ders05Stringmanipulation;

public class C03_equal_ignore {
    public static void main(String[] args) {

        //equalsIgnorecase büyük küçük harf ayrımını ortadan kaldırır

        String str1="Ali";
        String str2="ali";
        String str3= "ALI";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str3));// true
    }
}
