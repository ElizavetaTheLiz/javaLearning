/*

import java.util.Scanner;

public class methods4 {

    public static int compare(int ilkSayi, int ikinciSayi){
        return Math.min(ilkSayi, ikinciSayi);
    }


    public static int ebob(int sayi, int sayi2){

        for (int a=compare(sayi, sayi2); a>0; a--){
            if (sayi % a == 0  &&   sayi2 % a == 0){
                return a;
            }
        }
    return 1;
    }



    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("İlk sayınızı giriniz: ");
        int girilen1 = myScanner.nextInt();
        System.out.print("İkinci sayınızı giriniz: ");
        int girilen2 = myScanner.nextInt();
        System.out.println("Ebob bulma işlemi sonucu: " + ebob(girilen1, girilen2));
    }

}



 BU DA AYNI GÖREVİ GÖREN BİR BAŞKA KODUMUZ:
*/
import java.util.Scanner;

public class methods4 {


    public static int ebobBulma(int sayi1, int sayi2){

    int ebob = 1;

        for (int i = 1; i <= sayi1  &&  i<= sayi2; i++){
            if ((sayi1 % i == 0)  &&   (sayi2 % i == 0)){
                ebob = i;
            }
        }
    return ebob;
    }



    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("İlk sayınızı giriniz: ");
        int girilen1 = myScanner.nextInt();
        System.out.print("İkinci sayınızı giriniz: ");
        int girilen2 = myScanner.nextInt();
        System.out.println("Ebob bulma işlemi sonucu: " + ebobBulma(girilen1, girilen2));
    }
}

