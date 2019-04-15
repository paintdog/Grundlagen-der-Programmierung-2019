import javax.swing.*;

/**
 * Addiert 2 einzugebende Integer-Zahlen.
 * 
 * 1. Version des Skripts, 2019, S. 29-30
 */
 

public class Addition {
  
  public static void main (String[] args) {
    
    int zahl1, zahl2,    // zu addierende Zahlen         // (1)
        summe;           // Summe von zahl1 und zahl2 
    String ausgabe;
    
    // Eingabefelder aufbauen:
    JTextField[] feld = {new JTextField(), new JTextField()};
    Object[] msg = {"Erste Zahl:", feld[0], "Zweite Zahl:", feld[1]};
    
    // Dialogfenster anzeigen:
    int click = JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
    
    // Konvertierung der Eingabe von String nach int:
    zahl1 = Integer.parseInt( feld[0].getText() );       // (2)
    zahl2 = Integer.parseInt( feld[1].getText() );
    
    // Addition der beiden Zahlen:
    summe = zahl1 + zahl2;                               // (3)
    
    // Ausgabe des Ergebnisses:
    ausgabe = "Die Summe ist " + summe;
    JOptionPane.showMessageDialog( null, ausgabe, "Ergebnis", JOptionPane.PLAIN_MESSAGE);
    }
}
