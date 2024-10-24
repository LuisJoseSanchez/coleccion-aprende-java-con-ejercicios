/**
 * Conversor de euros a pesetas.
 */
public class V01C03Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Por favor, ");
    System.out.print("introduzca la cantidad de euros que quiere convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
  }
}
