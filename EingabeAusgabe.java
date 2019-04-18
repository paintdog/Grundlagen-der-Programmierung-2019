public class EingabeAusgabe {
  
  public static void main(String[] args) {
    
    // Eingabe
    System.out.print("Bitte geben Sie eine Gleitkommazahl ('0,0') ein: ");
    String eingabe = System.console().readLine();
    
    // Verarbeitung
    double gleitkommazahl = Double.parseDouble(eingabe.replace(",","."));
    
    // Ausgabe
    System.out.println("Ihre Eingabe war \"" + gleitkommazahl + "\".");    
         
  }
}
