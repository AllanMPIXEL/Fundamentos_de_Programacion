package ejerersc8;
import java.util.Scanner;
public class EJERERSC8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int sabor;
        int precio;
        char chocolate;
        char snack;
        char nombre;
        char continuar;

        do {

            precio = 0;

            System.out.println("\n1. Manzana");
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
                    chocolate = teclado.next().toUpperCase().charAt(0);

                    if (chocolate == 'N') {
                        precio = 280;
                    } else {
                        precio = 300;
                    }

                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            if (precio > 0) {

                System.out.print("¿Quieres agregar un snack? (S/N): ");
                snack = teclado.next().toUpperCase().charAt(0);

                if (snack == 'S') {
                    precio = precio + 25;
                }

                System.out.print("¿Quieres poner un nombre? (S/N): ");
                nombre = teclado.next().toUpperCase().charAt(0);

                if (nombre == 'S') {
                    precio = precio + 30;
                }

                System.out.println("El precio total es: $" + precio);
            }

            System.out.print("¿Deseas realizar otro pedido? (S/N): ");
            continuar = teclado.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
    }
}

