import java.util.Scanner;

/**
 * forloopgeometry
 */
public class forloopgeometry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int geometry, baris, i, j;

        System.out.println("input berapa baris untuk bangun ruang: ");
        baris = input.nextInt();
        System.out.println("Pilih berbagaimacam segi3");
        System.out.println("1. segitiga atas\n2. segitiga bawah\n3. segitiga siku dalam\n4. segitiga siku luar");
        geometry = input.nextInt();

        switch (geometry) {
            case 1:
            for(i = 0; i <= baris; i++ ) {
            
                for (j = 0; j <= baris + i; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
            break;
            case 2:
            for(i = 0; i <= baris; i++ ) {
            
                for (j = 0; j <= baris - i; j++) {
                    System.out.print("*");
                }
                System.out.println("*");            
            }
            break;
            case 3:
            
            break;
            case 4:
            
            break;
        }




    }
}