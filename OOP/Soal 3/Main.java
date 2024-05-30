import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();
        Penjumlahan jum = new Penjumlahan();
        Pengurangan kur = new Pengurangan();

        System.out.println("input angka 1: ");
        float nomor1 = input.nextFloat();
        System.out.println("input angka 2: ");
        float nomor2 = input.nextFloat();

        System.out.println("pilih operator(+, -, *, /):");
        calc.operator = input.next().charAt(0);

        while(calc.operator != '+' && calc.operator != '-' && calc.operator != '*' && calc.operator != '/') {
            System.out.println("Wrong Operator!");
            System.out.println("pilih operator(+, -, *, /):");
            calc.operator = input.next().charAt(0);
        }

        if(calc.operator == '+'){
            jum.setAngka(nomor1);
            jum.setAngka2(nomor2);
            System.out.println("hasil = " + jum.hasil());
        } else if (calc.operator == '-') {
            kur.setAngka(nomor1);
            kur.setAngka2(nomor2);
            System.out.println("hasil = " + kur.hasil());
        } else if (calc.operator == '*') {
            Perkalian kali = new Perkalian(nomor1, nomor2);
            System.out.println("hasil = " + kali.hasil());
        } else if (calc.operator == '/') {
            Pembagian bagi = new Pembagian(nomor1, nomor2);
            System.out.printf("hasil = %.2f", bagi.hasil());
        }
    }
}