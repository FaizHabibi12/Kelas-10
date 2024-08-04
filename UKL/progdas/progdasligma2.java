import java.util.Scanner;

public class progdasligma2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double R = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double T = input.nextDouble();
        
        calculateVolume(R, T);
        
    }
    
    public static void calculateVolume(double R, double T) {
        double volume = Math.PI * Math.pow (R, 2) * T;
        System.out.println("Volume tabung adalah: " + volume);
    }
}
    