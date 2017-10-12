/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moelrobi.Quiz;

import java.util.ArrayList;

/**
 *
 * @author moelrobi
 */
final class Fragen {
    
    public ArrayList<String> fragen = new ArrayList();
    public Fragen() 
    {
        addFrage("debug");
    }
    public void addFrage(String frage) 
    {
        this.fragen.add(frage);
    }
}
