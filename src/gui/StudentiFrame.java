package gui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.util.Objects;

public class StudentiFrame extends JFrame {
    public StudentiFrame(){
        int width, height, b_height, b_width;

        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);

        Container container = this.getContentPane();

        Dimension screenSize = getSize();
        width = (int) screenSize.getWidth();
        height = (int) screenSize.getHeight();

        b_height = height/12;
        b_width = width/9;

        JPanel sfondoPanel = new JPanel();

        //SFONDO ROSSO------------------------------------------------------------------------------------
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/red.jpg")));
        Image sfondo = icon.getImage().getScaledInstance(width,height,Image.SCALE_SMOOTH);
        icon = new ImageIcon(sfondo);
        JLabel sfondoLabel = new JLabel(icon);
        sfondoPanel.add(sfondoLabel);
        //SFONDO ROSSO------------------------------------------------------------------------------------

        //TITOLO----------------------------------------------------
        JPanel titlePanel = new JPanel(new GridLayout(1,1));
        titlePanel.setBounds(width/6,height/4,width*2/3,height/5);
        titlePanel.setOpaque(false);
        sfondoLabel.add(titlePanel);
        titlePanel.setBackground(Color.white);

        JLabel titoloLabel = new JLabel("STUDENTI");
        titoloLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        titoloLabel.setFont(TitleFont.getFont((float) width/20));

        titoloLabel.setForeground(Color.white);
        titlePanel.add(titoloLabel);
        //TITOLO-----------------------------------------------------

        //PULSANTI------------------------------------------------------
        JButton crea = new JButton("CREA");
        crea.setFont(TitleFont.getFont((float) width/68));
        crea.setBorder(new EtchedBorder());
        crea.setBackground(Color.WHITE);
        crea.setForeground(Color.DARK_GRAY);

        JButton modifica = new JButton("MODIFICA");
        modifica.setFont(TitleFont.getFont((float) width/68));
        modifica.setBorder(new EtchedBorder());
        modifica.setBackground(Color.WHITE);
        modifica.setForeground(Color.DARK_GRAY);

        JButton elimina = new JButton("ELIMINA");
        elimina.setFont(TitleFont.getFont((float) width/68));
        elimina.setBorder(new EtchedBorder());
        elimina.setBackground(Color.WHITE);
        elimina.setForeground(Color.DARK_GRAY);
        //PULSANTI------------------------------------------------------

        //PANEL PULSANTI-------------------------------------------------------
        JPanel opzioniPanel = new JPanel(new GridLayout(3,1));
        sfondoLabel.add(opzioniPanel);
        opzioniPanel.setBounds(width/4,height/2,b_width,b_height*3);
        opzioniPanel.setOpaque(false);

        opzioniPanel.add(crea);
        opzioniPanel.add(modifica);
        opzioniPanel.add(elimina);
        //PANEL PULSANTI-------------------------------------------------------

        //LISTA NOMI------------------------------

        //LISTA NOMI------------------------------

        container.add(sfondoPanel);
        revalidate();
        repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
