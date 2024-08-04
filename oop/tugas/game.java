/**
 * game
 */
public class game {

    public static void main(String[] args) {
        
        Tank PanzerKampfwagen = new Tank();

        PanzerKampfwagen.namatank = "SturmTiger";
        PanzerKampfwagen.kecepatan = 34;
        PanzerKampfwagen.Durability = 80;
        PanzerKampfwagen.explosiveAmmo = 60;
        PanzerKampfwagen.Crew = 5;

        PanzerKampfwagen.run();

        if(PanzerKampfwagen.isDestroyed()){
            System.out.println("Game Over!");
        }
    }
}

//MUHAMMAD FAIZ HABIBI XR6 25