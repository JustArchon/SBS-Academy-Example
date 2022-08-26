package Color;

public class Color {

    public static void main(String[] args) {

    }
    private int red;
    public int getRed(){
        return red;
    }
    public void setRed(int red){
        this.red = red;
    }
    private int green;
    public int getGreen(){
        return green;
    }
    public void setGreen(int green){
        this.green = green;
    }
    private int blue;
    public int getBlue(){
        return blue;
    }
    public void setBlue(int blue){
        this.blue = blue;
    }
    public Color(){}
    public Color(int red){
        this.red = red;
    }
    public Color(int blue, int green){
        this.blue = blue;
        this.green = green;
    }
    public Color(int red,int blue, int green){
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
    public static Color mixColor(Color a, Color b){
        Color newColor = new Color(a.getRed()+b.getRed(),a.getBlue()+b.getBlue(),a.getGreen()+b.getGreen());
        return newColor;
    }
}
