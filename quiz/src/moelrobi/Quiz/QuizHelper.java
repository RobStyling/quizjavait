package moelrobi.Quiz;

import java.util.ArrayList;

/**
 * Helper Class for Quiz! :D
 * @version v.1.0
 * @author robin
 */
public class QuizHelper {

    public static ArrayList<Fragen> fragenListe;
    /**
    * Main class.
    * @param args, for parsing Arguments
    */
    public static void main(String[] args) {
        //Showing the Frame
        Frame frame = new Frame();
        frame.setVisible(true);
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
    
    public static String[] GetForm() 
    {
        String[] errorArrayIndexOutOfBoundsFix = {"Error!"};
        return errorArrayIndexOutOfBoundsFix;
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
    
}
