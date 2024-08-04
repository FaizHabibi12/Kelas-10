/**
 * ProgramPemilu
 */
import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class ProgramPemilu {

    public static void main(String[] args) {

 Scanner input = new Scanner (System.in);

    int Umur;

        System.out.println("Masukkan Umur anda: ");
        Umur = input.nextInt();

        if (Umur > 17) {
                System.out.println("Anda Boleh Mengikuti Pemilu");
        }
        else {
                System.out.println("Anda Tidak Boleh Mengikuti Pemilu");
        }


    
        
    }
}