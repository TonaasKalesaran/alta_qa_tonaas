public class Perkalian extends Kalkulator {
    float angka;
    float angka2;

    public Perkalian(float angka, float angka2) {
        this.angka = angka;
        this.angka2 = angka2;
    }

    @Override
    public float hasil() {
        float kali = this.angka * this.angka2;
        return kali;
    }
}
