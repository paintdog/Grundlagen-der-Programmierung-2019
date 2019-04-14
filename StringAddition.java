import javax.swing.*;                                          // (1)

/**
 * Adiert 2 einzugebende Strings
 * 
 * 1. Version des Skripts, 2019, S. 28
 */

public class StringAddition {
  
  public static void main (String... args) {
    
    // Eingabefelder aufbauen:
    JTextField[] feld = {new JTextField(), new JTextField()}; // (2)
    Object[] msg = {"Erster Text:", feld[0], "Zweiter Text:", feld[1]};
    // Dialogfenster anzeigen:
    int click = JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
    
    // Konkatenation der eingegebenen Texte:
    String ausgabe = feld[0].getText() + feld[1].getText();   // (3) 
    
    // Ausgabe des konkatenierten Textes:
    JOptionPane.showMessageDialog(
        null, ausgabe, "Ergebnis", JOptionPane.PLAIN_MESSAGE  // (4)
    );
    
    } 
}
