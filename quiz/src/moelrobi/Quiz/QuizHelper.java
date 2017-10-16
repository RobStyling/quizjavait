package moelrobi.Quiz;
import java.util.*;
/**
 * Helper Class for Quiz! :D
 * @version v.1.0
 * @author robin
 */
public class QuizHelper {
    
    public static int counter = 0;
    
    public static List<Frage> fragenListe = new ArrayList<>();
    /**
    * Main class.
    * @param args, for parsing Arguments
    */
    
    public static void main(String[] args) {
        //Showing the Frame
        Frame frame = new Frame();
        frame.setVisible(true);
        FragenHandler fragenHandler = new FragenHandler();
        System.out.println(fragenListe);
    }
    /**
    *@param Answer, for parsing an Answer
    *@return True
    */
    public static boolean CheckAnswer(String Answer) 
    {
        //Needed to Compile
        return false;
    }
    
    public static Frage GetFragen() 
    {
        if(counter >= fragenListe.size()) {
            rCounter();
        }
        return fragenListe.get(counter);
    }
    
    /**
    * @param Max, for Maxium Number
    * @param Min, for Minium Number
    * @return a random Number
    */
    public static double RNG(int Max, int Min) {
        double num;
        num = Math.floor(Math.random() * (Max - Min));
        return num;
    }
    
    public static void iCounter() {
        counter++;
    }
    
    public static void rCounter() {
        counter = 0;
    }
}
