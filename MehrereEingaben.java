import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Eingabedialog mit mehreren Eingabefeldern
 * 
 * 1. Version des Skripts, 2019, S. 28
 */

public class MehrereEingaben {
  
  public static void main (String[] args) {
    // Eingabefelder aufbauen:
    JTextField[] feld = {new JTextField(), new JTextField()};
    Object[] msg = {"Erster Text:", feld[0], "Zweiter Text:", feld[1]};
    // Dialogfenster anzeigen:
    int click = JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
    // Eingaben ausgeben:
    System.out.println("Du hast eingegeben: \"" + feld[0].getText() + ", " + feld[1].getText() + "\"");
    }
}
