import java.util.Scanner;

/**
 * SppDsp
 */
public class SppDsp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String jalurmasuk, namamhs;

            int pendapatan, DSP = 0, SPP = 0, totalbayar, bulan;

        System.out.print("Masukkan nama Mahasiswa: ");
        namamhs = input.nextLine();

        System.out.print("Masukkan besar pendapatan orang tua: ");
        pendapatan = input.nextInt();

        System.out.print("Masukkan berapa jumlah bulan yang ingin di bayar: ");
        bulan = input.nextInt();

    input.nextLine();

        System.out.println("Pilihlah jalur masuk yang kamu lalui");
        System.out.println("1. SBMPTN\n2. SNMPTN\n3. Mandiri");
        System.out.println("Masukkan pilihan: ");
        jalurmasuk = input.nextLine();

        switch (jalurmasuk) {
            case "1":
                if (pendapatan < 2000000) {
                    DSP = 5000000;
                    SPP = 500000;
                }
                else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
                    DSP = 15000000;
                    SPP = 100000;}
               else if (pendapatan > 10000000) {
                    DSP = 3000000;
                    SPP = 200000;}

                    break;

            case "2":
                if (pendapatan < 2000000) {
                    DSP = 7000000;
                    SPP = 500000;
                }
                else if (pendapatan >= 2000000 && pendapatan <= 1000000) {
                    DSP = 17000000;
                    SPP = 1000000;}
               else if (pendapatan > 10000000) {
                    DSP = 35000000;
                    SPP = 2000000;}

                    break;

            case "3":
                if (pendapatan < 2000000) {
                    DSP = 10000000;
                    SPP = 1000000;
                }
                else if (pendapatan >= 2000000 && pendapatan <= 10000000) {
                    DSP = 25000000;
                    SPP = 2000000;}
               else if (pendapatan > 10000000) {
                    DSP = 50000000;
                    SPP = 3000000;}
                SPP = bulan * SPP;
                System.out.println("Besar SPP: Rp " + SPP);
                System.out.println("Besar DSP: Rp " + DSP);
                totalbayar = DSP + SPP;
                System.out.println("Total Bayar: Rp " + totalbayar);
                    break;
                }


            
        














    }
}