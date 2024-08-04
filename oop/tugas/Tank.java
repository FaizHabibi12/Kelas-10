/**
 * Tank
 */
public class Tank {

    String namatank;
    int kecepatan;
    int Durability;
    int explosiveAmmo;
    int Crew;

    void run(){
        System.out.println(namatank + "  Sedang bergerak.... ");
        System.out.println("kecepatan: " + kecepatan);
        System.out.println("Jumlah Peluru: " + explosiveAmmo);
        System.out.println("Jumlah Kru: " + Crew);


   }

   boolean isDestroyed(){
    if(Durability <= 0) return true;
    return false; 
   }
}

//MUHAMMAD FAIZ HABIBI XR 6 25