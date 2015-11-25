package shop;

import chilis.*;

/**
 * Created for potential future development. 
 */
public class CheckIfChiliExistInCart {

    public boolean doBellsExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Bell) {
                return true;
            }
        }
        return false;
    }

    public boolean doPimentoExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Pimento) {
                return true;
            }
        }
        return false;
    }

    public boolean doPoblanoExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Poblano) {
                return true;
            }
        }
        return false;
    }

    public boolean doJalapenoExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Jalapeno) {
                return true;
            }
        }
        return false;
    }

    public boolean doCayenneTabascoExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof CayenneTabasco) {
                return true;
            }
        }
        return false;
    }

    public boolean doThaiExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Thai) {
                return true;
            }
        }
        return false;
    }

    public boolean doJamaicanExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Jamaican) {
                return true;
            }
        }
        return false;
    }

    public boolean doDevilsTongueExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof DevilsTongue) {
                return true;
            }
        }
        return false;
    }

    public boolean doGhostExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof Ghost) {
                return true;
            }
        }
        return false;
    }

    public boolean doTrinidExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof TrinidadMorugaScorpion) {
                return true;
            }
        }
        return false;
    }

    public boolean doCarolinaExist(Cart cart) {
        for (int i = 0; i < cart.getChilies().size(); i++) {
            if (cart.getChilies().get(i) instanceof CarolinaReaper) {
                return true;
            }
        }
        return false;
    }

}
