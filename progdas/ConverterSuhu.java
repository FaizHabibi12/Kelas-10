/**
 * ConverterSuhu
 */
import java.util.Scanner;

public class ConverterSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double hasil;

    System.out.println("Pilih opsi konversi: ");
    System.out.println("R - Convert to Reamur ");
    System.out.println("F - Convert to Farenheit ");
    System.out.println("K - Convert to Kelvin ");
    System.out.print(" Pilihan ");
    String pilihan = input.next().toUpperCase();

    switch (pilihan) {
        case "R" :
            hasil = 4.0 / 5.0 * celcius;
            System.out.println("Hasil Konversi: "  + hasil + " Reamur " );
            break;
        case "F" :
            hasil = 9.0 / 5.0 * celcius + 32;
            System.out.println("Hasil Konversi: "  + hasil + " Farenheit " );
            break;
        case "K" :
            hasil = celcius + 273.15;
            System.out.println("Hasil Konversi: "  + hasil + " Kelvin " );
            break;
        default:
            System.out.println(" Input tidak valid. ");
        
        }  













}
    }

    