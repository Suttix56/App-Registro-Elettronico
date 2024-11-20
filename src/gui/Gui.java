package gui;

import Controllore.Controllore;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    private final Controllore controllore;

    public Gui(Controllore controllore){
        //comandi utili
        super("Registro elettronico");
        this.controllore = controllore;
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        this.setBackground(Color.YELLOW);
        /*this.infoPanel = new JPanel(new GridLayout(2,1));
        this.turnoLabel = new JLabel("ciao");*/
    }

    public static void main(String[] args) {
        new Gui(new Controllore());
    }
}