package chilis;

public class Ghost extends Chili{

    public Ghost() {
        super("Ghost Pepper", "Green/Orange/Red", 1000000, 45);
    }

    @Override
    public String getInfo() {
        return "Use caution when cooking with these. Wear gloves and protect your eyes.";
    }
    
}
