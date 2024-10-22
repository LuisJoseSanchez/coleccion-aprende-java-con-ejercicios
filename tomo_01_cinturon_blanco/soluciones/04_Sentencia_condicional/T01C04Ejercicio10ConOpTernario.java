/**
 * Da el horóscopo a partir del día y el mes de nacimiento.
 */
public class T01C04Ejercicio10ConOpTernario {
  public static void main(String[] args) {
    String horoscopo = "";

    System.out.println("Este programa le dirá cuál es su horóscopo a partir de su fecha de nacimiento.");
    System.out.print("Introduzca el número del mes en que nació (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca el día: ");
    int dia = Integer.parseInt(System.console().readLine());
  
    switch(mes) {
      case 1:
        horoscopo = dia < 21 ? "capricornio" : "acuario";
        break;
      case 2:
        horoscopo = dia < 20 ? "acuario" : "piscis";
        break;
      case 3:
        horoscopo = dia < 21 ? "piscis" : "aries";
        break;
      case 4:
        horoscopo = dia < 21 ? "aries" : "tauro";
        break;
      case 5:
        horoscopo = dia < 20 ? "tauro" : "géminis";
        break;
      case 6:
        horoscopo = dia < 22 ? "géminis" : "cáncer";
        break;
      case 7:
        horoscopo = dia < 22 ? "cáncer" : "leo";
        break;
      case 8:
        horoscopo = dia < 24 ? "leo" : "virgo";
        break;
      case 9:
        horoscopo = dia < 23 ? "virgo" : "libra";
        break;
      case 10:
        horoscopo = dia < 23 ? "libra" : "escorpio";
        break;
      case 11:
        horoscopo = dia < 23 ? "escorpio" : "sagitario";
        break;
      case 12:
        horoscopo = dia < 21 ? "sagitario" : "capricornio";
        break;
      default:
    }

    System.out.println("Su horóscopo es " + horoscopo);
  }
}
