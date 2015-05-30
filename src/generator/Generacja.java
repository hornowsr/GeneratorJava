/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import static generator.Okno.poprawTekstWejsciowy;
import static generator.Podział.Lista;
import static generator.Statystyka.dodajDoStatystyk;
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
        Okno okno=  new Okno(); 
        okno.setVisible(true);
    }
    public static String Generacja(){
        String Tekst = "";

        Random r = new Random();
        int numer = Math.abs(r.nextInt()) % Lista.size();
        while (!Character.isUpperCase(Lista.get(numer).prefix.charAt(0)) || Lista.get(numer).prefix.indexOf('.') != -1) {
            numer = Math.abs(r.nextInt()) % Lista.size();
        }
        String pom = Lista.get(numer).prefix;
        Tekst = pom;
        System.out.println("Wylosowano:"+pom+"\n");
        String nowaPom="";
        int pomNumer=numer;
        while(!Tekst.contains(".") && !Tekst.contains("!") && !Tekst.contains("?")){
            numer = Math.abs(r.nextInt()) % Lista.get(pomNumer).sufixx.size();
            nowaPom= pom;
            pom = Lista.get(pomNumer).sufixx.get(numer);
            System.out.println("Wylosowano sufix:"+pom+"\n");
            pomNumer = numer;
            Tekst = Tekst+" "+pom;
            nowaPom = nowyPodział(nowaPom);
            nowaPom = nowaPom +" "+ pom;
            pom = nowaPom;
            System.out.println("Nowy prefix:"+pom+"\n");
            
        }
        //System.out.println("Wygenerowano:"+Tekst+"\n");
       // Tekst = Tekst + ".";
        Tekst = poprawTekstWejsciowy(Tekst);
        Tekst=Tekst.substring(0, Tekst.length()-1);
        dodajDoStatystyk(Tekst);
        System.out.println("Wygenerowano:"+Tekst+"\n");
        return Tekst;
    }
    public static String nowyPodział(String Tab) {
        int licznik = 0;
        char tab [] = Tab.toCharArray();
        System.out.println("Prefix przed:"+Tab+"\n");
        while (tab[licznik] != ' ') {
            licznik++;
        }
        licznik++;
        String nowy="";
        for (int i = 0; i < tab.length - licznik; i++) {
            nowy =nowy + tab[licznik + i];
           // System.out.println("Nowy do podzialu:"+nowy[i]);
        }
        
        if(nowy.charAt(nowy.length()-1)==' ')
        nowy=nowy.substring(0, nowy.length()-1);
        System.out.println("Prefix po:"+nowy+"+"+"\n");
        return nowy;
    }
}
