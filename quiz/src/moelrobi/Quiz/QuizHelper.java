package moelrobi.Quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
/**
 * Helper Class for Quiz! :D
 * @version v.1.0
 * @author robin
 */
public class QuizHelper {
    
    private static int counter = 0;
    
    public static List<Frage> fragenListe = new ArrayList<Frage>();
    private static boolean Check = false;
    
    private static String a1;
    private static String a2;
    private static String a3;
    private static String a4;
    
    private static final String url = "jdbc:mysql://5.1.86.234:3306/flbk_rob";
    private static final String user = "flbk_rob";
    private static final String password = "no u dont";
    
    public static int right = 0;
    public static int wrong = 0;
    
    public static int points = 0;
    
    /**
    * Main class.
    * @param args, for parsing Arguments
    */
    
    public static void main(String[] args) {
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        if(!Arrays.toString(args).equals("[]")) {
            if(Arrays.toString(args).equals("[--debug]")) {
                FragenHandler.erzeugeTestFragen();
            }
        }
        else FragenHandler.prodFragen();
        Frame frame = new Frame();
        frame.setVisible(true);
        System.out.println("Current Dir:" + System.getProperty("user.dir") + "/src/moelrobi/Quiz/res");
    }
    
    public static String GetFragen() 
    {
        if(counter >= fragenListe.size()) {
            rCounter();
        }
        return fragenListe.get(counter).getText();
    }
   
    public static String[] GetAntworten() {
        while(true) {
        a1 = fragenListe.get(counter).getAntwort(RNG(4,1));
        a2 = fragenListe.get(counter).getAntwort(RNG(4,1));
        a3 = fragenListe.get(counter).getAntwort(RNG(4,1));
        a4 = fragenListe.get(counter).getAntwort(RNG(4,1));
        Check = CheckA(a1,a2,a3,a4);
        
        if(Check == true) {
            break;
        }}
        
        String[] antworten;
        antworten = new String[4];
        antworten[0] = a1;
        antworten[1] = a2;
        antworten[2] = a3;
        antworten[3] = a4;
        
        return antworten;
    }
    
    private static boolean CheckA(String a1, String a2, String a3, String a4) {
        if(a1.equals(a2) || a1.equals(a3) || a1.equals(a4)) {
            return false;
        }
        else if(a2.equals(a3) || a2.equals(a4)){
            return false;
        }
        else if(a3.equals(a4)) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static boolean CheckAnswer(String a) {
        int raint = fragenListe.get(counter).getRichtigeAntwort();
        String ra = fragenListe.get(counter).getAntwort(raint);
        if(ra.equals(a)) {
            right++;
            points = points + 2;
            return true;
        }
        else {
            wrong++;
            points = points + 1;
            return false;
        }
    }
    
    public static String GetImage() {
        return fragenListe.get(counter).getImageUrl();
    }
    
    public static String GetAuthor() {
        return fragenListe.get(counter).getAuthor();
    }
    /**
    * @param Max, for Maximum Number
    * @param Min, for Minium Number
    * @return a random Number
    */
    public static int RNG(int Max, int Min) {
        int num;
        num = (int) Math.floor(Math.random() * (Max - Min + 1)) + Min;
        return num;
    }
    
    public static void iCounter() {
        counter++;
    }
    
    private static void rCounter() {
        counter = 0;
    }
}
