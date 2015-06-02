/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.cosNapisal;
import static generator.Okno.duzeZnaki;
import static generator.Okno.ileSlow;
import static generator.Okno.poprawTekstWejsciowy;
import static generator.Okno.wyjście;
import static generator.Podział.Lista;
import static generator.Statystyka.dodajDoStatystyk;
import static generator.Statystyka.setSlowo;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Rafał
 */
public class Generacja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Okno okno = new Okno();
        okno.setVisible(true);
    }

    public static String wytnij(String S) {
        int kiedy = 0;
        int start = 0;
        int j = 0;
        //  System.out.println("[rzedWYCIALEM:"+S+"\n");
        while (kiedy < 3) {
            if (kiedy == 0) {
                start++;
            }
            if (S.charAt(j) != ' ') {
                j++;
            } else {
                kiedy++;
                j++;
            }
        }

        //  System.out.println("START:"+start+"\n"+"STOP:"+j+"\n");
        S = S.substring(start, j - 1);
        //System.out.println("WYCIALEM:" + S + "\n");
        return S;

    }

    public static String wytnijSlowo(String zdanie, int n) {
        char[] pom = new char[zdanie.length()];
        pom = zdanie.toCharArray();
        int pomN = 0;
        int start = 0;
        int stop = 0;
        while (pomN < n) {
            if(n==1){
                start++;
            }
            if (pom[stop] == ' ' && pomN < n - 1&&n!=1) {
                pomN++;
                stop++;
                start++;
            } else if(n!=1&& pomN < n - 1){
                stop++;
                start++;
            }
            if (pomN == n - 1) {
                if (pom[stop] != ' ') {
                    stop++;
                } else {
                    pomN++;

                }
            }
        }
        String nowe = zdanie.substring(start, stop);
        System.out.println("Nowe:+" + nowe + "+\n");
        return nowe;
    }
    public static int Gdzie = -1;

    public static boolean czyZawiera(String slowo) {
        boolean czy = false;
        for (int i = 0; i < Lista.size(); i++) {

            if (Lista.get(i).sufixx.contains(slowo)) {
                czy = true;
                Gdzie = i;
                break;
            } else {
                czy = false;
            }
        }
        if(czy)
        System.out.println("ZAWIERA\n");
        return czy;
    }

    public static String Generacja() {
        String Tekst = "";
        int numer;
        String stan = "";
        Random r = new Random();
        int zmienTemat = Math.abs(r.nextInt() % 10);
        // System.out.println("ZMIENTEMAT:" + zmienTemat + "\n");
        if (zmienTemat == 9) {
            stan = "Zmieńmy temat.\n";
            //wyjście.setText(stan);
            numer = Math.abs(r.nextInt()) % Lista.size();
            while (!Character.isUpperCase(Lista.get(numer).prefix.charAt(0))) {
                numer = Math.abs(r.nextInt()) % Lista.size();
            }
        } else if (zmienTemat == 8) {
            cosNapisal = wytnij(cosNapisal);

            //  System.out.println("COSNAPISAL:" + cosNapisal + "+\n");
            numer = znajdzPrefix(cosNapisal);
            cosNapisal = duzeZnaki(cosNapisal);
        } else {
            System.out.println("Wszedłem");
            int ile = ileSlow(cosNapisal);
            System.out.println("cosNapisal:" + cosNapisal + "+\n");
            System.out.println("ile slow:" + ile + "+\n");
            numer = Math.abs(r.nextInt()) % ile;
            while (numer == 0) {
                r = new Random();
                numer = Math.abs(r.nextInt()) % ile;
            }
            System.out.println("WYLOSOWALEM LICZBE:" + numer + "\n");
            String slowo = wytnijSlowo(cosNapisal, numer);

            while (!czyZawiera(slowo)) {
                while (numer == 0) {
                    r = new Random();
                    numer = Math.abs(r.nextInt()) % ile;
                }
                System.out.println("WYLOSOWALEM LICZBE:" + numer + "\n");
                slowo = wytnijSlowo(cosNapisal, numer);
            }
            numer = Gdzie;

        }
        String pom = Lista.get(numer).prefix;
        Tekst = pom;
        System.out.println("Wylosowano:" + pom + "+\n");
        String nowaPom = "";
        int pomNumer = numer;
        // System.out.println("POCZATEK:"+pom+"\n");
        while (!Tekst.contains(".") && !Tekst.contains("!") && !Tekst.contains("?")) {
            numer = Math.abs(r.nextInt()) % Lista.get(pomNumer).sufixx.size();
            r = new Random();
            //   System.out.println("Wylosowano numer:" + numer + "\n");
            nowaPom = pom;
            pom = Lista.get(pomNumer).sufixx.get(numer);
          //  System.out.println("Wylosowano sufix:" + pom + "+\n");

            // pomNumer = numer;
            Tekst = Tekst + " " + pom;

            nowaPom = nowyPodział(nowaPom);
            nowaPom = nowaPom + " " + pom;
            pomNumer = znajdzPrefix(nowaPom);
            pom = nowaPom;
            //  System.out.println("Nowy prefix:" + pom + "+\n");

        }
        // System.out.println("Wygenerowano:"+Tekst+"\n");
        // Tekst = Tekst + ".";
        Tekst = poprawTekstWejsciowy(Tekst);
        
        // Tekst=Tekst.substring(0, Tekst.length()-1);
        dodajDoStatystyk(Tekst);
        //see();
        setSlowo();
        //  System.out.println("WygenerowanoPozmianie:"+Tekst+"\n");
        stan = stan + Tekst;
        return stan;
    }

    public static int znajdzPrefix(String Prefix) {
        int gdzie = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).prefix.equals(Prefix)) {
                //  System.out.println("ZNALAZLEM"+"\n");
                gdzie = i;
                break;
            }
        }
        //  System.out.println("GDZIE:"+gdzie+"\n");
        return gdzie;
    }

    public static String nowyPodział(String Tab) {
        int licznik = 0;
        char tab[] = Tab.toCharArray();
        // System.out.println("Prefix przed:"+Tab+"\n");
        while (tab[licznik] != ' ') {
            licznik++;
        }
        licznik++;
        String nowy = "";
        for (int i = 0; i < tab.length - licznik; i++) {
            nowy = nowy + tab[licznik + i];
            // System.out.println("Nowy do podzialu:"+nowy[i]);
        }

        if (nowy.charAt(nowy.length() - 1) == ' ') {
            nowy = nowy.substring(0, nowy.length() - 1);
        }
        //System.out.println("Prefix po:"+nowy+"+"+"\n");
        return nowy;
    }
}
