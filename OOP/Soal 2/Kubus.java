public class Kubus {

    int panjang;

    public Kubus(int panjang) {
        this.panjang = panjang;
    }

    public int volumeKubus(){
        int vKubus = (int) Math.pow(this.panjang, 3);
        return vKubus;
    }
}
