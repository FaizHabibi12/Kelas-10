import java.util.Scanner;

/**
 * forlooppyramid
 */
public class forlooppyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input berapa baris untuk piramida: ");
        int baris = input.nextInt();

        for(int i = 0; i <= baris; i++ ) {
            
            for (int j = 0; j <= baris + i; j++) {
                System.out.print("*");
            }
            System.out.println("*");



        }




















    }
}