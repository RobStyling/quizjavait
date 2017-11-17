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
        placeholder.setText("Du solltest das nicht sehen. Gratis Punkte für dich!");
        placeholder.addAntwort("Richtig!");
        placeholder.addAntwort("Falsch!");
        placeholder.addAntwort("Falsch2!");
        placeholder.addAntwort("Falsch3!");
        placeholder.setRichtigeAntwort(1);
        placeholder.setImageUrl("http://5.1.86.234/img/it_unkown.jpg");
        placeholder.setAuthor(null);
        
        Frage it_hauptstadt = new Frage();
        it_hauptstadt.setfrn(1);
        it_hauptstadt.setText("Was ist die Hauptstadt Italiens?");
        it_hauptstadt.addAntwort("Rom");
        it_hauptstadt.addAntwort("Mailand");
        it_hauptstadt.addAntwort("Turin");
        it_hauptstadt.addAntwort("Neapel");
        it_hauptstadt.setRichtigeAntwort(1);
        it_hauptstadt.setImageUrl("http://5.1.86.234/img/it_karte.png");
        it_hauptstadt.setAuthor("Rob");
        
        Frage it_vulkan = new Frage();
        it_vulkan.setfrn(2);
        it_vulkan.setText("Was ist der höchste Vulkan Europas?");
        it_vulkan.addAntwort("Narkondam");
        it_vulkan.addAntwort("Ätna");
        it_vulkan.addAntwort("Venus");
        it_vulkan.addAntwort("Eyjafjallajökull");
        it_vulkan.setRichtigeAntwort(2);
        it_vulkan.setImageUrl("http://5.1.86.234/img/it_vulkan.jpg");
        it_vulkan.setAuthor("Rob");
        
        Frage it_grosstadt = new Frage();
        it_grosstadt.setfrn(3);
        it_grosstadt.setText("Welche Stadt in Italien hat die meisten Einwohner?");
        it_grosstadt.addAntwort("Mailand");
        it_grosstadt.addAntwort("Venedig");
        it_grosstadt.addAntwort("Rom");
        it_grosstadt.addAntwort("Neapel");
        it_grosstadt.setRichtigeAntwort(1);
        it_grosstadt.setImageUrl("http://5.1.86.234/img/it_itstadt.jpg");
        it_grosstadt.setAuthor("Denise");
        
        Frage it_spagetti = new Frage();
        it_spagetti.setfrn(4);
        it_spagetti.setText("Wie viel Pasta isst der Durschnittsitaliener?");
        it_spagetti.addAntwort("26kg");
        it_spagetti.addAntwort("24kg");
        it_spagetti.addAntwort("20kg");
        it_spagetti.addAntwort("28kg");
        it_spagetti.setRichtigeAntwort(1);
        it_spagetti.setImageUrl("http://5.1.86.234/img/it_spag.jpeg");
        it_spagetti.setAuthor("Felix");
        
        Frage it_flaeche = new Frage();
        it_flaeche.setfrn(5);
        it_flaeche.setText("Wie groß ist die Fläche Italiens?");
        it_flaeche.addAntwort("300.000km²");
        it_flaeche.addAntwort("200.000km²");
        it_flaeche.addAntwort("400.000km²");
        it_flaeche.addAntwort("250.000km²");
        it_flaeche.setRichtigeAntwort(1);
        it_flaeche.setImageUrl("http://5.1.86.234/img/it_karte.png");
        it_flaeche.setAuthor("Lukas Oe");
        
        Frage it_gruendung = new Frage();
        it_gruendung.setfrn(6);
        it_gruendung.setText("Wann fand die Gründung Italliens Stadt?");
        it_gruendung.addAntwort("1861");
        it_gruendung.addAntwort("1912");
        it_gruendung.addAntwort("1823");
        it_gruendung.addAntwort("1760");
        it_gruendung.setRichtigeAntwort(1);
        it_gruendung.setImageUrl("http://5.1.86.234/img/it_flag.jpg");
        it_gruendung.setAuthor("Lukas Oe");
        
        Frage it_vorwahl = new Frage();
        it_vorwahl.setfrn(7);
        it_vorwahl.setText("Wie lautet die Vorwahl Italiens?");
        it_vorwahl.addAntwort("+39");
        it_vorwahl.addAntwort("+49");
        it_vorwahl.addAntwort("+1");
        it_vorwahl.addAntwort("+12");
        it_vorwahl.setRichtigeAntwort(1);
        it_vorwahl.setImageUrl("http://5.1.86.234/img/it_telefon.jpg");
        it_vorwahl.setAuthor("Denis");
        
        Frage it_sprache = new Frage();
        it_sprache.setfrn(8);
        it_sprache.setText("Welche Sprache Spricht man in Italien?");
        it_sprache.addAntwort("Italienisch");
        it_sprache.addAntwort("Französisch");
        it_sprache.addAntwort("Deutsch");
        it_sprache.addAntwort("Spanisch");
        it_sprache.setRichtigeAntwort(1);
        it_sprache.setImageUrl("http://5.1.86.234/img/it_sprechen.jpg");
        it_sprache.setAuthor("Denis");
        
        Frage it_wm = new Frage();
        it_wm.setfrn(9);
        it_wm.setText("Wie oft wurde Italien Weltmeister?");
        it_wm.addAntwort("Vier Mal");
        it_wm.addAntwort("Fünf Mal");
        it_wm.addAntwort("Neun Mal");
        it_wm.addAntwort("Jeff");
        it_wm.setRichtigeAntwort(1);
        it_wm.setImageUrl("http://5.1.86.234/img/it_ball.jpg");
        it_wm.setAuthor("Mattis");
        
        Frage it_ausbruch = new Frage();
        it_ausbruch.setfrn(10);
        it_ausbruch.setText("Wann brach der Ätna zuletzt aus?");
        it_ausbruch.addAntwort("2012");
        it_ausbruch.addAntwort("2013");
        it_ausbruch.addAntwort("2002");
        it_ausbruch.addAntwort("2008");
        it_ausbruch.setRichtigeAntwort(1);
        it_ausbruch.setImageUrl("http://5.1.86.234/img/it_vulkan.jpg");
        it_ausbruch.setAuthor("Denise");
        
        Frage it_mafia = new Frage();
        it_mafia.setfrn(11);
        it_mafia.setText("In welcher italienischen Region hat die Mafia ihre Wurzeln?");
        it_mafia.addAntwort("Sizilien");
        it_mafia.addAntwort("Toskana");
        it_mafia.addAntwort("Lombardei");
        it_mafia.addAntwort("Latium");
        it_mafia.setRichtigeAntwort(1);
        it_mafia.setImageUrl("http://5.1.86.234/img/it_mafia.jpg");
        it_mafia.setAuthor("Abdul und Emre");
        
        Frage it_wmdabei = new Frage();
        it_wmdabei.setfrn(11);
        it_wmdabei.setText("Ist Italien bei der WM dabei?");
        it_wmdabei.addAntwort("Ja");
        it_wmdabei.addAntwort("Nein");
        it_wmdabei.addAntwort("Placeholder");
        it_wmdabei.addAntwort("Same");
        it_wmdabei.setRichtigeAntwort(1);
        it_wmdabei.setImageUrl("http://5.1.86.234/img/it_ball.jpg");
        it_wmdabei.setAuthor("Rob");
        
        addFrage(placeholder);
        addFrage(it_hauptstadt);
        addFrage(it_vulkan);
        addFrage(it_grosstadt);
        addFrage(it_spagetti);
        addFrage(it_flaeche);
        addFrage(it_gruendung);
        addFrage(it_vorwahl);
        addFrage(it_sprache);
        addFrage(it_wm);
        addFrage(it_ausbruch);
        addFrage(it_mafia);
        addFrage(it_wmdabei);
    }
}

