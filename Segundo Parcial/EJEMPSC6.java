package com.ej1.ejempsc6;
import java.util.Scanner;
public class EJEMPSC6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes;
        System.out.print("Introduce el día de nacimiento: ");
        dia = teclado.nextInt();

        System.out.print("Introduce el mes de nacimiento (1-12): ");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                if (dia <= 19)
                    System.out.println("Capricornio");
                else
                    System.out.println("Acuario");
                break;

            case 2:
                if (dia <= 18)
                    System.out.println("Acuario");
                else
                    System.out.println("Piscis");
                break;

            case 3:
                if (dia <= 20)
                    System.out.println("Piscis");
                else
                    System.out.println("Aries");
                break;

            case 4:
                if (dia <= 19)
                    System.out.println("Aries");
                else
                    System.out.println("Tauro");
                break;

            case 5:
                if (dia <= 20)
                    System.out.println("Tauro");
                else
                    System.out.println("Géminis");
                break;

            case 6:
                if (dia <= 20)
                    System.out.println("Géminis");
                else
                    System.out.println("Cáncer");
                break;

            case 7:
                if (dia <= 22)
                    System.out.println("Cáncer");
                else
                    System.out.println("Leo");
                break;

            case 8:
                if (dia <= 22)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
                break;

            case 9:
                if (dia <= 22)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
                break;

            case 10:
                if (dia <= 22)
                    System.out.println("Libra");
                else
                    System.out.println("Escorpio");
                break;

            case 11:
                if (dia <= 21)
                    System.out.println("Escorpio");
                else
                    System.out.println("Sagitario");
                break;

            case 12:
                if (dia <= 21)
                    System.out.println("Sagitario");
                else
                    System.out.println("Capricornio");
                break;

            default:
                System.out.println("Mes no válido");
        }
    }
}
