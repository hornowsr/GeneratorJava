/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.cosNapisal;
import static generator.Okno.duzeZnaki;
import static generator.Okno.poprawTekstWejsciowy;
import static generator.Podział.Lista;
import static generator.Statystyka.dodajDoStatystyk;
import static generator.Statystyka.see;
import static generator.Statystyka.setSlowo;
import java.util.Random;

/**
 *
 * @author Rafał
 */
public class Generacja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Okno okno = new Okno();
        okno.setVisible(true);
    }

    public static String wytnij(String S) {
        int kiedy = 0;
        int start = 0;
        int j = 0;
       // System.out.println("[rzedWYCIALEM:"+S+"\n");
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
        S = S.substring(start, j-1);
      //  System.out.println("WYCIALEM:"+S+"\n");
        return S;

    }

    public static String Generacja() {
        String Tekst = "";
        int numer;
        Random r = new Random();
        int zmienTemat = Math.abs(r.nextInt() % 2);
      //  System.out.println("ZMIENTEMAT:" + zmienTemat + "\n");
        if (zmienTemat == 1) {
            numer = Math.abs(r.nextInt()) % Lista.size();
            while (!Character.isUpperCase(Lista.get(numer).prefix.charAt(0))) {
                numer = Math.abs(r.nextInt()) % Lista.size();
            }
        } else {
            cosNapisal = wytnij(cosNapisal);
            cosNapisal = duzeZnaki(cosNapisal);
            System.out.println("COSNAPISAL:" + cosNapisal + "+\n");
            numer = znajdzPrefix(cosNapisal);
        }
        String pom = Lista.get(numer).prefix;
        Tekst = pom;
        //System.out.println("Wylosowano:" + pom + "+\n");
        String nowaPom = "";
        int pomNumer = numer;
        // System.out.println("POCZATEK:"+pom+"\n");
        while (!Tekst.contains(".") && !Tekst.contains("!") && !Tekst.contains("?")) {
            numer = Math.abs(r.nextInt()) % Lista.get(pomNumer).sufixx.size();
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
        return Tekst;
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
