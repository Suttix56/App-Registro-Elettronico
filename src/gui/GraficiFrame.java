package gui;

import javax.swing.*;

public class GraficiFrame extends JFrame {
    public GraficiFrame(){
        super("Grafici");
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }
}
