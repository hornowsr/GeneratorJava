package generator;

import static generator.Generacja.Generacja;
import static generator.OknoPlik.wczytajPlik;
import static generator.Podział.dodajDane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Okno extends javax.swing.JFrame {
   public static PrintWriter dane;
 

    public static String stan;
    public static String pom;
    public static String zdanie = "";
    public static String cosNapisal;

    public Okno() throws IOException {
        initComponents();
        setSize(450, 350);
        setVisible(true);
      //  URL baza = Okno.class.getResource("Podstawa.txt");
        File plik = new File("Podstawa.txt");
        try {
                wczytajPlik(plik);
             //   System.out.println("Dodano do bazy.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OknoPlik.class.getName()).log(Level.SEVERE, null, ex);
            //    System.out.println("Błąd podczas dodawania do bazy.");
            } catch (IOException ex) {
                Logger.getLogger(OknoPlik.class.getName()).log(Level.SEVERE, null, ex);
              //  System.out.println("Błąd podczas dodawania do bazy.");
            }
       try {
           
            dane=new PrintWriter(new BufferedWriter(new FileWriter("Podstawa.txt",true)));
           System.out.println("Dodano do bazy.");
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
        //setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);
        wejście.addKeyListener(null);
        wejście.setText(null);
        przywitanie();
    }

    public void przywitanie() {
        stan = "KAROL:" + "Witaj." + "Jestem Karol." + "\n" + "Porozmawiajmy." + "\n";
        wyjście.setText(stan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wyjście = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        wejście = new javax.swing.JTextArea();
        Plik = new javax.swing.JButton();
        Słowo = new javax.swing.JLabel();
        pierwsze = new javax.swing.JLabel();
        drugie = new javax.swing.JLabel();
        trzecie = new javax.swing.JLabel();
        drugielicznik = new javax.swing.JLabel();
        trzecielicznik = new javax.swing.JLabel();
        Ilość = new javax.swing.JLabel();
        Wyślij = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pierwszelicznik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Zamknij(evt);
            }
        });

        jPanel1.setLayout(null);

        wyjście.setColumns(20);
        wyjście.setRows(5);
        wyjście.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        wyjście.setEnabled(false);
        jScrollPane1.setViewportView(wyjście);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 286, 182);

        wejście.setColumns(20);
        wejście.setRows(5);
        wejście.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wejścieKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(wejście);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 211, 286, 80);

        Plik.setText("Wczytaj plik");
        Plik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlikActionPerformed(evt);
            }
        });
        jPanel1.add(Plik);
        Plik.setBounds(333, 11, 105, 23);

        Słowo.setText("Słowo");
        jPanel1.add(Słowo);
        Słowo.setBounds(314, 65, 40, 14);
        jPanel1.add(pierwsze);
        pierwsze.setBounds(314, 87, 50, 20);
        jPanel1.add(drugie);
        drugie.setBounds(314, 115, 60, 20);
        jPanel1.add(trzecie);
        trzecie.setBounds(314, 133, 60, 30);
        jPanel1.add(drugielicznik);
        drugielicznik.setBounds(393, 115, 40, 20);
        jPanel1.add(trzecielicznik);
        trzecielicznik.setBounds(393, 133, 50, 30);

        Ilość.setText("Ilość:");
        jPanel1.add(Ilość);
        Ilość.setBounds(393, 65, 40, 14);

        Wyślij.setText("Wyślij");
        Wyślij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyślijActionPerformed(evt);
            }
        });
        jPanel1.add(Wyślij);
        Wyślij.setBounds(314, 230, 80, 40);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(pierwszelicznik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pierwszelicznik, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(310, 60, 120, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int ileZdan(String doPodziału) {
        char[] podział = new char[doPodziału.length()];
        podział = doPodziału.toCharArray();
        int ileZdan = 0;
        for (int i = 0; i < doPodziału.length(); i++) {
            if (podział[i] == '.' || podział[i] == '!' || podział[i] == '?') {
                ileZdan++;
            }
        }
        return ileZdan;
    }
    public static int ileSlow(String doPodziału) {
        char[] podział = new char[doPodziału.length()];
        podział = doPodziału.toCharArray();
        int ileSlow = 0;
        for (int i = 0; i < doPodziału.length(); i++) {
            if (podział[i] == '.' || podział[i] == '!' || podział[i] == '?'|| podział[i] == ' ') {
                ileSlow++;
            }
        }
      //  ileSlow++;
        return ileSlow;
    }
    public static String poprawTekstWejsciowy(String Tekst) {//usowanie wielu spacji kropek itd.
        char[] pom = new char[Tekst.length()];
        String nowyTekst = "";
        int licznik = 0;
        pom = Tekst.toCharArray();
        if (!Tekst.equals("")) {
            //   System.out.println("Zdanie do obrobki:" + Tekst + "\n");
            while (pom[licznik] == ' ' || pom[licznik] == '.' || pom[licznik] == ',' || pom[licznik] == '!' || pom[licznik] == '?' || pom[licznik] == '\n') {
                licznik++;
                if (licznik == Tekst.length()) {
                    return "";
                }

            }
          //  System.out.println("Licznik:" + licznik + "\n");

            for (int i = licznik; i < Tekst.length() - 1; i++) {
                if (pom[i] == ' ' || pom[i] == '.' || pom[i] == '?' || pom[i] == '!' || pom[i] == '\n') {
                    if (pom[i + 1] == ' ' || pom[i + 1] == '.' || pom[i + 1] == '?' || pom[i + 1] == '!' || pom[i + 1] == '\n') {
                    } else {
                        nowyTekst = nowyTekst + pom[i];
                    }
                } else {
                    nowyTekst = nowyTekst + pom[i];
                }
            }

            nowyTekst = nowyTekst + pom[Tekst.length() - 1];
          //  if (nowyTekst.charAt(nowyTekst.length() - 1) != ' ' || nowyTekst.charAt(nowyTekst.length() - 1) != '?' || nowyTekst.charAt(nowyTekst.length() - 1) != '!') {
            //     nowyTekst = nowyTekst + ".";
            // }
            //System.out.println("COZWRACAM:"+nowyTekst+"+\n");
            return nowyTekst;
        } else {
            return "";
        }
    }

    public static String duzeZnaki(String zdanie) {
        String toLowerCase = zdanie.toLowerCase();
        char pomo[];
        pomo = toLowerCase.toCharArray();
        String Zdanie = "";
        Zdanie = Zdanie + pomo[0];
        Zdanie = Zdanie.toUpperCase();
        // System.out.println("Duzeznaki:"+Zdanie+"\n");
        for (int i = 1; i < pomo.length; i++) {
            Zdanie = Zdanie + pomo[i];
        }
        // System.out.println("Duzeznaki:"+Zdanie+"\n");
        return Zdanie;
    }

    public static void Obrobka(String zdanie, int czyPlik) {

        // System.out.println("Zdanie:" + zdanie + "\n");
        //zdanie = poprawTekstWejsciowy(zdanie);
        //System.out.println("Popraawione:" + zdanie + "\n");
        int zdania = ileZdan(zdanie);
        //  System.out.println("ilezdan:"+zdania+"\n");
        if (zdania == 0) {
            zdanie = zdanie + ".";
            zdania = 1;
        }
        zdanie = duzeZnaki(zdanie);
        if (czyPlik == 0) {
            stan = stan + "\n" + "Ty:";
        }
        for (int i = 0; i < zdania; i++) {
            pom = podzielWejscie(zdanie);

            pom = poprawTekstWejsciowy(pom);
            pom = duzeZnaki(pom);
            // System.out.println("POM:"+pom+"\n");
            if (czyPlik == 0) {
                stan = stan + pom;
                wyjście.setText(stan);
            }
            if (pom != " ") {
                dodajDane(pom);

            }
            zdanie = noweZdanie(zdanie);
        }

        stan = stan + "\n";
        wyjście.setText(stan);
    }
    private void WyślijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WyślijActionPerformed
        zdanie = wejście.getText();
        wejście.setText("");
        //   System.out.println("WEJSCIE:" + zdanie + "+" + "\n");
        zdanie = poprawTekstWejsciowy(zdanie);
        dane.println(zdanie);
        //System.out.println("WEJSCIE:" + zdanie + "+" + "\n");
       
        cosNapisal = zdanie + " ";
         int ileSlow = ileSlow(cosNapisal);
        System.out.println("ILESLOW:"+ileSlow+"\n");
        if(ileSlow >=4){
        // System.out.println("WEJSCIE:" + zdanie + "+" + "\n");
        if (!zdanie.equals("")) {
            //   System.out.println("Wszedłem");
            Obrobka(zdanie, 0);
            zdanie = Generacja();
            zdanie = duzeZnaki(zdanie);
            dane.println(zdanie);
             
            stan = stan + "Karol:" + zdanie;
            wyjście.setText(stan);
        } }else {
            stan = stan + "\n" + "Karol:" + "Może ułożyłbyś jakieś bardziej złożone zdanie?" + "\n";
            wyjście.setText(stan);
        }

    }//GEN-LAST:event_WyślijActionPerformed

    private void PlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlikActionPerformed
        OknoPlik.OknoPlikStart();
    }//GEN-LAST:event_PlikActionPerformed

    private void wejścieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wejścieKeyPressed

    }//GEN-LAST:event_wejścieKeyPressed

    private void Zamknij(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Zamknij
      dane.close();
    }//GEN-LAST:event_Zamknij

    public static String noweZdanie(String zdanie) {
        int licznik = 0;
        String nowy = "";
        char pom[] = new char[zdanie.length()];
        pom = zdanie.toCharArray();
        while (pom[licznik] != '.' && pom[licznik] != '!' && pom[licznik] != '?') {
            licznik++;
        }
        licznik++;

        for (int i = 0; i < pom.length - licznik; i++) {
            nowy = nowy + pom[licznik + i];

        }
        //    System.out.println("Nowy do podzialu:"+nowy+"\n");
        return nowy;
    }

    public static String podzielWejscie(String zdanie) {
        char pom[] = new char[zdanie.length()];
        pom = zdanie.toCharArray();
        String nowy = "";
        int i = 0;
        while (i < zdanie.length() && pom[i] != '.' && pom[i] != '?' && pom[i] != '!') {
            nowy = nowy + pom[i];
            i++;
        }
        nowy = nowy + pom[i];
        return nowy;
    }

    public static String wezZdanie() {
        return pom;
    }

    public static String getText() {
        String Zdanie = wejście.getText();
        wejście.setText(null);
        return Zdanie;
    }

    public static void setText(String s) {
        zdanie = s;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ilość;
    private javax.swing.JButton Plik;
    private javax.swing.JLabel Słowo;
    private javax.swing.JButton Wyślij;
    public static javax.swing.JLabel drugie;
    public static javax.swing.JLabel drugielicznik;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel pierwsze;
    public static javax.swing.JLabel pierwszelicznik;
    public static javax.swing.JLabel trzecie;
    public static javax.swing.JLabel trzecielicznik;
    public static javax.swing.JTextArea wejście;
    public static javax.swing.JTextArea wyjście;
    // End of variables declaration//GEN-END:variables
}
