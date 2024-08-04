/**
 * belajarOOP
 */
public class belajarOOP {

    public static void main(String[] args) {
        System.out.println("Balls ");
        belajarOOP s = new belajarOOP();
        s.tampilNama();
        System.out.println(s.usia(2007));
     }

     public void tampilNama(){
        String nama = "Adolf Hitler";
        System.out.println("Nama Siswa; "+nama);
     }

     public int usia(int tahunLahir){
        int usia = 2024-tahunLahir;
        return usia;
     }

}