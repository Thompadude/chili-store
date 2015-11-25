package chilis;

public class Pimento extends Chili {

    public Pimento() {
        super("Pimento Chili Pepper", "Red", 500, 12);
    }

    @Override
    public String getInfo() {
        return "Not just for stuffing olives. Pimiento is the Spanish word for \"pepper\".";
    }

}
