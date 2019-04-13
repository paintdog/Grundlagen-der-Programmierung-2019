import javax.swing.JOptionPane;

/**
 * Führt verschiedene arithmetische Operationen durch
 * 
 * 1. Version des Skripts, 2019, S. 19
 * 
 */
 
public class Arithmetik {
  
  public static void main(String... args) {
    
    int m, n, k;      // ganze Zahlen
    double x, y, z;   // 'reelle' Zahlen
    String ausgabe = "";
    // diverse arithmetische Operationen:
    k = - 2 + 6 * 4;
    x = 14 / 4; y = 14 / 4.0; z = (double) 14 / 4;
    n = 14 / 4; m = 14 % 4;
    // Ausgabestring bestimmen:
    ausgabe = "k = " + k;
    ausgabe = ausgabe + "\nx = " + x + ", y = " + y + ", z = " + z;
    ausgabe = ausgabe + "\nn = " + n + ", m = " + m;
    JOptionPane.showMessageDialog(
        null, ausgabe, "Ergebnis", JOptionPane.PLAIN_MESSAGE
    );
    
    }  
}
