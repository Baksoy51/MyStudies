package ders17_Scope;

public class C04_Socrative {
    public static void main(String[] args) {

        System.out.println();
    }

        public class Deneme {


            String isim = "Ali Can";

            int yas = 33;

            int kilo = 85;



            Deneme( ){

            }

            Deneme(String isim, int yas){

                this.isim = isim;

                this.yas = yas;

            }


            Deneme(String isim){

                this.isim = isim;

            }
            Deneme insan01 = new Deneme();


        }


    }

