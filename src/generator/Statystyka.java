/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.drugie;
import static generator.Okno.drugielicznik;
import static generator.Okno.pierwsze;
import static generator.Okno.pierwszelicznik;
import static generator.Okno.trzecie;
import static generator.Okno.trzecielicznik;
import java.util.ArrayList;

/**
 *
 * @author Rafał
 */
public class Statystyka {

    static ArrayList<String> Statystyka = new ArrayList<>();
    static ArrayList<Integer> licznik = new ArrayList<>();
    public static String maxSlowo;
    public static int maxLicznik;
    public static int midLicznik;
    public static int minLicznik;

    public static void see() {
        for (int i = 0; i < Statystyka.size(); i++) {
            System.out.println("i:" + i + " Staty:" + Statystyka.get(i) + "\n");
        }

    }

    public static void setSlowo() {
        maxLicznik = 0;
        midLicznik = 0;
        minLicznik = 0;

        int j = 0;
        int k = 0;
        int l = 0;

        for (int i = 0; i < Statystyka.size(); i++) {
            //  System.out.println("MAXLICZNIK:"+maxLicznik+" Licznik:"+licznik.get(i)+"\n");
            if (licznik.get(i) > maxLicznik) {
                maxLicznik = licznik.get(i);
                j = i;
            } else {
                if (licznik.get(i) > midLicznik) {
                    midLicznik = licznik.get(i);
                    k = i;
                } else {
                    if (licznik.get(i) > minLicznik) {
                        minLicznik = licznik.get(i);
                        l = i;
                    }
                }
            }
        }
        //  System.out.println("allal:" + Statystyka.get(2) + "licznik:"+licznik.get(2)+"\n");
        pierwsze.setText(Statystyka.get(j));
        pierwszelicznik.setText(Integer.toString(maxLicznik));
        drugie.setText(Statystyka.get(k));
        drugielicznik.setText(Integer.toString(midLicznik));
        trzecie.setText(Statystyka.get(l));
        trzecielicznik.setText(Integer.toString(minLicznik));
    }

    public static char[] usunZnaki(char[] tablica) {
        char[] nowatablica = new char[tablica.length];
        int j = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == '.' || tablica[i] == ',' || tablica[i] == '!' || tablica[i] == '?') {

            } else {
                nowatablica[j] = tablica[i];
              //  System.out.println("Usowanie znakow:"+nowatablica[j]);
                j++;
                
            }
        }
        
        return nowatablica;
    }

    public static void dodajDoStatystyk(String doPodziału) {
        char[] podział = new char[doPodziału.length()];
        podział = doPodziału.toCharArray();

        podział = usunZnaki(podział);
        String Słowo = new String();
       // for(int i=0;i<podział.length;i++)
      //  System.out.println("Pousunieciu:" + podział[i]);
//        Statystyka();
        int k = 0;
        for (int i = 0; i < podział.length ; i++) {

            if (i +1< podział.length && podział[i] != ' ') {
                Słowo = Słowo + podział[i];
                 
            } else {
              //  System.out.println("Staty:" + Słowo+"+");
                if (Statystyka.isEmpty()) {
                    Statystyka.add(Słowo);
                    licznik.add(1);
                    Słowo = "";
                  //  System.out.println("Piewsze slowo");
                    k++;
                } else {

                    int rozmiar = Statystyka.size();
                    int czywystapilo = 0;
                    //    System.out.println("Słowoprzed:"+Słowo+" Wielkosc:"+rozmiar+"\n");
                    for (int j = 0; j < rozmiar; j++) {
                        //  System.out.println("Słowo:"+j+Słowo+"\n"+"Slowo w statystyce:"+Statystyka.get(j)+"\n");
                        if (Statystyka.get(j).equals(Słowo)) {
                            licznik.set(j, licznik.get(j) + 1);
                            czywystapilo = 1;
                       //     System.out.println("zwiekszam licznik");
                        }
                    }
                    if (czywystapilo==0) {
                        
                        Statystyka.add(Słowo);
                        licznik.add(1);
                        //System.out.println("Dodano");
                        //System.out.println("staty:" + Statystyka.get(k) + "licznik:" + licznik.get(k));
                        k++;
                    }

                    Słowo = "";
                }
            }
        }
        setSlowo();
        // System.out.println("Wielkosc:"+Statystyka.size()+"\n");
    }

}
