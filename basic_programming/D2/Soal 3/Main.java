import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan : ");
        int bilangan = input.nextInt();

        System.out.println("Faktor dari " + bilangan + " adalah : ");

        if (bilangan > 0) {
            for (int i = 1; i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    System.out.println(i);
                }
            }
        } else if(bilangan < 0) {
            for (int i = -1; i >= bilangan; i--) {
                if (bilangan % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("tidak terhingga");
        }

    }
}