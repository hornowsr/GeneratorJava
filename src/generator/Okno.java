package generator;

import static generator.Generacja.Generacja;
import static generator.Podział.dodajDane;
import static generator.Podział.wyswietl;
import static generator.Statystyka.setSlowo;
import java.util.ArrayList;

public class Okno extends javax.swing.JFrame {

    public static String stan;
    public static String pom;
    public static String zdanie = "";

    public Okno() {
        initComponents();

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
        pierwszelicznik = new javax.swing.JLabel();
        drugielicznik = new javax.swing.JLabel();
        trzecielicznik = new javax.swing.JLabel();
        Ilość = new javax.swing.JLabel();
        Wyślij = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wyjście.setColumns(20);
        wyjście.setRows(5);
        wyjście.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        wyjście.setEnabled(false);
        jScrollPane1.setViewportView(wyjście);

        wejście.setColumns(20);
        wejście.setRows(5);
        wejście.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wejścieKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(wejście);

        Plik.setText("Plik");
        Plik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlikActionPerformed(evt);
            }
        });

        Słowo.setText("Słowo");

        Ilość.setText("Ilość:");

        Wyślij.setText("Wyślij");
        Wyślij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyślijActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Plik)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pierwsze)
                                    .addComponent(Słowo)
                                    .addComponent(drugie)
                                    .addComponent(trzecie))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pierwszelicznik)
                                    .addComponent(drugielicznik)
                                    .addComponent(trzecielicznik)
                                    .addComponent(Ilość))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Wyślij)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Plik)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Słowo)
                            .addComponent(Ilość))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pierwsze)
                            .addComponent(pierwszelicznik))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drugie)
                            .addComponent(drugielicznik))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trzecie)
                            .addComponent(trzecielicznik))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Wyślij)
                        .addGap(47, 47, 47))))
        );

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

    public static String poprawTekstWejsciowy(String Tekst) {//usowanie wielu spacji kropek itd.
        char[] pom = new char[Tekst.length()];
        String nowyTekst = "";
        int licznik = 0;
        pom = Tekst.toCharArray();
        if (!Tekst.equals("")) {
           //   System.out.println("Zdanie do obrobki:" + Tekst + "\n");
            while (pom[licznik] == ' ' || pom[licznik] == '.' || pom[licznik] == ',' || pom[licznik] == '!' || pom[licznik] == '?'||pom[licznik] == '\n' ) {
              licznik++;
                if(licznik==Tekst.length())
                    return "";
                
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
            if (nowyTekst.charAt(nowyTekst.length() - 1) != ' ' || nowyTekst.charAt(nowyTekst.length() - 1) != '?' || nowyTekst.charAt(nowyTekst.length() - 1) != '!') {
                nowyTekst = nowyTekst + ".";
            }
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

    public static void Obrobka(String zdanie) {

        // System.out.println("Zdanie:" + zdanie + "\n");
        //zdanie = poprawTekstWejsciowy(zdanie);

        System.out.println("Popraawione:" + zdanie + "\n");
        int zdania = ileZdan(zdanie);
        //  System.out.println("ilezdan:"+zdania+"\n");
        if (zdania == 0) {
            zdanie = zdanie + ".";
            zdania = 1;
        }
        zdanie = duzeZnaki(zdanie);
        stan = stan + "\n" + "Ty:";

        for (int i = 0; i < zdania; i++) {
            pom = podzielWejscie(zdanie);
            pom = duzeZnaki(pom);
            stan = stan + pom;
            wyjście.setText(stan);
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
        System.out.println("WEJSCIE:" + zdanie + "+" + "\n");
        zdanie = poprawTekstWejsciowy(zdanie);
        System.out.println("WEJSCIE:" + zdanie + "+" + "\n");
        if (!zdanie.equals("")) {
            System.out.println("Wszedłem");
            Obrobka(zdanie);
            zdanie = Generacja();
            // zdanie = poprawTekstWejsciowy(zdanie);
            stan = stan + "Karol:" + zdanie;
            wyjście.setText(stan);
        } else {
            stan = stan + "Karol:" + "Żyjesz?" + "\n";
            wyjście.setText(stan);
        }
       
    }//GEN-LAST:event_WyślijActionPerformed

    private void PlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlikActionPerformed
        OknoPlik.OknoPlikStart();
    }//GEN-LAST:event_PlikActionPerformed

    private void wejścieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wejścieKeyPressed

    }//GEN-LAST:event_wejścieKeyPressed

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
