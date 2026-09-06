package ejerersc4;
import java.util.Scanner;
public class EJERERSC4 {

    public static void main(String[] args) {

        double N1;
        double N2;
        double N3;
        char S;
        char continuar;

        Scanner SC = new Scanner(System.in);

        do {

            System.out.println("\nSELECCIONA UNA FIGURA: ");
            System.out.println("CUADRADO: (C)");
            System.out.println("RECTANGULO: (R)");
            System.out.println("TRIANGULO: (T)");
            System.out.println("CIRCULO: (O)");

            S = SC.next().toUpperCase().charAt(0);

            switch (S) {

                case 'C':
                    System.out.println("PROPORCIONA LA MEDIDA DE UN LADO: ");
                    N1 = SC.nextDouble();

                    N3 = N1 * N1;

                    System.out.println("EL RESULTADO ES: " + N3);
                    break;

                case 'R':
                    System.out.println("PROPORCIONA SU ALTURA: ");
                    N1 = SC.nextDouble();

                    System.out.println("PROPORCIONA SU BASE: ");
                    N2 = SC.nextDouble();

                    N3 = N1 * N2;

                    System.out.println("EL RESULTADO ES: " + N3);
                    break;

                case 'T':
                    System.out.println("PROPORCIONA SU ALTURA: ");
                    N1 = SC.nextDouble();

                    System.out.println("PROPORCIONA SU BASE: ");
                    N2 = SC.nextDouble();

                    N3 = (N1 * N2) / 2;

                    System.out.println("EL RESULTADO ES: " + N3);
                    break;

                case 'O':
                    System.out.println("PROPORCIONA SU RADIO: ");
                    N1 = SC.nextDouble();

                    N3 = 3.1416 * (N1 * N1);

                    System.out.println("EL RESULTADO ES: " + N3);
                    break;

                default:
                    System.out.println("FIGURA NO RECONOCIDA");
                    break;
            }

            System.out.print("¿Deseas calcular otra figura? (S/N): ");
            continuar = SC.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
    }
}

