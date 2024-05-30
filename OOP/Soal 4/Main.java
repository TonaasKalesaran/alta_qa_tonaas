import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Ongkos okr = new Ongkos();

        System.out.println("Program untuk menghitung harga ongkos kirim untuk pengiriman barang.");
        System.out.println("Untuk barang dibawah 50cm" + '\u00B3' + " dan berat dibawah 1kg akan dikenakan harga Rp.2500 per kilo(berat dibulatkan keatas)");
        System.out.println("Apabila berat benda minimal 1kg, akan dikenakan harga Rp.5000 per kilo(berat akan dibulatkan keatas)");

        System.out.print("isi panjang: ");
        int pjg = input.nextInt();

        System.out.print("isi lebar: ");
        int lbr = input.nextInt();

        System.out.print("isi tinggi: ");
        int tgi = input.nextInt();

        System.out.print("isi berat: ");
        float brt = input.nextFloat();

        okr.setPanjang(pjg);
        okr.setLebar(lbr);
        okr.setTinggi(tgi);
        okr.setBerat1(brt);

        System.out.println("Total volume barang anda: " + okr.volume()+ "cm" + '\u00B3');
        System.out.println("Total yang harus dibayar adalah Rp. " + okr.total());
    }
}