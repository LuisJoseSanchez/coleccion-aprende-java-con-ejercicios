/**
 * Calcula el salario semanal de un trabajador.
 */
public class V01C04Ejercicio04 {
  public static void main(String[] args) {
    int sueldoSemanal;

    System.out.print("Por favor, introduzca ");
    System.out.println("el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.print("El sueldo semanal que le corresponde es de ");
    System.out.println(sueldoSemanal + " euros");
  }
}
