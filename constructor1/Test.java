package constructor1;

public class Test {

    public static void main(String[] args) {
        Account hesap1 = new Account();
        Account hesap2 = new Account("123231", 1000.0, "Liza", "lz@gmail.com", "495834095");
        Account hesap3 = new Account("Leyla", "leyla@gmail.com", "48689063498");

        hesap2.paraYatir(500.0);
        System.out.println("------------------------------------------");


        System.out.println(hesap1.getIsim());
        System.out.println("------------------------------------------");


        hesap3.bilgilerigoster();

    }

}
