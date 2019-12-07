package SmartphonePackage;

import java.util.ArrayList;

public class Smartphone {
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;


    // Initializare in MOD DIRECT a componentelor
    public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, int microMaxVol){
        this.theScreen = new Screen(pixelsNo, width, length, depth);
        this.theSpeaker = new Speaker(speakerMaxVol, 40);
        this.theMicrophone = new Microphone(microMaxVol, 50);
        this.theCase = new Case();
    }


    public Smartphone(Screen theScreen, Speaker theSpeaker, Case theCase, Microphone theMicrophone){
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }


    // Screen
    public void colorScreen(String color){
        System.out.println("Class Smartphone: delegate to Screen -> ");
        this.theScreen.colorScreen(color);
    }


    public void setPixel(ArrayList<Pixel> pixels, int pixelIndex, String newColor){
        System.out.println("Class Smartphone: delegate to Screen -> ");
        this.theScreen.setPixel(pixels, pixelIndex, newColor);
    }


    public String toString(){
        System.out.println("Class Smartphone: delegate to Screen -> ");
        return this.theScreen.toString();
    }


    // Case + Speaker
    public void pressPowerButton(){
        System.out.println("Class Smartphone: delegate to Case -> ");
        this.theCase.pressPowerButton();
    }


    public void pressVolumeUp(){
        System.out.println("Class Smartphone: delegate to Case and Speaker-> ");
        this.theCase.pressVolumeUp();
        this.theSpeaker.increaseVolume();
    }


    public void pressVolumeDown(){
        System.out.println("Class Smartphone: delegate to Case and Speaker -> ");
        this.theCase.pressVolumeDown();
        this.theSpeaker.decreaseVolume();
    }

    public void setSilenceMode(){
        System.out.println("Class Smartphone: delegate to Speaker -> ");
        this.theSpeaker.setSilenceMode();
    }


    // Microphone
    public boolean increaseMicrophoneVolume(){
        System.out.println("Class Smartphone: delegate to Microphone -> ");
        return this.theMicrophone.increaseMicrophoneVolume();
    }


    public boolean decreaseMicrophoneVolume(){
        System.out.println("Class Smartphone: delegate to Microphone -> ");
        return this.theMicrophone.decreaseMicrophoneVolume();
    }


    public void muteMicrophone(){
        System.out.println("Class Smartphone: delegate to Microphone -> ");
        this.theMicrophone.muteMicrophone();
    }
}
