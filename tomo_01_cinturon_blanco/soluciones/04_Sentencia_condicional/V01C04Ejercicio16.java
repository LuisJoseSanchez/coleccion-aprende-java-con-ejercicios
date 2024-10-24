/**
 * Test de fidelidad.
 */
public class V01C04Ejercicio16 {
  public static void main(String[] args) {
    String respuesta;
    int puntos = 0;
    
    System.out.println("TEST DE FIDELIDAD");
    System.out.print("Este programa te dirá si hay probabilidad de que tu ");
    System.out.println(" pareja está siendo infiel.\n");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal");
    System.out.println(" sin ningún motivo aparente.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia ");
    System.out.print("(si es hombre) o ahora se arregla el pelo y se asea ");
    System.out.println("con más frecuencia (si es mujer)");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar");
    System.out.println(" cuando estás tú delante.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("7. Últimamente se preocupa más en cuidar la línea");
    System.out.println(" y/o estar bronceado/a.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque");
    System.out.println(" dice tener mucho más trabajo.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios ");
    System.out.println("donde no ha ido contigo.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    // Muestra el resultado del test
    
    if ( puntos <= 10 ) {
      System.out.println("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("\nQuizás exista el peligro de otra persona en su");
      System.out.print(" vida o en su mente, aunque seguramente será algo");
      System.out.println(" sin importancia. No bajes la guardia.");
    }
    
    if ( puntos >= 22 ) {
      System.out.print("\nTu pareja tiene todos los ingredientes para estar");
      System.out.print(" viviendo un romance con otra persona. Te aconsejamos");
      System.out.print(" que indagues un poco más y averigües qué es lo que");
      System.out.println(" está pasando por su cabeza.");
    }
  }
}
