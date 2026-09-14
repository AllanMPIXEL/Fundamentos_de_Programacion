package ejemfn3;
import java.util.Scanner;
public class EJEMFN3 {

    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    static double calcularCostoConsumo(double consumo) {

        double costo;

        if (consumo <= 150) {
            costo = consumo * 1.20;

        } else if (consumo <= 400) {
            costo = (150 * 1.20) + ((consumo - 150) * 1.80);

        } else {
            costo = (150 * 1.20) + (250 * 1.80)
                    + ((consumo - 400) * 2.75);
        }

        return costo;
    }

    static double calcularDescuentoApoyo(double consumo,
                                         double costoAntesImpuesto,
                                         boolean tieneApoyo) {

        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    static double calcularTotal(double costoConsumo,
                                double cargoFijo,
                                double descuento,
                                double impuesto) {

        return costoConsumo + cargoFijo - descuento + impuesto;
    }

    static void mostrarRecibo(double consumo,
                              double costoConsumo,
                              double cargoFijo,
                              double descuento,
                              double impuesto,
                              double total) {

        System.out.println("\n--- RECIBO DE ELECTRICIDAD ---");
        System.out.println("Consumo: " + consumo + " kWh");
        System.out.println("Costo consumo: $" + costoConsumo);
        System.out.println("Cargo fijo: $" + cargoFijo);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("TOTAL: $" + total);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lecturaAnterior;
        double lecturaActual;
        boolean tieneApoyo;

        System.out.print("Lectura anterior: ");
        lecturaAnterior = entrada.nextDouble();

        System.out.print("Lectura actual: ");
        lecturaActual = entrada.nextDouble();

        System.out.print("¿Tiene programa de apoyo? (true/false): ");
        tieneApoyo = entrada.nextBoolean();

        double consumo = calcularConsumo(lecturaAnterior, lecturaActual);
        double costoConsumo = calcularCostoConsumo(consumo);
        double cargoFijo = 95;
        double costoAntesImpuesto = costoConsumo + cargoFijo;
        double descuento = calcularDescuentoApoyo(
                consumo,
                costoAntesImpuesto,
                tieneApoyo
        );

        double baseImponible = costoAntesImpuesto - descuento;
        double impuesto = calcularImpuesto(baseImponible);
        double total = calcularTotal(
                costoConsumo,
                cargoFijo,
                descuento,
                impuesto
        );
        mostrarRecibo(
                consumo,
                costoConsumo,
                cargoFijo,
                descuento,
                impuesto,
                total
        );
        entrada.close();
    }
}

