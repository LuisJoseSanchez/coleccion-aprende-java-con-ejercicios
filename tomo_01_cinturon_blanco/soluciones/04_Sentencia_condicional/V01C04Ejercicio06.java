/**
 * Calcula el tiempo que tarda en caer un objeto.
 */
public class V01C04Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    final double g = 9.81; // las constantes se declaran con final
    double s = Math.sqrt(2 * h / g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
