package chilis;

public class Jamaican extends Chili {

    public Jamaican() {
        super("Jamaican Hot", "Red", 200000, 30);
    }

    @Override
    public String getInfo() {
        return "Great for use in sauces, salsas and marinades.";
    }

}
