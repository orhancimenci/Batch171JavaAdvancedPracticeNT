package practice05.s01_inheritance;

import java.time.LocalDate;

public class BankaYonetimUygulamasi {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1985, 03, 15);

        // Bireysel müşteri oluşturma
        BireyselMusteriler bireyselMusteri = new BireyselMusteriler(
                "Ahmet Yılmaz",
                1001,
                3000.0,
                "1234567890",
                dogumTarihi);

        System.out.println(bireyselMusteri.toString());

        // Kurumsal müşteri oluşturma
        KurumsalMusteriler kurumsalMusteri = new KurumsalMusteriler(
                "ABC Şirketi",
                2001,
                10000.0,
                "9876543210",
                "ABC Limited");

        System.out.println(kurumsalMusteri.toString());

        // Bireysel müşteri için para yatırma ve çekme işlemleri
        bireyselMusteri.paraYatir(2000.0);
        bireyselMusteri.paraCek(1000.0);

        // Kurumsal müşteri için para yatırma ve çekme işlemleri
        kurumsalMusteri.paraYatir(5000.0);
        kurumsalMusteri.paraCek(15000.0);
    }
}
