import java.util.Scanner;


public class methods1 {


    public static void selamlama() {
        System.out.println("merhabalar");
    }

    public static void faktoriyel(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = myScanner.nextInt();

        int faktoriyel = 1;
        while (sayi > 0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel = " + faktoriyel);
    }



    public static void main(String[] args) {
        /*önce opsiyonel olarak erişim belirleyici girilir(public, private vs)
        * sonra static veya final gibi ekstra özellikler yazılır
        * void gibi bir dönüş tipi de girildikten sonra vazgeçilmez iki özelliğe gelinir:
        * fonksiyon adı ve (parametreler)*/

        selamlama();

        faktoriyel();

    }
}
