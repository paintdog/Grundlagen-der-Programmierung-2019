import javax.swing.JOptionPane;

public class EingabenMitFenster {
  
  public static void main (String[] args) {
    
    String eingabe = JOptionPane.showInputDialog("Gib einen Text ein:");
    System.out.println("Du hast eingegeben: \"" + eingabe + "\".");
    
    }
}
