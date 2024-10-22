/**
 * Dice qué asignatura toca a primera hora de un día de la semana determinado.
 */
public class T01C04Ejercicio01 {
  public static void main(String[] args) {
    String dia;

    System.out.println("Por favor, introduzca un día de la semana y le diré");
    System.out.print("qué asignatura toca a primera hora ese día: ");
    dia = System.console().readLine(); 
    dia = dia.toLowerCase(); // convierte a minúsculas todas las letras
    
    switch(dia) {
      case "lunes":
        // continúa debajo
      case "martes":
        // continúa debajo
      case "miercoles":
        // continúa debajo
      case "miércoles":
        System.out.println("Programación");
        break;
      case "jueves":
        System.out.println("Sistemas Informáticos");
        break;
      case "viernes":
        System.out.println("Bases de Datos");
        break;
      case "sabado":
        // continúa debajo
      case "sábado":
        // continúa debajo
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}
