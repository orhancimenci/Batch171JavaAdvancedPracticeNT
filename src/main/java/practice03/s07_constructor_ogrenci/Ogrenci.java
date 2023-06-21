package practice03.s07_constructor_ogrenci;

public class Ogrenci {

    /*
        Ogrenci class'ı, öğrencinin adını, yaşını ve sınıfını temsil eden alanları içermelidir.
        Bu class'ın bir default constructor'ı, bir de parametreli constructor'ı olmalıdır.
        Bu class'ın değiken değerlerini ekrana yazdıran bir metot bulunmalıdır.
        4. Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrencinin yaşını bir yıl arttıran bir işlem yapın.
            Bu metodu kullanarak bir öğrencinin yaşını bir yıl arttırın ve sonucu ekrana yazdırın.
        5. Alıştırma: Ogrenci class'ına bir metot ekleyerek öğrenciyi bir üst sınıfa geçiren bir işlem yapın.
            Bu metodu kullanarak bir öğrencinin sınıfını bir üst sınıfa geçirin ve sonucu ekrana yazdırın.
        6. Alıştırma: Ogrenci class'ına bir statik değişken ekleyin ve her bir öğrenci oluşturulduğunda bu değişkeni
            bir artırın.
            Bu sayede kaç adet öğrenci oluşturulduğunu takip edebilirsiniz.
        7. Alıştırma: Bir statik metot ekleyerek, parametre olarak aldığı iki öğrencinin değerlerinin
            eşit olup olmadığını karşılaştıran bir metot yazın ve sonucu ekrana yazdırın.
    */

    public String ad;
    public int yas;
    public int sinif;

    public Ogrenci() {
        ad = "";
        yas = 0;
        sinif = 0;
    }

    public Ogrenci(String ad, int yas, int sinif) {
        this.ad = ad;
        this.yas = yas;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ad='" + ad + '\'' +
                ", Yas=" + yas +
                ", Sınıf=" + sinif;
    }

}
