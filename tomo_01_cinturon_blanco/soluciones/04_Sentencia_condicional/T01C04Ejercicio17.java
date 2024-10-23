/**
 * Da la última cifra de un número entero introducido por teclado.
 */
public class T01C04Ejercicio17 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.print("La última cifra del número introducido es el ");
    System.out.println(n % 10 + ".");
  }
}
