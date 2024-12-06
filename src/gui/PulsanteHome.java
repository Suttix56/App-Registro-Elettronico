package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PulsanteHome extends JButton {
    public PulsanteHome(int height){
        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/casa.png")));
        Image newImage = imageIcon.getImage().getScaledInstance(height, height, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        setIcon(imageIcon);
        setIconTextGap(0);
    }
}
