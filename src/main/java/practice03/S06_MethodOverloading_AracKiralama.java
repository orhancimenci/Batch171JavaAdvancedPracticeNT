package practice03;

public class S06_MethodOverloading_AracKiralama {
    /*
        Üç farklı method oluşturun.
          - İlk method, bir aracın günlük kira bedelini parametre olarak alacak ve toplam kira bedelini hesaplayıp
          döndürecek.
          - İkinci method, bir aracın günlük kira bedeli ve kiralama süresi parametrelerini alacak ve
          toplam kira bedelini hesaplayıp döndürecek.
          - Üçüncü method ise bir aracın günlük kira bedeli, kiralama süresi ve indirim oranı parametrelerini alacak ve
          indirimli toplam kira bedelini hesaplayıp döndürecek.

        Bu methodları kullanarak farklı araçların kira bedellerini hesaplayın.
    */

        public static void main(String[] args) {
            double kiraBedeli1 = kiraBedeliHesapla(100.0);
            double kiraBedeli2 = kiraBedeliHesapla(50.0, 7);
            double kiraBedeli3 = indirimliKiraBedeliHesapla(80.0, 5, 0.1);

            System.out.println("Araba 1 kira bedeli: " + kiraBedeli1);
            System.out.println("Araba 2 kira bedeli: " + kiraBedeli2);
            System.out.println("Araba 3 kira bedeli: " + kiraBedeli3);
        }

        public static double kiraBedeliHesapla(double gunlukKiraBedeli) {
            int kiralamaSure = 1;
            return gunlukKiraBedeli * kiralamaSure;
        }

        public static double kiraBedeliHesapla(double gunlukKiraBedeli, int kiralamaSure) {
            return gunlukKiraBedeli * kiralamaSure;
        }

        public static double indirimliKiraBedeliHesapla(double gunlukKiraBedeli, int kiralamaSure, double indirimOrani) {
            double toplamKiraBedeli = gunlukKiraBedeli * kiralamaSure;
            double indirimMiktari = toplamKiraBedeli * indirimOrani;
            return toplamKiraBedeli - indirimMiktari;
        }

}
