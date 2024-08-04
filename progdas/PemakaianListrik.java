 import java.util.Scanner;

/**
 * PemakaianListrik
 */
public class PemakaianListrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pemakaian, tarif, biaya, biayatambahan, totaltagihan;

        System.out.print("Input besar pemakaian: ");
        pemakaian = input.nextDouble();

        if (pemakaian >= 0 && pemakaian <= 50 ) {
            tarif = 100;
        } else if (pemakaian >= 51 && pemakaian <= 150 ) {
            tarif = 150;
        }
         else if (pemakaian >= 151 && pemakaian <= 250 ) {
            tarif = 300;
        }
         
        
        

    }

}
