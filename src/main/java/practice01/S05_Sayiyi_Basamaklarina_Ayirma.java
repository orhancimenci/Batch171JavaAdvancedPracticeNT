package practice01;

public class S05_Sayiyi_Basamaklarina_Ayirma {
    public static void main(String[] args) {
        /*
        Bir tamsayıyı basamaklarına ayıran bir kod yazınız.
        İpucu: / ve % kullanınız
        Sayı: 12345
        Çıktı: 1
               2
               3
               4
               5
               */

        int sayi = 12345;

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;
        int binler = (sayi / 1000) % 10;
        int onBinler = sayi / 10000;

        System.out.println(onBinler  + "\n" + binler  + "\n" + yuzler + "\n" + onlar + "\n" + birler);

    }
}
