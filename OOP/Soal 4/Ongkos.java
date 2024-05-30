public class Ongkos extends Barang{

    int panjang;
    int lebar;
    int tinggi;
    float berat1;
    float ongkir;

    @Override
    public int getPanjang() {
        return panjang;
    }

    @Override
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    @Override
    public int getLebar() {
        return lebar;
    }

    @Override
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public int getTinggi() {
        return tinggi;
    }

    @Override
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public float getBerat1() {
        return berat1;
    }

    public void setBerat1(float berat1) {
        this.berat1 = berat1;
    }

    public float getOngkir() {
        return ongkir;
    }

    public void setOngkir(float ongkir) {
        this.ongkir = ongkir;
    }

    @Override
    public float volume() {
        return getPanjang() * getLebar() * getTinggi();
    }

    @Override
    public float total() {
        if (volume() >= 50 && getBerat1() >= 1) {
            setOngkir(5000);
            float volume = (float) Math.ceil((volume()) / getOngkir());
                if (volume > getBerat1()){
                    return volume * getOngkir();
                } else {
                    return (float) (Math.ceil(getBerat1()) * getOngkir());
                }
        } else if (volume() <= 50 && getBerat1() >= 1) {
            setOngkir(2500);
            return (float) (Math.ceil(getBerat1()) * getOngkir());
        } else {
            setOngkir(2500);
            setBerat1(1);
            return getBerat1() * getOngkir();
        }
    }
}
