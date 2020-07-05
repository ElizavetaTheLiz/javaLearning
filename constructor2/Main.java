package constructor2;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();


        Account hesap = new Account("Liza", "12345", 2000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }

}
