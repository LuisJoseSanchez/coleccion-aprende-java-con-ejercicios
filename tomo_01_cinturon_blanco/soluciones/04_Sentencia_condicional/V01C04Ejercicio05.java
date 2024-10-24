/**
 * Resuelve una ecuación de primer grado.
 */
public class V01C04Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Este programa resuelve ecuaciones ");
    System.out.println("de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
