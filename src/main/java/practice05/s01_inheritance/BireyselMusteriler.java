package practice05.s01_inheritance;

public class BireyselMusteriler extends Musteri {

    String tcKimlikNo;
    String dogumTarihi;

    public BireyselMusteriler(String musteriAdi, int musteriNo, double hesapBakiyesi, String tcKimlikNo, String dogumTarihi) {
        super(musteriAdi, musteriNo, hesapBakiyesi);
        this.tcKimlikNo = tcKimlikNo;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Bireysel Müsteri:" +
                super.toString() +
                "\n\tTC Kimlik No: " + tcKimlikNo +
                "\n\tDoğum Tarihi: " + dogumTarihi;
    }
}
