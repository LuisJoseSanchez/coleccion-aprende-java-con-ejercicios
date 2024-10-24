/**
 * Dice si un número (de hasta 5 cifras) es capicúa.
 */
public class V01C04Ejercicio20 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero");
    System.out.print(" (5 cifras como máximo): ");
    int n = Integer.parseInt(System.console().readLine());

    boolean capicua = false;
    int dig1;
    int dig2;
    int dig3;
    int dig4;
    int dig5;

    // número de una cifra
    if (n < 10) {
      capicua = true;
    }

    // número de dos cifras
    if ((n >= 10) && (n < 100)) {
      dig1 = n / 10;
      dig2 = n % 10;
      if (dig1 == dig2) {
        capicua = true;
      }
    }

    // número de tres cifras
    if ((n >= 100) && (n < 1000)) {
      dig1 = n / 100;
      dig3 = n % 10;
      if (dig1 == dig3) {
        capicua = true;
      }
    }

    // número de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      dig1 = n / 1000;
      dig2 = (n / 100) % 10;
      dig3 = (n / 10) % 10;
      dig4 = n % 10;
      if ((dig1 == dig4) && (dig2 == dig3)) {
        capicua = true;
      }
    }

    // número de cinco cifras
    if (n >= 10000) {
      dig1 = n / 10000;
      dig2 = (n / 1000) % 10;
      dig4 = (n / 10) % 10;
      dig5 = n % 10;
      if ((dig1 == dig5) && (dig2 == dig4)) {
        capicua = true;
      }
    }

    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}
