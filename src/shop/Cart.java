package shop;

import chilis.Chili;
import java.util.ArrayList;

public class Cart {

    ArrayList<Chili> chilies;

    public ArrayList<Chili> getChilies() {
        if (this.chilies == null) {
            return this.chilies = new ArrayList<>();
        }
        return this.chilies;
    }

    public void addChili(Chili chili) {
        if (chilies == null) {
            this.chilies = new ArrayList<>();
            this.chilies.add(chili);
        } else {
            this.chilies.add(chili);
        }
    }

}
