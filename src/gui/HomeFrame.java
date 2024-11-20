package gui;

import javax.swing.*;

public class HomeFrame extends JFrame {
    private JLabel titolo;
    private JButton utenti, grafici;
    public HomeFrame() {
        super("Home");
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        titolo = new JLabel("REGISTRO ELETTRONICO");
        utenti = new JButton("GESTIONE UTENTI");
        grafici = new JButton("GRAFICI");
    }
}
