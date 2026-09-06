package ejerersc1;
import java.util.Scanner;
public class EJERERSC1 {

    public static void main(String[] args) {

        int DIA;
        char continuar;
        Scanner SC = new Scanner(System.in);

        do {
            System.out.println("\n¿Que dia de la semana seleccionas?: ");
            DIA = SC.nextInt();

            switch (DIA) {
                case 1:
                    System.out.println("LUNES");
                    break;
                case 2:
                    System.out.println("MARTES");
                    break;
                case 3:
                    System.out.println("MIERCOLES");
                    break;
                case 4:
                    System.out.println("JUEVES");
                    break;
                case 5:
                    System.out.println("VIERNES");
                    break;
                case 6:
                    System.out.println("SABADO");
                    break;
                case 7:
                    System.out.println("DOMINGO");
                    break;
                default:
                    System.out.println("Error de captura");
                    break;
            }

            System.out.print("¿Deseas realizar otra iteracion? (S/N): ");
            continuar = SC.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
    }
}
