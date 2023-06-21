package practice01;

public class S03_Hipotenus {
    public static void main(String[] args) {

       /*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
       */

        double a = 5;
        double b = 12;

        double hipotenus = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(hipotenus);


    }
}
