package com.ej1.ejempsc8;
import java.util.Scanner;
public class EJEMPSC8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sabor;
        int precio = 0;
        char chocolate;
        char snack;
        char nombre;

        System.out.println("1. Manzana");
        System.out.println("2. Fresa");
        System.out.println("3. Chocolate");
        System.out.print("Elige el sabor: ");
        sabor = teclado.nextInt();

        switch (sabor) {

            case 1:
                precio = 200;
                break;

            case 2:
                precio = 250;
                break;

            case 3:
                System.out.print("¿Chocolate negro o blanco? (N/B): ");
                chocolate = teclado.next().charAt(0);

                if (chocolate == 'N' || chocolate == 'n') {
                    precio = 280;
                } else {
                    precio = 300;
                }

                break;

            default:
                System.out.println("Opción incorrecta");
        }

        System.out.print("¿Quieres agregar un snack? (S/N): ");
        snack = teclado.next().charAt(0);

        if (snack == 'S' || snack == 's') {
            precio = precio + 25;
        }

        System.out.print("¿Quieres poner un nombre? (S/N): ");
        nombre = teclado.next().charAt(0);

        if (nombre == 'S' || nombre == 's') {
            precio = precio + 30;
        }

        System.out.println("El precio total es: $" + precio);
    }
}
