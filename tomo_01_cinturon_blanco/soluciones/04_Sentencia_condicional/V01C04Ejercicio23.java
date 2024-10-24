/**
 * Calcula el precio de un producto .
 */
public class V01C04Ejercicio23 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca el tipo de IVA");
    System.out.print(" (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();

    System.out.print("Introduzca el código promocional");
    System.out.print(" (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();

    // Calcula el IVA y el precio antes del descuento

    int tipoIVANumerico = 0;

    switch(tipoIVA) {
      case "general":
        tipoIVANumerico = 21;
        break;
      case "reducido":
        tipoIVANumerico = 10;
        break;
      case "superreducido":
        tipoIVANumerico = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }

    double iva = baseImponible * tipoIVANumerico / 100;
    double precioSinDescuento = baseImponible + iva;

    // Calcula el descuento

    double descuento = 0;

    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad": // el precio se reduce a la mitad
        descuento = precioSinDescuento / 2;
        break;
      case "meno5": // se descuentan 5 euros
        descuento = 5;
        break;
      case "5porc": // se descuenta el 5%
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }

    // Muestra el precio final del producto desglosado

    double total = precioSinDescuento - descuento;

    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)      %8.2f\n", tipoIVANumerico, iva);
    System.out.printf("Precio con IVA %8.2f\n", precioSinDescuento);
    System.out.printf("Promo (%5s) -%8.2f\n", codigoPromocional, descuento);
    System.out.printf("TOTAL          %8.2f\n", total);
  }
}
