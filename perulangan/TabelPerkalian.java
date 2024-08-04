import java.util.Scanner;

/**
 * TabelPerkalian
 */
public class TabelPerkalian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan kelipatan perkalian: ");
        int kelipatan = input.nextInt();
        System.out.println("Masukkan limit");
        int limit = input.nextInt();

        for (int x = 1; x <= limit; x++)
        {
            System.out.println(kelipatan + "x" + x + "=" + (kelipatan*x));
        }
    
    }
}