/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moelrobi.Quiz;

import static moelrobi.Quiz.QuizHelper.fragenListe;

/**
 *
 * @author moelrobi
 */
class FragenHandler {
    
    public FragenHandler() {
        erzeugeTestFragen();
    }
    
    public void addFrage(Frage frage){
        fragenListe.add(frage);     
    }
    
    public void erzeugeTestFragen(){
        Frage f1= new Frage();
        f1.setFragennr(1);
        f1.setText("Debug");
        f1.setTitel("hsdjkfh");
        f1.addAntwort("ks");
        f1.setRichtigeAntwort(0);
            
        fragenListe.add(f1);
        
    } 
}
