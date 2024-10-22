/**
 * 3. Lectura de datos desde teclado
 *
 * 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas
 *    que se quiere convertir debe ser introducida por teclado.
 *
 * @author Luis José Sánchez
 */
public class T01C03Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Por favor, ");
    System.out.print("introduzca la cantidad de pesetas a convertir: ");
    int pesetas = Integer.parseInt(System.console().readLine());

    double euros = pesetas / 166.386;

    System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
  }
}
