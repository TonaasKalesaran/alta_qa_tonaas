import java.util.Scanner;

public class Main {
    public static float mean(float rata2){

        Scanner input = new Scanner(System.in);
        float total = 0;

        for (int i=1; i<= rata2;i++){
            System.out.print("Masukan angka ke-" + i + " : ");
            float angka = input.nextInt();
            total += angka;
        }

        float average;
        average = total / rata2;
        System.out.println("totalnya adalah: " + total);
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah angka: ");
        float hasil = input.nextInt();

        System.out.print("rata-ratanya adalah: " + mean(hasil));

    }
}