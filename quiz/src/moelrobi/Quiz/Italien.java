package moelrobi.Quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @version v.1.0
 * @author robin
 */
public class Italien {
    /*
        Declaring Variables
    */ 
    private static JFrame frame;
     private static JLabel label1;
     
    /**
     * Method for init. the Components for JFrame
     * @param title, needed for Displaying a Title
     * @return a  JFrame
     */    
     public static JFrame initComp(String title) {
            frame = new JFrame(title);
            frame.setSize(200, 200);
            frame.setVisible(true);
            return frame;
        } 
     /**
      * Loading Labels
      */
     public static void Labels() 
     {
            label1 = new javax.swing.JLabel("Hello");
             JButton butt1 = new JButton("ok");
             frame.add(butt1);
     }
    
      /**
       * Main class.
        * @param args, for parsing Arguments
        */
    public static void main(String[] args) {
        // TODO code application logic here
        initComp("Testing");
        Labels();
    }
}
