/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.Obrobka;
import static generator.Okno.setText;
import static generator.Podział.dodajDane;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Rafał
 */
public class OknoPlik extends JPanel implements ActionListener {
    
    JButton dodajPlikButton;
    JTextArea log;
    JFileChooser fc;

    public OknoPlik() {
        super(new BorderLayout());

        log = new JTextArea(5, 20);
        log.setMargin(new Insets(5, 5, 5, 5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);

        fc = new JFileChooser();

        dodajPlikButton = new JButton("Wybierz plik");
        dodajPlikButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(dodajPlikButton);

        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int pom = fc.showOpenDialog(OknoPlik.this);
        if (pom == JFileChooser.APPROVE_OPTION) {
            File plik = fc.getSelectedFile();
            log.append("Otwieranie pliku: " + plik.getName() + ".\n");
            try {
                wczytajPlik(plik);
                log.append("Dodano do bazy.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OknoPlik.class.getName()).log(Level.SEVERE, null, ex);
                log.append("Błąd podczas dodawania do bazy.");
            } catch (IOException ex) {
                Logger.getLogger(OknoPlik.class.getName()).log(Level.SEVERE, null, ex);
                log.append("Błąd podczas dodawania do bazy.");
            }
        }
        log.setCaretPosition(log.getDocument().getLength());
    }

    private static void initOknoPlik() {
        JFrame frame = new JFrame("Dodaj plik");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new OknoPlik());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void OknoPlikStart() {
        SwingUtilities.invokeLater(() -> {
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            initOknoPlik();
        });
    }
    
    public static void wczytajPlik(File plik) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(plik);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String linia, tekst = "";
        while((linia = bufferReader.readLine()) != null) {
            tekst = linia + " ";
        }
        fileReader.close();
        String nowy="";
        char [] pom = new char[tekst.length()];
        pom = tekst.toCharArray();
       // System.out.println("Przed:"+tekst+"+"+"\n");
        for(int i=0;i<tekst.length()-1;i++){
            nowy = nowy + pom[i];
         //   System.out.println("Tekst:"+nowy+"+"+"\n");
        }
       // zdanie = nowy;
        System.out.println("Tekst:"+nowy+"\n");
        Obrobka(nowy);
    }
}
