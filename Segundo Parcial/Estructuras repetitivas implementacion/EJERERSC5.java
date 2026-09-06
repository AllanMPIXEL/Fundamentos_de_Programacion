package ejerersc5;

import java.util.Scanner;
public class EJERERSC5 {

    public static void main(String[] args) {

        int S;
        char continuar;

        Scanner SC = new Scanner(System.in);

        do {

            System.out.println("\nTECLEA LA HORA: ");
            S = SC.nextInt();

            switch (S) {

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    System.out.println("Buenos dias");
                    break;

                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    System.out.println("Buenas tardes");
                    break;

                case 21:
                case 22:
                case 23:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Buenas noches");
                    break;

                default:
                    System.out.println("Hora no valida");
                    break;
            }

            System.out.print("¿Deseas consultar otra hora? (S/N): ");
            continuar = SC.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
    }
}
