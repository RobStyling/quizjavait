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
    
    public static void addFrage(Frage frage){
        fragenListe.add(frage);     
    }
    
    public static void erzeugeTestFragen(){
        Frage f1= new Frage();
        f1.setfrn(1);
        f1.setText("Debug");
        f1.addAntwort("Debuging1");
        f1.addAntwort("Debug2");
        f1.addAntwort("Debug3");
        f1.addAntwort("Debug4");
        f1.setRichtigeAntwort(1);
        
        Frage f2 = new Frage();
        f2.setfrn(2);
        f2.setText("WOOOH!");
        f2.addAntwort("yes");
        f2.addAntwort("ilikeit");
        f2.addAntwort("doutoo?");
        f2.addAntwort("I have a Time limit");
        f2.setRichtigeAntwort(3);
            
        addFrage(f1);
        addFrage(f2);
    } 
}
