/**
 * Calcula la nota necesaria en un examen para obtener la media deseada.
 */
public class S03Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quiere sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    // La nota final se calcula de esta forma:
    // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
    // Por tanto, despejando nota2 tenemos:
    // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.println("Para tener un " + notaFinal + " en el trimestre");
    System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
  }
}
