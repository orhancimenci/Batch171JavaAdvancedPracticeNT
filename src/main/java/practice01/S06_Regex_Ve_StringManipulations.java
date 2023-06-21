package practice01;

import java.util.Scanner;

public class S06_Regex_Ve_StringManipulations {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
          */

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi soyadinizi yaziniz: ");
        String adSoyad = input.nextLine();

        String ad = adSoyad.split(" ")[0];
        String soyad = adSoyad.split(" ")[1];

        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);

    }


}
