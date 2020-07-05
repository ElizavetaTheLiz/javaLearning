package constructor2;

import java.util.Scanner;

public class Login {

    public boolean login(Account hesap){
        Scanner myScanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullanici_adi = myScanner.nextLine();
        System.out.print("Parolanızı giriniz: ");
        parola = myScanner.nextLine();

        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
    }

}
