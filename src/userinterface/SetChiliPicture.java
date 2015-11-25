package userinterface;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * All photos is in 247x192 resolution.
 */
public class SetChiliPicture {

    public void setPepperPicture(int scrollPanelChoice, JLabel pepperPic) {
        if (scrollPanelChoice == 1) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/bell.jpg"));
        } else if (scrollPanelChoice == 2) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/pimento.jpg"));
        } else if (scrollPanelChoice == 3) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/poblano.jpg"));
        } else if (scrollPanelChoice == 4) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/jalapeno.jpg"));
        } else if (scrollPanelChoice == 5) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/cayenne.jpg"));
        } else if (scrollPanelChoice == 6) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/thaichilipeppers.jpg"));
        } else if (scrollPanelChoice == 7) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/jamaica.jpg"));
        } else if (scrollPanelChoice == 8) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/devilst.jpg"));
        } else if (scrollPanelChoice == 9) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/ghost.jpg"));
        } else if (scrollPanelChoice == 10) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/trinidad.jpg"));
        } else if (scrollPanelChoice == 11) {
            pepperPic.setIcon(createNewPic("/userinterface/photos/carolina.jpg"));
        } else {
            pepperPic.setIcon(null);
        }
    }

    private ImageIcon createNewPic(String path) {
        return new ImageIcon(getClass().getResource(path));
    }

}
