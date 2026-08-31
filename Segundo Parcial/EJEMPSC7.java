package com.ej1.ejempsc7;
import java.util.Scanner;
public class EJEMPSC7 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int personas, dia;
        double precio = 0;
        char membresia;

        System.out.print("¿Cuántas personas son? ");
        personas = teclado.nextInt();

        System.out.print("¿Qué día es? (1=Lunes, 2=Martes, 3=Miércoles, 4=Jueves, 5=Viernes, 6=Sábado, 7=Domingo): ");
        dia = teclado.nextInt();

        System.out.print("¿Tienes membresía? (S/N): ");
        membresia = teclado.next().charAt(0);

        switch (dia) {

            case 3:
                precio = personas * 30;
                break;

            case 4:
                precio = (personas / 2) * 75 + (personas % 2) * 50;
                break;

            default:
                precio = personas * 50;
                break;
        }

        if (membresia == 'S' || membresia == 's') {
            precio = precio * 0.90;
        }

        System.out.println("El precio total es: $" + precio);
    }
}
