package super_override;

public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;


    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }


    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }


    public void zam_yap(int miktar){
        System.out.println("Çalışanlara " + miktar + "Tl zam yapılmıştır.");
    }


    public int getSorumlu_kisi_sayisi() {
        return sorumlu_kisi_sayisi;
    }

    public void setSorumlu_kisi_sayisi(int sorumlu_kisi_sayisi) {
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
}
