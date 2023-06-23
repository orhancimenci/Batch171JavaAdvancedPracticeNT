package practice06.s01_polymorphism;

public class MedyaOynatici {
    public static void main(String[] args) {
        // Ses dosyası oluşturuldu
        SesDosyasi sesDosyasi = new SesDosyasi("muzik.mp3");
        sesDosyasi.oynat();    // Ses dosyasını oynat

        // Video dosyası oluşturuldu
        VideoDosyasi videoDosyasi = new VideoDosyasi("video.mp4");
        videoDosyasi.oynat();  // Video dosyasını oynat

        // Polymorphism kullanarak farklı türdeki medya dosyalarını yönetme
        Medya medya1 = new SesDosyasi("muzik2.mp3");
        Medya medya2 = new VideoDosyasi("video2.mp4");

        medya1.oynat();        // Ses dosyasını oynat
        medya2.oynat();        // Video dosyasını oynat

        medya1.duraklat();     // Ses dosyasını duraklat
        medya2.duraklat();     // Video dosyasını duraklat
    }
}
