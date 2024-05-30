import java.util.Scanner;

public class Main {

    private static void xyz(int input) {

        int count = 1;

        for (int i=1;i<=input;i++ ){
            for (int j=1; j<=input; j++){
                if (count % 3 == 0){
                    System.out.print("X ");
                    count++;
                } else if (count % 2 == 0){
                    System.out.print("Z ");
                    count++;
                } else {
                    System.out.print("Y ");
                    count++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner isian = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int hasil = isian.nextInt();

        xyz(hasil);
    }
}