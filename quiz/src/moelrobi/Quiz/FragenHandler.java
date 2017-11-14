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
        f1.setImageUrl(null);
        
        
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
    public static void prodFragen() 
    {
        Frage placeholder = new Frage();
        placeholder.setfrn(0);
        placeholder.setText("Du solltest das nicht sehen.");
        placeholder.addAntwort("Richtig!");
        placeholder.addAntwort("Falsch!");
        placeholder.addAntwort("Falsch!");
        placeholder.addAntwort("Falsch!");
        placeholder.setRichtigeAntwort(1);
        placeholder.setImageUrl(null);
        placeholder.setAuthor(null);
        
        Frage it_hauptstadt = new Frage();
        it_hauptstadt.setfrn(1);
        it_hauptstadt.setText("Was ist die Hauptstadt Italiens?");
        it_hauptstadt.addAntwort("Rom");
        it_hauptstadt.addAntwort("Mailand");
        it_hauptstadt.addAntwort("Turin");
        it_hauptstadt.addAntwort("Neapel");
        it_hauptstadt.setRichtigeAntwort(1);
        it_hauptstadt.setImageUrl("it_umriss.png");
        it_hauptstadt.setAuthor("Rob");
        
        Frage it_vulkan = new Frage();
        it_vulkan.setfrn(2);
        it_vulkan.setText("Was ist der höchste Vulkan Europas?");
        it_vulkan.addAntwort("Narkondam");
        it_vulkan.addAntwort("Ätna");
        it_vulkan.addAntwort("Venus");
        it_vulkan.addAntwort("Eyjafjallajökull");
        it_vulkan.setRichtigeAntwort(2);
        it_vulkan.setImageUrl("it_vulkan.png");
        it_vulkan.setAuthor("Rob");
        
        Frage it_grosstadt = new Frage();
        it_grosstadt.setfrn(3);
        it_grosstadt.setText("Welche Stadt in Italien hat die meisten Einwohner?");
        it_grosstadt.addAntwort("Mailand");
        it_grosstadt.addAntwort("Venedig");
        it_grosstadt.addAntwort("Rom");
        it_grosstadt.addAntwort("Neapel");
        it_grosstadt.setRichtigeAntwort(1);
        it_grosstadt.setImageUrl("it_itstadt.jpg");
        it_grosstadt.setAuthor("Denise");
        
        addFrage(it_hauptstadt);
        addFrage(it_vulkan);
        addFrage(it_grosstadt);
    }
}
