public class Tabung {
    int radius;
    int tinggi;

    public Tabung(int radius, int tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public float volumeTabung(){
        float vTabung = (float) (Math.PI * Math.pow(this.radius, 2) * this.tinggi);
        return vTabung;
    }


}
