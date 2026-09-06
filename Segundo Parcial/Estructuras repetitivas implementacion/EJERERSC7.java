package ejerersc7;

import java.util.Scanner;
public class EJERERSC7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int personas, dia;
        double precio;
        char membresia;
        char continuar;

        do {

            precio = 0;

            System.out.print("\n¿Cuantas personas son? ");
            personas = teclado.nextInt();

            System.out.print("¿Que dia es? "
                    + "(1=Lunes, 2=Martes, 3=Miercoles, "
                    + "4=Jueves, 5=Viernes, 6=Sabado, 7=Domingo): ");
            dia = teclado.nextInt();

            System.out.print("¿Tienes membresia? (S/N): ");
            membresia = teclado.next().toUpperCase().charAt(0);

            switch (dia) {

                case 3:
                    precio = personas * 30;
                    break;

                case 4:
                    precio = (personas / 2) * 75
                            + (personas % 2) * 50;
                    break;

                default:
                    precio = personas * 50;
                    break;
            }

            if (membresia == 'S') {
                precio = precio * 0.90;
            }

            System.out.println("El precio total es: $" + precio);

            System.out.print("¿Deseas realizar otra compra? (S/N): ");
            continuar = teclado.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
    }
}
