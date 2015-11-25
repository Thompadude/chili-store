package shop;

import chilis.*;

public class GetChiliesInCart {

    /**
     * @param cart is the current customer cart.
     * @return Strings with info if chili is found is customer cart.
     */
    protected String getBellsInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;

        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Bell) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Sweet Bell Pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getPimentoInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Pimento) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Pimento Chili Pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getPoblanoInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Poblano) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Poblano chili pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getJalapenoInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Jalapeno) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Jalapeno Pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getCayenneTabascoInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof CayenneTabasco) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Cayenne/Tabasco Pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getThaiInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Thai) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Thai/Indian Pepper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getJamaicanInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Jamaican) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Jamaican Hot\t\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getDevilsTongueInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof DevilsTongue) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Devil's Tongue Chili Peppers\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getGhostInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Ghost) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Ghost Pepper\t\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getTrinidadInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof TrinidadMorugaScorpion) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Trinidad Moruga Scorpion Chili Pepper\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

    protected String getCarolinaInCart(Cart cart) {
        int amountOfChilies = 0;
        int totalPriceForChilies = 0;
        
        boolean chiliexits = false;
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof CarolinaReaper) {
                totalPriceForChilies += cart.getChilies().get(i).getPrice();
                chiliexits = true;
                amountOfChilies++;
            }
        }
        if (chiliexits) {
            return "Carolina Reaper\t\t" + amountOfChilies + " pce\t" + "price: " + totalPriceForChilies + "\n";
        }
        return "";
    }

}
