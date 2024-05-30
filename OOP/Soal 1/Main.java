import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Bentuk(Persegi/Persegi Panjang/Segitiga): ");
        String pilih = input.nextLine();

        while(!pilih.equalsIgnoreCase("Persegi") && !pilih.equalsIgnoreCase("Persegi panjang") && !pilih.equalsIgnoreCase("segitiga")) {
            System.out.println("Pilih Bentuk yang sesuai!");
            System.out.print("Pilih Bentuk(Persegi/Persegi Panjang/Segitiga): ");
            pilih = input.nextLine();
        }

            if (pilih.equalsIgnoreCase("Persegi")) {
                System.out.println("Masukan angka: ");
                int hasil = input.nextInt();
                Persegi persegi1 = new Persegi(hasil);

                System.out.println("Luas = " + persegi1.luasPersegi());
                System.out.println("Keliling = " + persegi1.kelilingPersegi());

            } else if (pilih.equalsIgnoreCase("Persegi Panjang")) {
                System.out.println("Masukan Panjang: ");
                int hasil = input.nextInt();
                System.out.println("Masukan Lebar: ");
                int hasil2 = input.nextInt();
                PersegiPanjang persegiP = new PersegiPanjang(hasil, hasil2);

                System.out.println("Luas = " + persegiP.luasPersegiPanjang());
                System.out.println("Keliling = " + persegiP.kelilingPersegiPanjang());

            } else if (pilih.equalsIgnoreCase("Segitiga")) {
                System.out.println("Masukan Panjang: ");
                int hasil = input.nextInt();
                System.out.println("Masukan Lebar: ");
                int hasil2 = input.nextInt();
                Segitiga segitiga = new Segitiga(hasil, hasil2);

                System.out.printf("Luas = %.2f", segitiga.luasSegitiga());
                System.out.println();
                System.out.printf("Keliling = %.2f" , segitiga.kelilingSegitiga());
            }
    }
}