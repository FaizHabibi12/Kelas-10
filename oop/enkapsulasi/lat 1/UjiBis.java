/**
 * UjiBis
 */
public class UjiBis {
    public static void main(String[] args) {
        bis busMini=new bis();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();

    }

    
}