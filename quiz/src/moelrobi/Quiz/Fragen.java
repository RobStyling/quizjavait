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
    public Fragen() {
        addFrage("Eine Example Frage");
        addFrage("Noch eine Example Frage!");
    }
    //Arrays starts at 0! Remember that Pablo!
    //Die unteren Funktionen fügen oder entferenen Fragen.
    public void addFrage(String frage) {
        this.fragen.add(frage);
    }
    public void delFrage(int id){
        this.fragen.remove(id);
    }
}
