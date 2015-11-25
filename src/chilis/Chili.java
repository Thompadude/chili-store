package chilis;

public abstract class Chili implements GetInfo {

    private String name;
    private String colour;
    private double maxScoville;
    private int price;

    public Chili(String name, String colour, double maxScoville, int price) {
        this.name = name;
        this.colour = colour;
        this.maxScoville = maxScoville;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double getMaxScoville() {
        return maxScoville;
    }

    public int getPrice() {
        return price;
    }
    
}
