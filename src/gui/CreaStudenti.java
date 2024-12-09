package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreaStudenti extends JFrame {

    private JTextField nome, cognome, dataNascita, classeCF;  //ToDo -> Implementare il CF (compilamento automatico del codice fiscale)
    private JButton salvaButton, annullaButton;

    public CreaStudenti() {

        setTitle("Crea Studente");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la finestra sullo schermo
        setLayout(new GridLayout(5, 2, 10, 10)); // Layout a griglia

        nome = new JTextField();
        cognome = new JTextField();
        dataNascita = new JTextField();

        JLabel nomeLabel = new JLabel("Nome:");
        JLabel cognomeLabel = new JLabel("Cognome:");
        JLabel dataNascita_laLabel = new JLabel("Data di nascita:");

        salvaButton = new JButton("Salva");
        annullaButton = new JButton("Annulla");

        add(nomeLabel);
        add(nome);

        add(cognomeLabel);
        add(cognome);

        add(dataNascita_laLabel);
        add(dataNascita);

        add(dataNascita_laLabel);
        add(dataNascita);

        add(salvaButton);
        add(annullaButton);

        // Aggiungi ActionListener per il pulsante "Salva"
        salvaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvaStudente();
            }
        });

        // Aggiungi ActionListener per il pulsante "Annulla"
        annullaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Chiudi la finestra senza salvare
            }
        });

        // Imposta la finestra visibile
        setVisible(true);
    }

    // Metodo per salvare lo studente (qui stampiamo i dati nella console)
    private void salvaStudente() {
        String name = nome.getText();
        String surname = cognome.getText();
        String anno = dataNascita.getText();

        if (name.isEmpty() || surname.isEmpty() || anno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tutti i campi devono essere compilati!", "Errore", JOptionPane.ERROR_MESSAGE);
        } else {
            // Simula il salvataggio dei dati
            System.out.println("Studente Creato:");
            System.out.println("Nome: " + name);
            System.out.println("Cognome: " + surname);
            System.out.println("Matricola: " + anno);

            // Chiudi la finestra dopo il salvataggio
            JOptionPane.showMessageDialog(this, "Studente creato con successo!", "Successo", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }
}
