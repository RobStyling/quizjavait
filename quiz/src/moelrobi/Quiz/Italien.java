package moelrobi.Quiz;
/**
 * @version v.1.0
 * @author robin
 */
public class Italien {
    /*
        Declaring Variables
    */ 
    private static final String[] questions = {"Was ist die Hauptstadt von Rom?"};
    /**
    * Main class.
    * @param args, for parsing Arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(questions[0]);
        Frame frame = new Frame();
        frame.setVisible(true);
    }
    
    public static String CheckAnswer(String Answer) 
    {
        System.out.print(Answer);
        return null;
    }
}
