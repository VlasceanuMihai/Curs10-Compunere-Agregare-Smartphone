package SmartphonePackage;

public class Dimensions {
    private final int width;
    private final int length;
    private final int depth;


    public Dimensions(int width, int length, int depth){
        this.width = width;
        this.length = length;
        this.depth = depth;
    }


    public String toString(){
        return "The dimensions of the screen:\n\t- width: " + this.width + "\n\t- length: " + this.length +
                "\n\t- depth: " + this.depth;
    }
}
