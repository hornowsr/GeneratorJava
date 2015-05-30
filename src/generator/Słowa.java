
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import java.util.ArrayList;

/**
 *
 * @author Rafał
 */
public class Słowa {

     ArrayList<String> sufixx;
     String prefix;
    
    public Słowa(String prefix , String suf){
    sufixx = new ArrayList(); 
    sufixx.add(suf);
   this.prefix = prefix;
    }
   
  public void dodajSufiks (String sufiks){
        this.sufixx.add(sufiks);
    }
}
