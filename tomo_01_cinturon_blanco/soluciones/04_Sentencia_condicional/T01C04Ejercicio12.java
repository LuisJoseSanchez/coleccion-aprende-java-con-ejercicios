/**
 * Cuestionario tipo test sobre las asignaturas del curso.
 */
public class T01C04Ejercicio12 {
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAM");
    
    System.out.print("1. ¿Cuál de los siguientes tipos de datos de Java");
    System.out.println(" tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.print("2. ¿Cuál es el lenguaje que se utiliza para hacer");
    System.out.println(" consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.print("3. Para insertar un hiperenlace en una página");
    System.out.println(" se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.print("4. ¿En qué directorio se encuentran los archivos");
    System.out.println(" de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
