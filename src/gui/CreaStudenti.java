package gui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Objects;

public class CreaStudenti extends JFrame {
    public CreaStudenti() {
        int width, height, b_height, b_width;

        setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        setUndecorated(true); //--> toglie la barra in alto
        setVisible(true);

        Container container = this.getContentPane();

        Dimension screenSize = getSize();
        width = (int) screenSize.getWidth();
        height = (int) screenSize.getHeight();

        b_height = height / 12;
        b_width = width / 9;

        JPanel sfondoPanel = new JPanel();

        // SFONDO ROSSO------------------------------------------------------------------------------------
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/red.jpg")));
        Image sfondo = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        icon = new ImageIcon(sfondo);
        JLabel sfondoLabel = new JLabel(icon);
        sfondoPanel.add(sfondoLabel);
        // SFONDO ROSSO------------------------------------------------------------------------------------

        // PANEL FORM--------------------------------------
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBounds(width / 2 - 150, height / 3, 300, height / 3);
        formPanel.setOpaque(false);

        // Creazione dei pannelli per etichetta e campo di testo
        JPanel nomePanel = new JPanel();
        nomePanel.setLayout(new BoxLayout(nomePanel, BoxLayout.X_AXIS));
        nomePanel.setOpaque(false);
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nomeLabel.setForeground(Color.WHITE);
        JTextField nomeField = new JTextField();
        nomeField.setPreferredSize(new Dimension(200, 30));
        nomePanel.add(nomeLabel);
        nomePanel.add(Box.createHorizontalStrut(10));  // Spazio tra etichetta e campo
        nomePanel.add(nomeField);

        JPanel cognomePanel = new JPanel();
        cognomePanel.setLayout(new BoxLayout(cognomePanel, BoxLayout.X_AXIS));
        cognomePanel.setOpaque(false);
        JLabel cognomeLabel = new JLabel("Cognome:");
        cognomeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        cognomeLabel.setForeground(Color.WHITE);
        JTextField cognomeField = new JTextField();
        cognomeField.setPreferredSize(new Dimension(200, 30));
        cognomePanel.add(cognomeLabel);
        cognomePanel.add(Box.createHorizontalStrut(10));
        cognomePanel.add(cognomeField);

        // Modifica per la data di nascita con 3 JComboBox (giorni, mesi, anni)
        JPanel dataNascitaPanel = new JPanel();
        dataNascitaPanel.setLayout(new BoxLayout(dataNascitaPanel, BoxLayout.X_AXIS));
        dataNascitaPanel.setOpaque(false);
        JLabel dataNascitaLabel = new JLabel("Data di Nascita:");
        dataNascitaLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        dataNascitaLabel.setForeground(Color.WHITE);

        // ComboBox per i giorni
        JComboBox<String> giornoCombo = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            giornoCombo.addItem(String.format("%02d", i));
        }

        // ComboBox per i mesi (nomi dei mesi)
        JComboBox<String> meseCombo = new JComboBox<>();
        String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
        for (String mese : mesi) {
            meseCombo.addItem(mese);
        }

        // ComboBox per gli anni (da un range specifico, ad esempio dal 1900 al 2024)
        JComboBox<String> annoCombo = new JComboBox<>();
        for (int i = 1900; i <= 2024; i++) {
            annoCombo.addItem(String.valueOf(i));
        }

        // Listener per aggiornare i giorni in base al mese e anno selezionati
        ActionListener aggiornaGiorni = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int giorniMax = 31;
                int meseSelezionato = meseCombo.getSelectedIndex(); // Ottieni l'indice del mese selezionato (0-based)
                int anno = Integer.parseInt((String) annoCombo.getSelectedItem());
                Calendar cal = Calendar.getInstance();
                cal.set(anno, meseSelezionato, 1);
                giorniMax = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

                // Rimuovi tutti i giorni precedenti
                giornoCombo.removeAllItems();

                // Aggiungi i giorni per il mese selezionato
                for (int i = 1; i <= giorniMax; i++) {
                    giornoCombo.addItem(String.format("%02d", i));
                }
            }
        };

        // Aggiorna i giorni quando cambiano mese o anno
        meseCombo.addActionListener(aggiornaGiorni);
        annoCombo.addActionListener(aggiornaGiorni);

        dataNascitaPanel.add(dataNascitaLabel);
        dataNascitaPanel.add(Box.createHorizontalStrut(10));  // Spazio tra etichetta e campi
        dataNascitaPanel.add(giornoCombo);
        dataNascitaPanel.add(Box.createHorizontalStrut(10));  // Spazio tra combo
        dataNascitaPanel.add(meseCombo);
        dataNascitaPanel.add(Box.createHorizontalStrut(10));  // Spazio tra combo
        dataNascitaPanel.add(annoCombo);


        // Aggiungi i pannelli di input al formPanel
        formPanel.add(nomePanel);
        formPanel.add(Box.createVerticalStrut(20));  // Spazio tra i campi
        formPanel.add(cognomePanel);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(dataNascitaPanel);

        // Aggiungi il formPanel allo sfondo
        sfondoLabel.add(formPanel);

        // AGGIUNTA PULSANTI AI PANEL-------------
        JPanel utentiPanel = new JPanel(new GridLayout(1, 1));
        utentiPanel.setBounds(width / 2 - 275, height / 2 + 50, b_width * 3, b_height);
        utentiPanel.setOpaque(false);

        // Aggiungi il pannello di sfondo al container
        container.add(sfondoPanel);

        revalidate();
        repaint();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
