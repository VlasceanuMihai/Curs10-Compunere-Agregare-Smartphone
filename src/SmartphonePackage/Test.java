package SmartphonePackage;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Pixel> pixels = new ArrayList<>();
        pixels.add(new Pixel());
        pixels.add(new Pixel("green"));
        pixels.add(new Pixel("black"));
        pixels.add(new Pixel("brown"));

        /*Dimensions dimensions = new Dimensions(2960, 147, 68);
        Screen theScreen = new Screen(pixels.size(), 2960, 147, 68);
        Speaker theSpeaker1 = new Speaker(100);
        Speaker theSpeaker2 = new Speaker(100, 50);
        Case theCase = new Case();
        Microphone theMicrophone = new Microphone(100, 0);*/

        Smartphone smartphone = new Smartphone(pixels.size(), 2960, 147, 68, 100, 100);


        ///////////////////////////////////////////
        System.out.println(smartphone + "\n");

        smartphone.pressPowerButton();
        System.out.println();

        smartphone.colorScreen("blue");
        System.out.println();

        System.out.println("Initial list of pixels: " + pixels + "\n");

        smartphone.setPixel(pixels, 0, "red");
        System.out.println();

        smartphone.setPixel(pixels, 3, "yellow");
        System.out.println();

        pixels.add(new Pixel("black"));
        System.out.println(pixels);
        System.out.println();

        smartphone.pressVolumeUp();
        smartphone.pressVolumeUp();
        smartphone.pressVolumeUp();
        smartphone.pressVolumeUp();
        smartphone.pressVolumeUp();
        System.out.println();

        smartphone.increaseMicrophoneVolume();
        smartphone.increaseMicrophoneVolume();
        System.out.println();

        smartphone.pressVolumeDown();
        smartphone.pressVolumeDown();
        System.out.println();

        smartphone.decreaseMicrophoneVolume();
        smartphone.decreaseMicrophoneVolume();
        smartphone.decreaseMicrophoneVolume();
        System.out.println();

        smartphone.muteMicrophone();
        smartphone.setSilenceMode();
    }
}
