import javax.swing.*;

/**
 * Benutzt if-Anweisungen und Vergleichsoperatoren
 */
 
public class Vergleich {
  
  
  public static void main (String[] args) {
    
    String eingabe1, eingabe2; // Eingabestrings
    int zahl1, zahl2;          // zu vergleichende Zahlen
    String ausgabe = "";
    
    // Eingabebock:
    JTextField[] feld = {new JTextField(), new JTextField()};
    Object[] msg = {"Geben Sie zwei Zahlen ein:", feld[0], feld[1]};
    int click = JOptionPane.showConfirmDialog(null, msg, "Eingabe", 2);
    
    // Speichern der Zahlen als String;
    eingabe1 = feld[0].getText();
    eingabe2 = feld[1].getText();
    // Konvertierung der Eingabe von String nach int:
    zahl1 = Integer.parseInt( eingabe1 );
    zahl2 = Integer.parseInt( eingabe2 );
    
    // Bestimmung des Ausgabestrings durch Vergleiche:
    if ( zahl1 == zahl2 ) {
         ausgabe += zahl1 + " == " + zahl2;                   // (2) 
    }  

    if ( zahl1 != zahl2 ) {
         ausgabe += "\n" + zahl1 + " != " + zahl2;
    }  
    
    if ( zahl1 < zahl2 ) {
         ausgabe += "\n" + zahl1 + " < " + zahl2;
    }  

    if ( zahl1 > zahl2 ) {
         ausgabe += "\n" + zahl1 + " > " + zahl2;
    }  

    if ( zahl1 <= zahl2 ) {
         ausgabe += "\n" + zahl1 + " <= " + zahl2;
    }  
    
    if ( zahl1 >= zahl2 ) {
         ausgabe += "\n" + zahl1 + " >= " + zahl2;
    }  
    
    if ( eingabe1.equals(eingabe2) ){
       ausgabe += "\n" + eingabe1 + " ist gleich " + eingabe2; // 3 
    }
    
    if ( !eingabe1.equals(eingabe2) ){
       ausgabe += "\n" + eingabe1 + " ist nicht gleich " + eingabe2; // 3 
    }    
    
    // Ausgabe des Ergebnisses:
    JOptionPane.showMessageDialog( null, ausgabe, "Vergleichsergebnisse", JOptionPane.PLAIN_MESSAGE);
  }
}  
