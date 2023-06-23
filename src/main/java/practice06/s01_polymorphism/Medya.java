package practice06.s01_polymorphism;

public abstract class Medya {
    private final String dosyaAdi;

    public Medya(String dosyaAdi) {
        this.dosyaAdi = dosyaAdi;
    }

    public String getDosyaAdi() {
        return dosyaAdi;
    }

    // Medya oynatma metodu (her alt sınıf tarafından uygulanmalı)
    public abstract void oynat();

    // Medya durdurma metodu (her alt sınıf tarafından uygulanmalı)
    public abstract void duraklat();

    @Override
    public String toString() {
        return "Dosya Adı\t= " + dosyaAdi;
    }
}
