import java.util.Scanner;

public class ders11Armstrong {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("sayınızı giriniz: ");

        String sayi = myScanner.nextLine();
        double uzunluk = sayi.length();

        double toplam = 0;


        for (byte i=0; i<uzunluk; i++){
            char basamakChar = sayi.charAt(i);
            double basamak = Character.getNumericValue(basamakChar);
            toplam = toplam + Math.pow(basamak, uzunluk);
        }


        if(Double.valueOf(sayi) == toplam){
            System.out.println("Bu bir armstrong sayısı!");
        }
        else{
            System.out.println("Sayınız bir armstrong sayısı değildir.");
        }
    }
}
