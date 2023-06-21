package practice03;

import java.util.ArrayList;
import java.util.Scanner;

public class S10_ArrayList_OgrenciListesi {
    /*
        Soru: Bir öğrenci listesi tutan bir program yazmanız isteniyor.
              Program, aşağıdaki seçenekleri sunmalı:
            - Öğrenci ekleme: Kullanıcıdan bir öğrenci adı alacak ve öğrenciyi listeye ekleyecek.
            - Öğrenci silme: Kullanıcıdan silmek istediği öğrenci adını alacak ve listeden bu öğrenciyi silecek.
            - Öğrenci adı güncelleme: Kullanıcıdan güncellemek istediği öğrenci adını ve yeni adını alacak ve
              listede ilgili öğrenci adını güncelleyecek.
            - Toplam öğrenci sayısını sorgulama: Listedeki toplam öğrenci sayısını hesaplayacak ve ekrana yazdıracak.
            - Öğrenci arama: Kullanıcıdan aramak istediği öğrenci adını alacak ve listede bu öğrencinin olup olmadığını
              kontrol edecek.
        Program, kullanıcının seçtiği işlemi gerçekleştirdikten sonra seçenekleri tekrar sunmalı ve
        kullanıcı programdan çıkmak istediğinde çıkış yapmalıdır.
     */

    /*
    ODEV:     1) muzik player ve ogrenci listesi odevlerinde reusable methodlar olusturulacak
              2) reusable class olusturulup bu methodlar bu classda toplanacak
              3) ve odevlerde bu reusable methodlar kullanilacak 4)inherirtance kullanilacak
     */
    private final ArrayList<String> ogrenciListesi;

    public S10_ArrayList_OgrenciListesi() {
        ogrenciListesi = new ArrayList<>();
    }

    public void ogrenciEkle(String ogrenciAdi) {
        ogrenciListesi.add(ogrenciAdi);
        System.out.println(ogrenciAdi + " öğrencisi listeye eklendi.");
    }

    public void ogrenciSil(String ogrenciAdi) {
        if (ogrenciListesi.contains(ogrenciAdi)) {
            ogrenciListesi.remove(ogrenciAdi);
            System.out.println(ogrenciAdi + " öğrencisi listeden silindi.");
        } else {
            System.out.println(ogrenciAdi + " öğrencisi listede bulunamadı.");
        }
    }

    public void ogrenciAdiGuncelle(String eskiAd, String yeniAd) {
        int index = ogrenciListesi.indexOf(eskiAd);
        if (index != -1) {
            ogrenciListesi.set(index, yeniAd);
            System.out.println(eskiAd + " öğrencisinin adı " + yeniAd + " olarak güncellendi.");
        } else {
            System.out.println(eskiAd + " öğrencisi listede bulunamadı.");
        }
    }

    public void toplamOgrenciSayisi() {
        int sayi = ogrenciListesi.size();
        System.out.println("Toplam öğrenci sayısı: " + sayi);
    }

    public void ogrenciAra(String ogrenciAdi) {
        if (ogrenciListesi.contains(ogrenciAdi)) {
            System.out.println(ogrenciAdi + " öğrencisi listede bulunuyor.");
        } else {
            System.out.println(ogrenciAdi + " öğrencisi listede bulunamadı.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S10_ArrayList_OgrenciListesi ogrenciListesi = new S10_ArrayList_OgrenciListesi();

        while (true) {
            System.out.println("\nÖğrenci Listesi Uygulaması");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Sil");
            System.out.println("3. Öğrenci Adını Güncelle");
            System.out.println("4. Toplam Öğrenci Sayısını Sorgula");
            System.out.println("5. Öğrenci Ara");
            System.out.println("6. Çıkış");

            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Eklemek istediğiniz öğrenci adını girin: ");
                    String ogrenciEklenecek = scanner.nextLine();
                    ogrenciListesi.ogrenciEkle(ogrenciEklenecek);
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz öğrenci adını girin: ");
                    String ogrenciSilinecek = scanner.nextLine();
                    ogrenciListesi.ogrenciSil(ogrenciSilinecek);
                    break;
                case 3:
                    System.out.print("Güncellemek istediğiniz öğrenci adını girin: ");
                    String eskiAd = scanner.nextLine();
                    System.out.print("Yeni adını girin: ");
                    String yeniAd = scanner.nextLine();
                    ogrenciListesi.ogrenciAdiGuncelle(eskiAd, yeniAd);
                    break;
                case 4:
                    ogrenciListesi.toplamOgrenciSayisi();
                    break;
                case 5:
                    System.out.print("Aramak istediğiniz öğrenci adını girin: ");
                    String ogrenciAranacak = scanner.nextLine();
                    ogrenciListesi.ogrenciAra(ogrenciAranacak);
                    break;
                case 6:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçim yaptınız, tekrar deneyin.");
            }
        }
    }
}
