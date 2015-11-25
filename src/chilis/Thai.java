package chilis;

public class Thai extends Chili{

    public Thai() {
        super("Thai/Indian Pepper", "Red/Green/Yellow", 100000, 21);
    }

    @Override
    public String getInfo() {
        return "There are at least 79 separate varieties of chili that have appeared from three species in Thailand.";
    }
    
}
