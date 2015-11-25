package userinterface;

import chilis.*;
import javax.swing.JProgressBar;

public class SetChiliTextAndHeat {

    /**
     * @param selectedChili is the current index of JComboBox "chilies".
     * @param heat is the heat level bar of the currently selected chili.
     * @return info about currently selected chili, else null.
     */
    protected String setInfoAndHeat(int selectedChili, JProgressBar heat) {
        if (selectedChili == 1) {
            Bell sbp = new Bell();
            heat.setValue(0);
            return createInfoString(sbp);
        } else if (selectedChili == 2) {
            Pimento pcp = new Pimento();
            heat.setValue(2);
            return createInfoString(pcp);
        } else if (selectedChili == 3) {
            Poblano p = new Poblano();
            heat.setValue(10);
            return createInfoString(p);
        } else if (selectedChili == 4) {
            Jalapeno j = new Jalapeno();
            heat.setValue(30);
            return createInfoString(j);
        } else if (selectedChili == 5) {
            CayenneTabasco ct = new CayenneTabasco();
            heat.setValue(35);
            return createInfoString(ct);
        } else if (selectedChili == 6) {
            Thai t = new Thai();
            heat.setValue(45);
            return createInfoString(t);
        } else if (selectedChili == 7) {
            Jamaican j = new Jamaican();
            heat.setValue(50);
            return createInfoString(j);
        } else if (selectedChili == 8) {
            DevilsTongue dt = new DevilsTongue();
            heat.setValue(60);
            return createInfoString(dt);
        } else if (selectedChili == 9) {
            Ghost g = new Ghost();
            heat.setValue(80);
            return createInfoString(g);
        } else if (selectedChili == 10) {
            TrinidadMorugaScorpion tms = new TrinidadMorugaScorpion();
            heat.setValue(95);
            return createInfoString(tms);
        } else if (selectedChili == 11) {
            CarolinaReaper cr = new CarolinaReaper();
            heat.setValue(100);
            return createInfoString(cr);
        }
        return null;
    }

    /**
     * @return String with complete info about a specific chili.
     */
    private String createInfoString(Chili chili) {
        String completeInfo;
        completeInfo = "Name: " + chili.getName();
        completeInfo += "\nColour: " + chili.getColour();
        completeInfo += "\nMax scoville: " + chili.getMaxScoville();
        completeInfo += "\nPrice each: " + chili.getPrice();
        completeInfo += "\n" + chili.getInfo();
        return completeInfo;
    }

}
