import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input alas segitiga: ");
        float alas1 = input.nextFloat();

        System.out.print("Input tinggi segitiga: ");
        float tinggi1 = input.nextFloat();

        float luas1 = (alas1 * tinggi1) / 2;

        System.out.println("luas segitiga adalah " + luas1);
    }
}