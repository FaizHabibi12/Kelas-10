/**
 * Bonus
 */
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double masakerja, bonus, totalgaji;

        System.out.print("Masukkan masa kerja: ");
        masakerja = input.nextDouble();

        if (masakerja > 3) {
            bonus = 300000;
        } else {
            bonus = 150000;
        }

        System.out.println("Bonus: Rp" + bonus);
        totalgaji = 3000000 + bonus;
        System.out.println("Total gaji yang diterima: Rp " + totalgaji ); 


    







    }
}