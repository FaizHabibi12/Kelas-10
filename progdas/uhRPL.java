import java.util.Scanner;
/**
 * uhRPL
 */
public class uhRPL {

   public static void main(String[] args) {

    double nasicampur, nasijeroan, nasirames, total, diskon;
    nasicampur = 10500;
    nasijeroan = 18000;
    nasirames = 19000;
    total = 0;

    int menu;

    
Scanner input = new Scanner(System.in);

    System.out.println("Selamat Datang Di Warung Abah Slamet");
    System.out.println("Masukkan nama kasir: ");
    String namakasir = input.nextLine();
    System.out.println("Masukkan nama Pembeli: ");
    String namapembeli = input.nextLine();
    System.out.println("1. Nasi Campur\n2. Nasi Rempela Ati\n3. Nasi Rames");
    menu = input.nextInt();

    switch (menu) {
        case 1:
        System.out.println("Pembelian Nasi Campur");
           total += nasicampur - 1260; 
            break;
        case 2:
        System.out.println("Pembelian Nasi Rempela Ati");
            total += nasijeroan - 1980;
            break;
        case 3:
        System.out.println("Pembelian Nasi Rames");
            total += nasirames - 3230;
            break;
    }

    System.out.println("Nama Kasir: " + namakasir);
    System.out.println("Nama Pembeli: " + namapembeli);
    System.out.println("Total: " + total);




  






    








    
   }
}