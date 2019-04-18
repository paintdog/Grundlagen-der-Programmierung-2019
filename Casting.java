
public class Casting {
  
  public static void main(String[] args){
    
    int zahl = 23;
    double gleitkommazahl = zahl;
    
    double gleitkommazahl2 = 17.5;
    int zahl2 = (int) gleitkommazahl2;
    
    System.out.println(zahl2);          // 17
    
    double gleitkommazahl3 = 17.99;
    int zahl3 = (int) gleitkommazahl3;
    
    System.out.println(zahl3);          // 17
    
  }
}
