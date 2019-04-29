import javax.swing.*;

/** bestimmt, ob ein Test bei eingegebener Note bestanden ist.
 */

public class Testergebnis {

  public static void main(String[] args) {
    
    double note;
    String ausgabe;
    
    // Eingabeblock:
    JTextField[] feld = { new JTextField() };
    Object[] msg = {"Geben Sie die Note ein (1, ..., 6):", feld[0]};
    int click = JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
    
    // Eingabe vom Typ String nach int konvertieren:
    note = Double.parseDouble( feld[0].getText() );    // (1)
    
    // Ergebnis bestimmen:
    if (note <= 4) {
      ausgabe = "Bestanden";
    } else {
      ausgabe = "Durchgefallen";
    }
    
    JOptionPane.showMessageDialog(null, ausgabe);
  }

  }
