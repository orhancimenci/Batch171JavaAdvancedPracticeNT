package practice01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class S04_Hipotenus_Metot {
    public static void main(String[] args) {
        /*
        Hipotenüs hesaplayan bir kod yazınız
        Hipotenös formülü: Karekök(a*a + b*b)
        */

        Scanner input = new Scanner(System.in);

        System.out.println("A kenarinin uzunlugunu giriniz: ");
        double a = input.nextDouble();

        System.out.println("B kenarinin uzunlugunu giriniz: ");
        double b = input.nextDouble();

        System.out.println("Hipotenus = " + hipotenusHesapla(a, b));


    }

    public static double hipotenusHesapla (double a, double b){
        double hipotenus = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return hipotenus;
    }

}
