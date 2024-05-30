public class Segitiga {

    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luasSegitiga(){
        return (float) (this.alas * this.tinggi) /2;
    }

    public float kelilingSegitiga(){
        float sisi = (float) (Math.pow(this.alas, 2) + Math.pow(this.tinggi, 2));
        float kel =(float) Math.sqrt(sisi);
        return kel + this.alas + this.tinggi;
    }

}

