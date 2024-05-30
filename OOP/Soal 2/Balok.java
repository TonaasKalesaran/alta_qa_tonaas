public class Balok {

    int panjang;
    int lebar;
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volumeBalok(){
        return this.panjang * this.lebar * this.tinggi;
    }

}
