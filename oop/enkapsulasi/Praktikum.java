/**
 * Praktikum
 */
public class Praktikum {

    public double penumpang,penumpangbaru,counter;
    
    // konstruktor
        public double addPenumpang(){
            return penumpang;
        }

        public double getPenumpang(){
            return penumpang;
        }
    
    //method mutator 
    public void pluspenumpang(double penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void getAverage(double Average){
        if (Average>100){
            System.out.println("Kelebihan Muatan");
        }
        else{
            System.out.println("Normal");
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
        System.out.println("Maks Berat Badan Penumpang");
    }

}