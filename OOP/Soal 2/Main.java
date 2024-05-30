import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Bentuk(Kubus/Balok/Tabung): ");
        String pilih = input.nextLine();

        while(!pilih.equalsIgnoreCase("Kubus") && !pilih.equalsIgnoreCase("Balok") && !pilih.equalsIgnoreCase("Tabung")) {
            System.out.println("Pilih Bentuk yang sesuai!");
            System.out.print("Pilih Bentuk(Kubus/Balok/Tabung): ");
            pilih = input.nextLine();
        }

        if (pilih.equalsIgnoreCase("Kubus")) {
            System.out.print("Masukan angka: ");
            int hasil = input.nextInt();
            Kubus kubus1 = new Kubus(hasil);

            System.out.println("Volume Kubus = " + kubus1.volumeKubus());

        } else if (pilih.equalsIgnoreCase("Balok")) {
            System.out.print("Masukan Panjang: ");
            int hasil = input.nextInt();
            System.out.print("Masukan Lebar: ");
            int hasil2 = input.nextInt();
            System.out.print("Masukan Tinggi: ");
            int hasil3 = input.nextInt();
            Balok balok1 = new Balok(hasil, hasil2, hasil3);

            System.out.println("Volume Balok = " + balok1.volumeBalok());

        } else if (pilih.equalsIgnoreCase("Tabung")) {
            System.out.print("Masukan Radius: ");
            int hasil = input.nextInt();
            System.out.print("Masukan Tinggi: ");
            int hasil2 = input.nextInt();
            Tabung tabung1 = new Tabung(hasil, hasil2);

            System.out.printf("Volume Tabung = %.2f", tabung1.volumeTabung());
        }
    }
}