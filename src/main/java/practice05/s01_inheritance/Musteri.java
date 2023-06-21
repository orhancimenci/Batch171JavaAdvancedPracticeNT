package practice05.s01_inheritance;

public class Musteri {
    String musteriAdi;
    int musteriNo;
    private double hesapBakiyesi;

    public Musteri(String musteriAd, int musteriNo, double hesapBakiyesi) {
        this.musteriAdi = musteriAd;
        this.musteriNo = musteriNo;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatir(double miktar) {
        hesapBakiyesi += miktar;
        System.out.println(miktar + " TL hesaba yatırıldı. Yeni bakiye: " + hesapBakiyesi + " TL");
    }

    public void paraCek(double miktar) {
        if (miktar <= hesapBakiyesi) {
            hesapBakiyesi -= miktar;
            System.out.println(miktar + " TL hesaptan çekildi. Yeni bakiye: " + hesapBakiyesi + " TL");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public String toString() {
        return  "\n\tMüşteri Adı: " + musteriAdi +
                "\n\tMüşteri No: " + musteriNo +
                "\n\tHesap Bakiyesi: " + hesapBakiyesi;
    }
}