package practice03;
public class CargoCalculator {
    public static double calculateShippingCostByWeight(double weight) {
        // Sadece ağırlığa dayalı kargo ücreti hesaplama formülü burada yer alabilir
        double cost = weight * 2.5; // Örnek bir formül: ağırlık * birim ağırlık başına ücret
        return cost;
    }

    public static double calculateShippingCostByWeightAndDimensions(double weight, double length, double width, double height) {
        // Ağırlık ve boyutlara dayalı kargo ücreti hesaplama formülü burada yer alabilir
        double volume = length * width * height;
        double cost = weight * 2 + volume * 0.1;
        // Örnek bir formül: ağırlık * birim ağırlık başına ücret + hacim * birim hacim başına ücret
        return cost;
    }

    public static void main(String[] args) {
        // İki methodu kullanarak farklı paketlerin kargo ücretlerini hesaplayabiliriz
        double weight1 = 5.2;
        double cost1 = calculateShippingCostByWeight(weight1);
        System.out.println("Paket 1 Kargo Ücreti: " + cost1);

        double weight2 = 3.8;
        double length2 = 20.0;
        double width2 = 10.0;
        double height2 = 5.0;
        double cost2 = calculateShippingCostByWeightAndDimensions(weight2, length2, width2, height2);
        System.out.println("Paket 2 Kargo Ücreti: " + cost2);
    }
}