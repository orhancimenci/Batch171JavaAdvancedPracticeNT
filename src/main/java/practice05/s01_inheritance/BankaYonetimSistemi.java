package practice05.s01_inheritance;

public class BankaYonetimSistemi {
    public static void main(String[] args) {
        // Bireysel müşteri oluşturma
        BireyselMusteriler bireyselMusteri = new BireyselMusteriler(
                "Ahmet Yılmaz",
                1001,
                3000.0,
                "1234567890",
                "01/01/1980");

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
