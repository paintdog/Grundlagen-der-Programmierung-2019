/** Eingaben über die Konsole
 *
 *  1. Version des Skripts, 2019, S. 26
 */

public class ErsteEingaben {
  
  public static void main (String[] args) {
    
    System.out.println("Gib einen Text ein: ");
    String text = System.console().readLine();
    System.out.println("Du hast eingegeben: \"" + text + "\"");
    
    }
  
}
