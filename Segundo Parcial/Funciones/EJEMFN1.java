package ejemfn1;
import java.util.Scanner;

public class EJEMFN1 {

    public static double calcularTarifaBase(double valorVehiculo) {
        double tarifaBase = valorVehiculo * 0.04;

        System.out.println("La tarifa base es de: $" + tarifaBase);

        return tarifaBase;
    }

    public static double calcularRecargoPorEdad(double tarifaBase, int edad) {
        double recargoEdad = 0;

        if (edad < 25) {
            recargoEdad = tarifaBase * 0.20;
            System.out.println("Recargo por edad: $" + recargoEdad);
        } 
        else if (edad >= 25 && edad <= 60) {
            recargoEdad = 0;
            System.out.println("No hay recargo por edad");
        } 
        else if (edad > 60) {
            recargoEdad = tarifaBase * 0.10;
            System.out.println("Recargo por edad: $" + recargoEdad);
        }

        return recargoEdad;
    }

    public static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes) {
        double recargoAccidentes = tarifaBase * 0.08 * accidentes;

        System.out.println("Recargo por accidentes: $" + recargoAccidentes);

        return recargoAccidentes;
    }

    public static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad) {
        double descuento = 0;

        if (tieneSeguridad) {
            descuento = subtotal * 0.05;
            System.out.println("Descuento por sistema de seguridad: $" + descuento);
        } 
        else {
            System.out.println("No cuenta con descuento de seguridad");
        }

        return descuento;
    }

    public static double calcularCostoFinal(double tarifaBase, double recargoEdad,
            double recargoAccidentes, double descuento) {
        double subtotal = tarifaBase + recargoEdad + recargoAccidentes;
        double total = subtotal - descuento;

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema que calcula la cotizacion de costo de automovil");
        System.out.println("¿Cuál es el valor del vehículo?");
        double valorVehiculo = sc.nextDouble();
        double tarifaBase = calcularTarifaBase(valorVehiculo);
        System.out.println("¿Cuál es la edad del conductor?");
        int edad = sc.nextInt();
        double recargoEdad = calcularRecargoPorEdad(tarifaBase, edad);
        System.out.println("¿Cuántos accidentes ha tenido?");
        int accidentes = sc.nextInt();
        double recargoAccidentes = calcularRecargoPorAccidentes(tarifaBase, accidentes);
        double subtotal = tarifaBase + recargoEdad + recargoAccidentes;
        System.out.println("¿Cuenta con sistema de seguridad adicional? (true/false)");
        boolean tieneSeguridad = sc.nextBoolean();
        double descuento = calcularDescuentoSeguridad(subtotal, tieneSeguridad);
        double total = calcularCostoFinal(
                tarifaBase,
                recargoEdad,
                recargoAccidentes,
                descuento
        );
        System.out.println("El costo final es: $" + total);

        sc.close();
    }
 }

