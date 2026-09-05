package ejemper1;
import java.util.Scanner;
public class EJEMPER1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingresa un numero (0 para terminar): ");
            n = sc.nextInt();

            if (n != 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));
                }
                System.out.println();
            }

        } while (n != 0);

        System.out.println("Programa terminado.");
    }
}

