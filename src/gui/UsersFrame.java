package gui;

import javax.swing.*;
import java.awt.*;

public class UsersFrame extends JFrame {
    public UsersFrame() {
        super("Utenti");
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }
}
