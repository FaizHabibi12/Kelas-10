/**
 * KategoriPenilaian
 */
import java.util.Scanner;

public class KategoriPenilaian {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
System.out.println("Masukkan Nilai: ");
int nilai = input.nextInt();

String predikat = null;
String kriteria = null;

if (nilai >=96 && nilai <= 100) {
    kriteria = "Sangat Baik";
    predikat = "A"; }
    else if (nilai >= 91 && nilai <= 95) {
        kriteria = "Sangat Baik";
        predikat = "A-";
    } else if (nilai >= 86 && nilai <= 90) {
        kriteria = "Baik";
        predikat = "B+";
    } else if (nilai >= 81 && nilai <= 85) {
        kriteria = "Baik";
        predikat = "B";
    } else if (nilai >= 75 && nilai <= 80) {
        kriteria = "Baik";
        predikat = "B-";
    } else if (nilai >= 70 && nilai <= 74) {
        kriteria = "Cukup";
        predikat = "C+";
    } else if (nilai >= 65 && nilai <= 69) {
        kriteria = "Cukup";
        predikat = "C";
    } else if (nilai >= 60 && nilai <= 64) {
        kriteria = "Cukup";
        predikat = "C-";
    } else if (nilai >= 55 && nilai <= 59) {
        kriteria = "Kurang";
        predikat = "D+";
    } else if (nilai >= 0 && nilai <= 54) {
        kriteria = "Kurang";
        predikat = "D"; }

        System.out.println(nilai);
        System.out.println(predikat);
        System.out.println(kriteria);




}
}