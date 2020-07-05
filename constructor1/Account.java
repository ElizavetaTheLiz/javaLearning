package constructor1;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;


    //OVERLOADING YAPIYORUZ
    //CONSTRUCTOR 1.
    public Account(String isim, String email, String telefonNo){

        /*this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;*/

        this("Bilgi yok.", 0.0, isim, email, telefonNo);
    }


    public Account(){
        this("Bilgi yok.", 0.0, "Bilgi yok.", "Bilgi yok.", "Bilgi yok.");

    }



    //CONSTRUCTOR 2.
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){

        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }



    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiye = " + bakiye);
    }



    public void paraCekme(double miktar){
        if(miktar > 1500){
            System.out.println("Bu miktarda para çekilemez.");
        }
        else if(bakiye - miktar < 0){
            System.out.println("bakiyeniz: " + bakiye + "TL. Bakiye miktarından daha fazla para çekemezsiniz.");
        }
        else{
            bakiye += miktar;
            System.out.println("İşleminiz başarıyla gerçekleştirdi. Yeni bakiye: " + bakiye);
        }
    }


    public void bilgilerigoster(){
        System.out.println("Hesap nuramarası: " + hesapNo);
        System.out.println("Bakiye: " + bakiye);
        System.out.println("İsim: " + isim);
        System.out.println("Email: " + email);
        System.out.println("Telefon no:" + telefonNo);
    }




    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
