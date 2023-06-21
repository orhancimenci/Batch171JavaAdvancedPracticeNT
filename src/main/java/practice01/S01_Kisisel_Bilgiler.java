package practice01;

public class S01_Kisisel_Bilgiler {
    public static void main(String[] args) {
        /*
     İsim, soyisim, yaş, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            İsim: ...
            Soyisim: ...
            Yaş: ...
            Boy: ...
            Kilo: ...
     Not: Sadece bir adet "System.out.println(); kullanınız.
     */
        String isim = "Ali";
        String soyIsim = "Can";
        int yas = 35;
        double boy = 1.85;
        int kilo = 75;

        System.out.println("isim: " + isim + "\nSoyisim: " + soyIsim + "\n\tYaş: " + yas + "\n\tBoy: " + boy +
                "\n\tKilo: " + kilo);

    }
}
