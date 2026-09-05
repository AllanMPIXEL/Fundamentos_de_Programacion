package ejemper3;
import java.util.Scanner;
public class EJEMPER3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingresa el numero de lineas: ");
        n = sc.nextInt();

        System.out.println("\nFIGURA 1");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nFIGURA 2");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * n - 2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\nFIGURA 3");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
