package SmartphonePackage;

public class Microphone {
    private final int microMaxVol;
    private int microCrtVol;


    public Microphone(int microMaxVol){
        this.microMaxVol = microMaxVol;
        this.microCrtVol = 25;
    }


    public Microphone(int microMaxVol, int microCrtVol){
        this.microMaxVol = microMaxVol;
        this.microCrtVol = microCrtVol;
    }


    public int getMicroCrtVol() {
        return microCrtVol;
    }

    public boolean increaseMicrophoneVolume(){
        if (this.microCrtVol < this.microMaxVol){
            this.microCrtVol += 1;
            System.out.println("Increase volume of Microphone! Current volume: " + getMicroCrtVol());
            return true;
        }
        return false;
    }


    public boolean decreaseMicrophoneVolume(){
        if (this.microCrtVol > 0){
            this.microCrtVol -= 1;
            System.out.println("Decrease volume of Microphone! Current volume: " + getMicroCrtVol());
            return true;
        }
        return false;
    }


    public void muteMicrophone(){
        this.microCrtVol = 0; // mute mode
        System.out.println("Mute Microphone!");
    }
}
