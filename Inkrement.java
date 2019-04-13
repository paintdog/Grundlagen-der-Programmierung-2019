import javax.swing.JOptionPane;

/** Unterschied pr�inkrement - postinkrement
 *
 *  1. Version des Skripts, 2019, S. 25
 */

public class Inkrement {
  
  public static void main (String[] args) {
    
    int c;
    String ausgabe = "";
    
    // postinkrement
    c = 5;
    ausgabe += c + ", ";
    ausgabe += c++ + ", ";
    ausgabe += c + ", ";
    
    // pr�inkrement
    c = 5;
    ausgabe += c + ", ";
    ausgabe += ++c + ", ";
    ausgabe += c;
    
    // Ausgabe des Ergebnisses:
    JOptionPane.showMessageDialog(
        null, ausgabe, "pr�- und postinkrement",
        JOptionPane.PLAIN_MESSAGE
    );
   }  
}
