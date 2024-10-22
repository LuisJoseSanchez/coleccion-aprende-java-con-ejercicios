/**
 * Calcula los segundos que faltan para llegar a la medianoche.
 */
public class T01C04Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("A continuación deberá introducir una hora del día, ");
    System.out.println("primero introducirá la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    System.out.printf("Desde las %02d:%02d hasta la medianoche", hora, minuto);
    System.out.printf(" faltan %d segundos.\n", segundosHastaMedianoche);
  }
}
