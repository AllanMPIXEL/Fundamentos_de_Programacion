package com.ej1.mat3;
import java.util.Scanner;

public class Mat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECIO_COMPUTADORA = 10000.0; 

        System.out.print("Ingrese la cantidad de vendedores: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese la cantidad de zonas: ");
        int m = scanner.nextInt();
        int[][] matrizVentas = new int[n][m];

        System.out.println("\n--- Ingreso de Datos de Ventas ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Computadoras vendidas por el Vendedor " + (i + 1) + " en la Zona " + (j + 1) + ": ");
                matrizVentas[i][j] = scanner.nextInt();
            }
        }

        int[] totalesZonas = new int[m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                totalesZonas[j] += matrizVentas[i][j];
            }
        }

        int maxVentasZona = totalesZonas[0];
        int zonaMasVendio = 1;
        for (int j = 1; j < m; j++) {
            if (totalesZonas[j] > maxVentasZona) {
                maxVentasZona = totalesZonas[j];
                zonaMasVendio = j + 1;
            }
        }

        int[] totalesVendedores = new int[n];
        int totalGeneralComputadoras = 0;

        for (int i = 0; i < n; i++) {
            int sumaVendedor = 0;
            for (int j = 0; j < m; j++) {
                sumaVendedor += matrizVentas[i][j];
            }
            totalesVendedores[i] = sumaVendedor;
            totalGeneralComputadoras += sumaVendedor; // REQUERIMIENTO 4 acumulado aquí
        }

        int minVentasVendedor = totalesVendedores[0];
        int vendedorMenosVendio = 1;
        // Encontrar el vendedor que más vendió
        int maxVentasVendedor = totalesVendedores[0];
        int vendedorMasVendio = 1;

        for (int i = 1; i < n; i++) {
            if (totalesVendedores[i] < minVentasVendedor) {
                minVentasVendedor = totalesVendedores[i];
                vendedorMenosVendio = i + 1;
            }
            if (totalesVendedores[i] > maxVentasVendedor) {
                maxVentasVendedor = totalesVendedores[i];
                vendedorMasVendio = i + 1;
            }
        }

        double montoMenosVendio = minVentasVendedor * PRECIO_COMPUTADORA;
        double montoMasVendio = maxVentasVendedor * PRECIO_COMPUTADORA;
        System.out.println("\n================ REPORTE DE VENTAS ================");
        System.out.println("1. La zona que más computadoras vendió fue la Zona " + zonaMasVendio + " (Total: " + maxVentasZona + " unidades).");
        System.out.println("2. El vendedor que MENOS vendió fue el Vendedor " + vendedorMenosVendio + ":");
        System.out.println("   - Cantidad: " + minVentasVendedor + " computadoras.");
        System.out.printf("   - Monto de venta: $%,.2f\n", montoMenosVendio);
        System.out.println("3. El vendedor que MÁS vendió fue el Vendedor " + vendedorMasVendio + ":");
        System.out.println("   - Cantidad: " + maxVentasVendedor + " computadoras.");
        System.out.printf("   - Monto de venta: $%,.2f\n", montoMasVendio);
        System.out.println("4. Cantidad total de computadoras vendidas en todas las zonas: " + totalGeneralComputadoras + " unidades.");
        System.out.println("===================================================");
        
        scanner.close();
    }
}
