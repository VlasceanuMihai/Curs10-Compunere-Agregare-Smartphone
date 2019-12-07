package SmartphonePackage;

public class Pixel {
    private String color;


    public Pixel(){
        this.color = "white";
    }


    public Pixel(String color){
        this.color = color;
    }


    public void setPixel(String newColor){
        this.color = newColor;
    }

    public String toString(){
        return this.color;
    }
}
