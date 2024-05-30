import java.util.Scanner;

public class Main {

    public static boolean palindrome(String balik) {


        String terbalik = "";
        System.out.println("Kata awal: " + balik);

        for (int i = 0; i < balik.length(); i++) {
            terbalik = balik.charAt(i) + terbalik;
        }

        System.out.println("Kebalikannya: "+ terbalik);


        if (balik.equalsIgnoreCase(terbalik)){              //kalau equals aja dicek kesamaan dengan huruf kapital
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kata: ");
        String isian = input.nextLine();
        System.out.println(palindrome(isian));


    }
}