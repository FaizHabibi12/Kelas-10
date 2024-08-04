package PBO;

public class TestProduk {
    public static void main(String[] args) {

        //Default constructor
        Produk produk1 = new Produk();
        produk1.setNomor(1);
        produk1.setNama("Buku");
        produk1.setJumlah(5);
        produk1.setHarga(20000.0);

            Produk produk2 = new Produk();
            produk2.setNomor(2);
            produk2.setNama("Pensil");
            produk2.setJumlah(100);
            produk2.setHarga(1000.0);

            //Constructor with parameters
            Produk produk3 = new Produk(3, "Kursi", 20, 100000.0);
            Produk produk4 = new Produk(4, "Meja", 15, 80000.0);
            Produk produk5 = new Produk(5, "Lemari", 12, 120000.0);
              Produk produk6 = new Produk(6, "Komputer", 8, 200000.0);

        // Product Description
        System.out.println("Produk 1:");
        produk1.displayDescription();
        System.out.println();

        System.out.println("Produk 2:");
        produk2.displayDescription();
        System.out.println();

        System.out.println("Produk 3:");
        produk3.displayDescription();
        System.out.println();

        System.out.println("Produk 4:");
        produk4.displayDescription();
        System.out.println();

        System.out.println("Produk 5:");
        produk5.displayDescription();
        System.out.println();

        System.out.println("Produk 6:");
        produk6.displayDescription();
    }
}
