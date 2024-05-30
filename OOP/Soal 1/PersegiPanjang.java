public class PersegiPanjang {

    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang(){
        return this.panjang * this.lebar;
    }

    public int kelilingPersegiPanjang(){
        return this.panjang * 2 + this.lebar * 2;
    }

}
