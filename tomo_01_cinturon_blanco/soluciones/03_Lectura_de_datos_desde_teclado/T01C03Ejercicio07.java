/**
 * Calcula el total de una factura.
 */
public class T01C03Ejercicio07 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
    System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));
    System.out.printf("-------------------------\n");
    System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));
  }
}
