package SmartphonePackage;

public class Speaker {
    private final int speakerMaxVol;
    private int speakerCrtVol;


    public Speaker(int speakerMaxVol){
        this.speakerMaxVol = speakerMaxVol;
        this.speakerCrtVol = 25;
    }


    public Speaker(int speakerMaxVol, int speakerCrtVol){
        this.speakerMaxVol = speakerMaxVol;
        this.speakerCrtVol = speakerCrtVol;
    }


    public int getSpeakerCrtVol() {
        return speakerCrtVol;
    }

    public boolean increaseVolume(){
        if (this.speakerCrtVol < this.speakerMaxVol){
            this.speakerCrtVol += 1;
            System.out.println("Increase volume of Speaker! Current volume: " + getSpeakerCrtVol());
            return true;
        }

        return false;
    }


    public boolean decreaseVolume(){
        if (this.speakerCrtVol > 0){
            this.speakerCrtVol -= 1;
            System.out.println("Decrease Volume of Speaker! Current volume: " + getSpeakerCrtVol());
            return true;
        }

        return false;
    }


    public void setSilenceMode(){
        this.speakerCrtVol = 0; // mute mode
        System.out.println("Silence mode!");
    }
}
