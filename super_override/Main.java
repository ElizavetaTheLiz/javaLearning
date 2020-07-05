package super_override;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler= "İşlemler:\n" +
                "1. Yazılımcı İşlemleri\n" +
                "2. Yönetici İşlemleri\n" +
                "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("*************************");

        while (true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();


            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor. ");
                break;
            }



            else if (islem.equals("1")){
                Yazilimci yazilimci1 = new Yazilimci("Elizaveta", "G", 123, "Java, Python, C");
                String yazilimci_islemler = "Yazılımcı İşlemleri Şunlardır:\n" +
                        "1. Format Atmak\n" +
                        "2. Bilgileri Görüntülemek\n" +
                        "Çıkış için q'ya basın";
                System.out.println(yazilimci_islemler);

                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String yaz_islem = scanner.nextLine();

                    if (yaz_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor. ");
                        System.out.println(islemler);
                        break;
                    }

                    else if (yaz_islem.equals("1")){
                        System.out.print("İşletim sistemini giriniz: ");
                        String sistem = scanner.nextLine();
                        yazilimci1.formatAt(sistem);
                    }

                    else if (yaz_islem.equals("2")){
                        yazilimci1.bilgileriGoster();
                    }

                    else{
                        System.out.println("Geçersiz yazılımcı işlemi.");
                    }
                }
            }




            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Tilki", "A", 987, 9999);
                String yonetici_islemler = "Yazılımcı İşlemleri Şunlardır:\n" +
                        "1. Zam Yapmak\n" +
                        "2. Bilgileri Görüntülemek\n" +
                        "Çıkış için q'ya basın";

                System.out.println(yonetici_islemler);

                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String yon_islem = scanner.nextLine();

                    if (yon_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor. ");
                        System.out.println(islemler);
                        break;
                    }

                    else if (yon_islem.equals("1")){
                        System.out.print("Zam miktarını giriniz: ");
                        int zam = scanner.nextInt();
                        yonetici.zam_yap(zam);
                        scanner.nextLine();
                    }

                    else if (yon_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }

                    else{
                        System.out.println("Geçersiz yönetici işlemi.");
                    }
                }
            }

            else{
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}
