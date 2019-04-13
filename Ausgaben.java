import javax.swing.*;

/**
 * Ausgaben
 * 
 * 1. Version des Skripts, 2019, S. 16-17
 */
 
 public class Ausgaben {
  
  public static void main(String[] args) {
    
    // Ausgabe im Konsolenfenster
    System.out.print("Dies ist eine ");
    System.out.println("Ausgabe mit " + (4 + 3) + " Wörtern.");
    /* ACHTUNG: Die print-Befehle können auf der Konsole nur 
     * ASCII-Zeichen ausgeben und keine Umlaute oder Sonderzeichen!
     */
    
    // Ausgabe in einem Fenster
    JOptionPane.showMessageDialog(
        null, "Dies ist eine Ausgabe \nmit " + 7 + " Wörtern."
    );    
    
    }  
 }
