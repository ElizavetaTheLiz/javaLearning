import java.util.Scanner;

public class ders10ATM {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int bakiye = 1000;

        String bilgi = "1. Işlem : Bakiye Öğrenme \n" +
                "2. Işlem : Para Çekme \n" +
                "3. Işlem : Para Yatırma \n" +
                "Çıkış için 0'a basın \n";

        System.out.println("**********************************");
        System.out.println(bilgi);
        System.out.println("**********************************\n");


        while (true){
            System.out.print("İşlem türünüzü giriniz: ");
            int islem = scanner1.nextInt();

            if(islem == 1){
                System.out.println("Bakiyeniz: " + bakiye + "TL'dir");
            }

            else if(islem == 2){
                System.out.print("Ne kadar para çekmek istiyorsunuz? : ");
                int cekme = scanner1.nextInt();
                if(cekme > bakiye || cekme <0){
                    System.out.println("Bakiyeniz " + bakiye + "TL'dir. Bakiye miktarının üstünde veya 0'ın altında para çekme işlemi gerçekleştirilememektedir.");
                }
                else{
                        bakiye = bakiye - cekme;
                        System.out.println("İşleminiz başarıyla tamamlandı. Yeni bakiye miktarınız: " + bakiye + "TL");
                    }
            }

            else if(islem == 3){
                System.out.print("Ne kadar para yüklemek istiyorsunuz? : ");
                int yukleme = scanner1.nextInt();
                if(yukleme <0){
                    System.out.println("Sıfırdan küçük değerlerde para yüklemesi gerçekleştirilememektedir.");
                }
                else{
                    bakiye = bakiye + yukleme;
                    System.out.println("İşleminiz başarıyla tamamlandı. Yeni bakiye miktarınız: " + bakiye + "TL");
                }
            }

            else if(islem == 0){
                System.out.println("İşleminiz sonlandırılmıştır.");
                break;
            }

            else{
                    System.out.println("Geçersiz işlem. Lütfen tekrardan deneyiniz.");
                }
        }

    }
}

