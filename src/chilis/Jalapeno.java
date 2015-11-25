package chilis;

public class Jalapeno extends Chili {

    public Jalapeno() {
        super("Jalapeno Pepper", "Green/Red/Yellow", 8000, 14);
    }

    @Override
    public String getInfo() {
        return "The world's most popular chili pepper!";
    }

}
