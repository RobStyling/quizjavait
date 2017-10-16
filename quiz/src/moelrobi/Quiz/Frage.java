/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moelrobi.Quiz;
import java.util.*;

/**
 *
 * @author moelrobi
 */
public class Frage {
    
    private int Fragennr;
    private String titel;
    private String text;
    private int zaehler=0;
    private int richtigeAntwort;

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
     this.zaehler = zaehler;
    }

    public int getRichtigeAntwort() {
        return richtigeAntwort;
    }

    public void setRichtigeAntwort(int richtigeAntwort) {
         if(richtigeAntwort<4 & richtigeAntwort>=0){
            this.richtigeAntwort = richtigeAntwort;
        }
        
    }
    private String antworten[]= new String[4];
    
    public void addAntwort(String antwort){
        zaehler = zaehler+1;
        antworten[zaehler]=antwort;
    }

    public int getFragennr() {
        return Fragennr;
    }

    public String getText() {
        return text;
    }

    public String[] getAntworten() {
        return antworten;
    }

    public void setFragennr(int Fragennr) {
        this.Fragennr = Fragennr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAntworten(String[] antworten) {
        this.antworten = antworten;
    }
    
    
    
    
}
