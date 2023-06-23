package practice06.s01_polymorphism;

public class SesDosyasi extends Medya {
    public SesDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("Ses dosyası oynatılıyor: " + getDosyaAdi());
    }

    @Override
    public void duraklat() {
        System.out.println("Ses dosyası duraklatıldı: " + getDosyaAdi());
    }
}

