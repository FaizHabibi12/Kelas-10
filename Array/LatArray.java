// import java.util.Scanner;
// /**
//  * LatArray
//  */
// public class LatArray {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);


// String Keranjang[] = {"Semangka", "Apel", "Nanas"};
// for (int i = 0; i < Keranjang.length; i++) {
//     System.out.println("Keranjang " + (i + 1 ) +" = "+ Keranjang[i]);
// }

//     }
// }

// import java.util.Scanner;
// /**
//  * LatArray
//  */
// public class LatArray {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         String Nama[][] = {{"Rehan ", "Malang"}, {"Diva", "Banyuwangi" }};

//             System.out.println("Nama: " + Nama[0][0]);
//             System.out.println("Alamat: " + Nama[0][1] );

//             System.out.println("Nama: " + Nama[1][0]);
//             System.out.println("Alamat: " + Nama[1][1] );

//     }
// }

import java.util.Scanner;
/**
 * LatArray
 */
public class LatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Masukkan jumlah kata");
        int jumlah = scanner.nextInt();

        String Kata[] = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Kata " + (i + 1) + " : ");
            Kata[i] = scanner.next();

        }

        System.out.println("Print kata");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(Kata[i]);
        }
        

    }
    
}