public class Pengurangan extends Kalkulator {
    float angka;
    float angka2;

    public float getAngka() {
        return angka;
    }

    public void setAngka(float angka) {
        this.angka = angka;
    }

    public float getAngka2() {
        return angka2;
    }

    public void setAngka2(float angka2) {
        this.angka2 = angka2;
    }

    @Override
    public float hasil() {
        float kurang = getAngka() - getAngka2();
        return  kurang;
    }
}
