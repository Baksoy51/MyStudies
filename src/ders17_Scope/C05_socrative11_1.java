package ders17_Scope;

public class C05_socrative11_1 {
    public static void main(String[] args) {

         class MyClass {

            int x = 1;

             int y;

            MyClass(int i){

                x = x + i;

                y = y + i;

            }

            public  void main(String[] args) {

                MyClass obj1 = new MyClass(5);

                System.out.println(obj1.x + ", " + obj1.y);

                MyClass obj2 = new MyClass(7);

                System.out.println(obj2.x + ", " + obj2.y);

            }

        }



    }
}
