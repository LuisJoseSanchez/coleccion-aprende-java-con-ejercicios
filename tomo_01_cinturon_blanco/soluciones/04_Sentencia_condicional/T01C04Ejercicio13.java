/**
 * Ordena tres números enteros introducidos por teclado.
 */
public class T01C04Ejercicio13 {
  public static void main(String[] args) {
    int aux;
        
    System.out.print("Este programa ordena tres números introducidos por");
    System.out.print(" teclado.\nPor favor, vaya introduciendo los tres");
    System.out.println(" números y pulsando INTRO:");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.print("Los números introducidos ordenados de menor a mayor son "); 
    System.out.println(a + ", " + b + " y " + c + "."); 
  }
}
