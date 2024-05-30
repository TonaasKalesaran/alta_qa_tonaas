package basic_programming;
import java.util.Scanner;

public class Main {

    //function
    private static boolean prima(int angka){
        int total = 0;

        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                total += 1;
            }
        }

        if (total == 2){
            return true;
        }else {
            return false;
        }
    }

    //main class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("isi angka: ");
        int isian = input.nextInt();

        System.out.println(prima(isian));
    }
}