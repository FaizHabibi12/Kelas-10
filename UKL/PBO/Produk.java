package PBO;

public class Produk {
    private int nomor;
    private String nama;
    private int jumlah;
    private double harga;

    // Default constructor
    public Produk() {
    }

    // Constructor with parameters
    public Produk(int nomor, String nama, int jumlah, double harga) {
        this.nomor = nomor;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter and setter methods
    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method to display the description of the product
    public void displayDescription() {
        System.out.println("Nomor : " + nomor);
        System.out.println("Nama Produk : " + nama);
        System.out.println("Jumlah Stok : " + jumlah);
        System.out.println("Harga : Rp. " + harga);
    }
}
