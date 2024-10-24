/**
 * Da la primera cifra de un número entero introducido por teclado.
 */
public class V01C04Ejercicio18 {
  public static void main(String[] args) {
    int n, primera = 0;

    System.out.print("Por favor, introduzca un número entero positivo");
    System.out.print(" (5 cifras como máximo): ");
    n = Integer.parseInt(System.console().readLine());

    if ( n < 10 ) {
      primera = n;
    }

    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
    }

    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
    }

    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
    }

    if ( n >= 10000 ) {
      primera = n / 10000;
    }

    System.out.print("La primera cifra del número introducido es el ");
    System.out.println(primera + ".");
  }
}
