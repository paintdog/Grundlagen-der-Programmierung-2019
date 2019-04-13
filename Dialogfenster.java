import javax.swing.JOptionPane;

/**
 * Dialogfenster mit anderen Icons
 * 
 * 1. Version des Skripts, 2019, S. 15
 */

public class Dialogfenster {
  
  public static void main (String[] args) {
    
    // Medung ohne Icon (-1)
    JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!", "Titel", JOptionPane.PLAIN_MESSAGE);
    
    // Felermeldung (0)
    JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!", "Titel", JOptionPane.ERROR_MESSAGE);
    
    // informative Meldung (1)
    JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!", "Titel", JOptionPane.INFORMATION_MESSAGE);
    
    // Warnmeldung (2)
    JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!", "Titel", JOptionPane.WARNING_MESSAGE);
    
    // Frgemeldung (3)
    JOptionPane.showMessageDialog(null, "Willkommen zur\nJava Programmierung!", "Titel", JOptionPane.QUESTION_MESSAGE);
        
    }  
}
