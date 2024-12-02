package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProvaFrame {
    public ProvaFrame() {
        // Crea la schermata principale
        JFrame frame = new JFrame("Registro Elettronico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  //ToDo -> Serve per aprire la finestra a schermo intero.
        frame.setResizable(false);

        // Crea il pannello principale
        frame.setLayout(new BorderLayout());

        // Crea il titolo "Registro Elettronico"
        JLabel titleLabel = new JLabel("Registro Elettronico", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 50));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Crea il pannello principale con GridBagLayout per centrare i bottoni
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); //ToDo -> E' un gridLayout più "personalizzabile". Crea un layout per centrare i bottoni.
        GridBagConstraints gbc = new GridBagConstraints();  //ToDO -> GridBagConstraints consente di personalizzare la posizione e la dimensione dei componenti (in una griglia) in modo più preciso.
        gbc.gridx = 0; // Colonna 0
        gbc.gridy = 0; // Riga 0
        gbc.insets = new Insets(10, 10, 10, 10); // Spaziatura tra i bottoni

        // Crea i bottoni
        JButton studentButton = new JButton("Studente");
        JButton teacherButton = new JButton("Docente");
        JButton parentButton = new JButton("Genitore");

        // Rimpicciolisci i bottoni (imposta le dimensioni preferite)
        studentButton.setPreferredSize(new Dimension(150, 40));
        teacherButton.setPreferredSize(new Dimension(150, 40));
        parentButton.setPreferredSize(new Dimension(150, 40));

        // Aggiungi ActionListener ai bottoni per gestire il clic
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ruolo selezionato: Studente");
            }
        });

        teacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ruolo selezionato: Docente");
            }
        });

        parentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Ruolo selezionato: Genitore");
            }
        });

        // Posizionamento dei bottoni al centro (riga 1, colonna 0, colonna 1, colonna 2)
        gbc.gridy = 1; // Riga 1
        gbc.gridwidth = 1; // Ogni bottone occupa una colonna
        panel.add(studentButton, gbc);

        gbc.gridy = 2; // Riga 2
        panel.add(teacherButton, gbc);

        gbc.gridy = 3; // Riga 3
        panel.add(parentButton, gbc);

        // Aggiungi il pannello principale alla finestra
        frame.add(panel);

        // Imposta la visibilità della finestra
        frame.setVisible(true);
    }
}
