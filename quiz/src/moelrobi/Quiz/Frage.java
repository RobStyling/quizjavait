/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moelrobi.Quiz;

/**
 *
 * @author moelrobi
 */
public class Frage {
    
    private int fnr;
    private String text;
    private int richtigeAntwort;
    private String imageUrl;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        if(this.imageUrl == null) {
            return System.getProperty("user.dir") + "/src/moelrobi/Quiz/res/unknown.png";
        }
        else return System.getProperty("user.dir") + "/src/moelrobi/Quiz/res/" + imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    private int iCounter = 0;
    
    public int getRichtigeAntwort() {
        return richtigeAntwort;
    }

    public void setRichtigeAntwort(int richtigeAntwort) {
         if(richtigeAntwort<5 & richtigeAntwort>=1){
            this.richtigeAntwort = richtigeAntwort;
        }
        
    }
    
    private void iiCounter() {
            iCounter++;
    }
    public String[] antworten = new String[5];
    
    public void addAntwort(String antwort){
        if(iCounter == 0) {
            antworten[iCounter] = null;
            iiCounter();
        }
        antworten[iCounter] = antwort;
        iiCounter();
    }
    
    public String getAntwort(int counter)  {
        if(counter == 0) throw new IllegalArgumentException("Bitte fange anfragen auf Antworten bei 1 an.");
        String antwort = antworten[counter];
        return antwort;
    }

    public int getfNr() {
        return fnr;
    }

    public String getText() {
        return text;
    }

    public String[] getAntworten() {
        return antworten;
    }

    public void setfrn(int Nr) {
        this.fnr = Nr;
    }

    public void setText(String text) {
        this.text = text;
    }
}
