import java.util.Scanner;

public class progdasligma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Bilangan harus positif");
        } else {
        int factorial = calculateFactorial(n);
        
        System.out.println("Faktorial dari " + n + " adalah: " + factorial);
        }
    }
    
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
 }