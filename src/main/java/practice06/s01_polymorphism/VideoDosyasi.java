package practice06.s01_polymorphism;

public class VideoDosyasi extends Medya {
    public VideoDosyasi(String dosyaAdi) {
        super(dosyaAdi);
    }

    @Override
    public void oynat() {
        System.out.println("Video dosyası oynatılıyor: " + getDosyaAdi());
    }

    @Override
    public void duraklat() {
        System.out.println("Video dosyası duraklatıldı: " + getDosyaAdi());
    }
}
