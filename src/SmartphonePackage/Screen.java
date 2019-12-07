package SmartphonePackage;

import java.util.ArrayList;

public class Screen {
    private ArrayList<Pixel> pixels;
    private Dimensions dimensions;
    private Pixel pixel;


    public Screen(int pixelsNo, int width, int length, int depth){
        this.pixels = new ArrayList<Pixel>(pixelsNo);
        this.dimensions = new Dimensions(width, length, depth);
    }


    public Screen(int pixelsNo, Dimensions dimensions){
        this.pixels = new ArrayList<Pixel>(pixelsNo);
        this.dimensions = dimensions;
    }


    public ArrayList<Pixel> getPixels() {
        return this.pixels;
    }


    public void colorScreen(String color){
        System.out.println("Class Screen: delegate to Pixel -> ");
        this.pixel = new Pixel(color);
        System.out.println("Color of the screen updated: " + color);
    }


    public void setPixel(ArrayList<Pixel> pixels, int pixelIndex, String newColor){
        System.out.println("Class Screen: delegate to Pixel -> ");
        pixels.get(pixelIndex).setPixel(newColor);
        System.out.println("The color of the pixel " + (pixelIndex + 1) + " is updated! The current color of the pixel is: " + newColor);
        System.out.println(pixels);
    }


    public String toString(){
        System.out.println("Class Screen: delegate to Dimensions -> ");
        return this.dimensions.toString();
    }
}
