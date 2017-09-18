package moelrobi.Quiz;
/**
 * Helper Class for Quiz! :D
 * @version v.1.0
 * @author robin
 */
public class QuizHelper {
    /**
    *Declaring Variables
    */ 
    private static int counter = 0;
    private static final String[] correct_answers = {"Rom", "lmao"};
    private static final String[] questions = {"Was ist die Hauptstadt von Rom?", "Second Test"};
    /**
    * Main class.
    * @param args, for parsing Arguments
    */
    public static void main(String[] args) {
        //Showing the Frame
        Frame frame = new Frame();
        frame.setVisible(true);
    }
    /**
    *@param Answer, for parsing an Answer
    *@return True
    */
    public static boolean CheckAnswer(String Answer) 
    {
        for(String lol: correct_answers) {
        if(Answer == null) {
         return false;   
        } else if (Answer.equals(lol)) {
         return true;
        }
        }
        //Needed to Compile
        return false;
    }
    
    public static String[] GetForm() 
    {
        if(counter != 2) {
            String[] array = {questions[counter], correct_answers[counter]};
            return array;
        }
        return null;
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
    
    public static void IncreaseCounter() 
    {
        counter++;
    }
}
