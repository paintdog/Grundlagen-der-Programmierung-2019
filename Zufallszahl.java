/* 
 * Generierung einer Zufallszahl mittels Math.random()
 * 
 * Nicht Teil des Skrips, bezieht sich auf:
 * 1. Version des Skripts, 2019, S. 16-17
 * 
 */

public class Zufallszahl {
  
  public static void main (String[] args) {
    
    // Liefert eine Pseudozufallszahl z mit 0 <= z < 1
    double z = Math.random();
    System.out.println("Zufallszahl: " + z);
    
    // Zufallszahl zwischen 1 und 25
    int Min =  1;
    int Max = 25;
      
    z = Min + (int)(Math.random() * ((Max - Min) + 1));
      
    System.out.println("Zufallszahl: " + z);
    
    }  
}
