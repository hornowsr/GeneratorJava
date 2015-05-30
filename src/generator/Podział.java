/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.wezZdanie;
import static generator.Podział.doPodziału;
import static generator.Statystyka.dodajDoStatystyk;
import static generator.Statystyka.see;
import java.util.ArrayList;

/**
 *
 * @author Rafał
 */
public class Podział {

    public static char[] podział;
    public static String gotowe;
    static String sufix;
    public static ArrayList<Słowa> Lista = new ArrayList();
    //static Słowa dodaj;
    static int j = 0;
    static int n = 0;
    static int ileRazy = 0;
    public static String doPodziału = null;

    public static void wyswietl() {
        for (int i = 0; i < Lista.size(); i++) {
            System.out.println("\n" + "ile:" + i + Lista.get(i).prefix + "sufix:" + Lista.get(i).sufixx);
        }
    }

    public static int kiedyPrefix(char[] dop) {
        //Inicjalizuj();
        j = 0;
        n = 0;
        ileRazy = 0;
        while (n != 2) {
            if (dop[j] == ' ') {

                n++;
            }
            ileRazy++;
            j++;
        }
        return ileRazy;
    }

    public static char[] nowyDoPodziału(char[] tab) {
        int licznik = 0;
        while (tab[licznik] != ' ') {
            licznik++;
        }
        licznik++;
        char[] nowy = new char[tab.length - licznik ];
        for (int i = 0; i < tab.length - licznik; i++) {
            nowy[i] = tab[licznik + i];
           // System.out.println("Nowy do podzialu:"+nowy[i]);
        }

        return nowy;
    }
    public static int dlugosc;
    public static int ile, ile2;

    public static void dodajDane(String zdanie) {
        doPodziału = zdanie;
     //   System.out.println("Zdanie:"+doPodziału+"+"+"\n");
        if(doPodziału!=""||doPodziału!="\n"){
            
        
        podział = doPodziału.toCharArray();
        dlugosc = ileWyrazow(doPodziału);
      //  dodajDoStatystyk(doPodziału);
        for (int k = 0; k < dlugosc - 2; k++) {
            gotowe = "";
            //   Słowa dodaj = new Słowa();
            sufix = "";
            ile = kiedyPrefix(podział);
            // System.out.println("Ile:"+ile);
            ile2 = ile;
            for (int i = 0; i < ile-1; i++) {
                gotowe = gotowe + podział[i];
            }
            while (ile2 < podział.length  && podział[ile2] != ' ') {
                sufix = sufix + podział[ile2];
                ile2++;
            }
            podział = nowyDoPodziału(podział);
            //   dodajPrefixDoListy(gotowe, dodaj);
            // dodaj.setPrefix(gotowe );
            // dodaj.setSufix(sufix);
            int czyJest = -1;
            //int rozmiar = Lista.size();

            for (int i = 0; i < Lista.size(); i++) {
               // System.out.println("Co tam jest:"+Lista.get(i).prefix+"\n");
                if (gotowe.equals(Lista.get(i).prefix)) {
                    czyJest = i;
                    break;
                } else {
                    ;
                }
            }
           // System.out.println("czyJest:"+czyJest+"\n");
            if (czyJest >= 0) {
                Lista.get(czyJest).dodajSufiks(sufix);
            } else {
                Lista.add(new Słowa(gotowe, sufix));
            }
               // System.out.println("Podział:" + gotowe + " sufix:" + sufix + "\n");

           // dodajSufixDoListy(sufix, dodaj);
            // System.out.println("podział:" + gotowe + "sufix:" + sufix + "\n");
            //System.out.println("dodajpre:"+dodaj.prefix+" dodajsuf:"+dodaj.sufix+"\n");
            
            // System.out.println("\n" + "ile:" + k + " " + Lista.get(k).prefix + "sufix:"+ Lista.get(k).sufix);
        }
        }
        //wyswietl();
        //see();
        //System.out.println(Lista.get(0).prefix + "sufix:" + Lista.get(0).sufix);
    }

    public static int ileWyrazow(String doPodziału) {
        podział = new char[doPodziału.length()];
        podział = doPodziału.toCharArray();
        int dlugoscX = 0;
        for (int i = 0; i < doPodziału.length(); i++) {
            if (podział[i] == ' ') {
                dlugoscX++;
            }
        }
        return dlugoscX + 1;
    }

}
