package shop;

import chilis.*;

public class CartManager {

    private Cart cart;

    /**
     * @param cart is the current customer cart.
     * @param amount is the selected amount of a specific chili.
     * @param selectedChili is the chili selected by user in the combo box.
     */
    public void addChiliesToCart(Cart cart, Integer amount, int selectedChili) {
        if (selectedChili == 1) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Bell());
            }
        } else if (selectedChili == 2) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Pimento());
            }
        } else if (selectedChili == 3) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Poblano());
            }
        } else if (selectedChili == 4) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Jalapeno());
            }
        } else if (selectedChili == 5) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new CayenneTabasco());
            }
        } else if (selectedChili == 6) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Thai());
            }
        } else if (selectedChili == 7) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Jamaican());
            }
        } else if (selectedChili == 8) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new DevilsTongue());
            }
        } else if (selectedChili == 9) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new Ghost());
            }
        } else if (selectedChili == 10) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new TrinidadMorugaScorpion());
            }
        } else if (selectedChili == 11) {
            for (int i = 0; i < amount; i++) {
                cart.addChili(new CarolinaReaper());
            }
        }
    }

    /**
     * @param cart is the current customer cart.
     * @param chiliType is the selected chili.
     * @param amountOfChiliesToRemove is the amount of chilies to remove.
     * @return String to set as feedback to confirm deletion.
     */
    public String removeSelectedChiliFromCart(Cart cart, String chiliType, int amountOfChiliesToRemove) {
        int chiliesRemoved = 0;
        for (int i = 0; i < amountOfChiliesToRemove; i++) {
            for (int j = 0; j < cart.getChilies().size(); j++) {
                if (chiliType.equals(cart.getChilies().get(j).getName())) {
                    cart.getChilies().remove(j);
                    chiliesRemoved++;
                    break;
                }
            }
        }
        return chiliesRemoved + " " + chiliType + " removed.";
    }

    public Cart createCart() {
        if (cart == null) {
            return new Cart();
        } else {
            return cart;
        }
    }
    
    public int getTotalPrice(Cart cart){
        int totalPrice = 0;
        for (int i = 0 ; i < cart.getChilies().size(); i++){
            totalPrice += cart.getChilies().get(i).getPrice();
        }
        return totalPrice;
    }

}
