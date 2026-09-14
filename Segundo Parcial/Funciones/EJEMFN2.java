package ejemfn2;
import java.util.Scanner;
public class EJEMFN2 {

    static double calcularSubtotalProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularSubtotalGeneral(double subtotal1, double subtotal2, double subtotal3) {
        return subtotal1 + subtotal2 + subtotal3;
    }

    static double calcularDescuento(double subtotal, int tipoCliente) {
        if (tipoCliente == 1) {
            return 0;
        } else {
            return subtotal * 0.10;
        }
    }

    static double calcularEnvio(double subtotal, String codigoPostal) {
        if (subtotal < 1000) {
            return 150;
        } else if (subtotal < 3000) {
            return 80;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    static double calcularTotal(double subtotal, double descuento,
                                double impuesto, double envio) {
        return subtotal - descuento + impuesto + envio;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precio1, precio2, precio3;
        int cantidad1, cantidad2, cantidad3;
        int tipoCliente;
        String codigoPostal;

        System.out.print("Precio del producto 1: ");
        precio1 = entrada.nextDouble();

        System.out.print("Cantidad del producto 1: ");
        cantidad1 = entrada.nextInt();

        System.out.print("Precio del producto 2: ");
        precio2 = entrada.nextDouble();

        System.out.print("Cantidad del producto 2: ");
        cantidad2 = entrada.nextInt();

        System.out.print("Precio del producto 3: ");
        precio3 = entrada.nextDouble();

        System.out.print("Cantidad del producto 3: ");
        cantidad3 = entrada.nextInt();

        System.out.print("Tipo de cliente (1=Regular, 2=Frecuente): ");
        tipoCliente = entrada.nextInt();

        System.out.print("Codigo postal: ");
        codigoPostal = entrada.next();

        double subtotal1 = calcularSubtotalProducto(precio1, cantidad1);
        double subtotal2 = calcularSubtotalProducto(precio2, cantidad2);
        double subtotal3 = calcularSubtotalProducto(precio3, cantidad3);

        double subtotal = calcularSubtotalGeneral(subtotal1, subtotal2, subtotal3);

        double descuento = calcularDescuento(subtotal, tipoCliente);

        double subtotalConDescuento = subtotal - descuento;

        double impuesto = calcularImpuesto(subtotalConDescuento);

        double envio = calcularEnvio(subtotal, codigoPostal);

        double total = calcularTotal(subtotal, descuento, impuesto, envio);
        System.out.println("\n--- RESUMEN DE COMPRA ---");
        System.out.println("Subtotal producto 1: $" + subtotal1);
        System.out.println("Subtotal producto 2: $" + subtotal2);
        System.out.println("Subtotal producto 3: $" + subtotal3);
        System.out.println("Subtotal general: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Envio: $" + envio);
        System.out.println("TOTAL A PAGAR: $" + total);

        entrada.close();
    }
}
