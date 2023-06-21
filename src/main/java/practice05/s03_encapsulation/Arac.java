package practice05.s03_encapsulation;

public class Arac {
    private final String aracSinifi;
    private final String marka;
    private final String model;
    private final String yakitTuru;
    private final double gunlukKiraUcreti;

    public Arac(String aracSinifi, String marka, String model, String yakitTuru, double gunlukKiraUcreti) {
        this.aracSinifi = aracSinifi;
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.gunlukKiraUcreti = gunlukKiraUcreti;
    }

    public String getAracSinifi() {
        return aracSinifi;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public double getGunlukKiraUcreti() {
        return gunlukKiraUcreti;
    }
}
