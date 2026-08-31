package com.ej1.ejempsc4;
import java.util.Scanner;

public class EJEMPSC4 {

    public static void main(String[] args) {
        double N1;
        double N2;
        double N3;
        char S;
        Scanner SC = new Scanner(System.in);
        System.out.println("SELECCIONA UNA FIGURA: ");
        System.out.println("CUADRADO: (C) ");
        System.out.println("RECTANGULO: (R) ");
        System.out.println("TRIANGULO:(T) ");
        System.out.println("CIRCULO: (O) ");
            S = SC.next().toUpperCase().charAt(0);
            switch (S) {
            case 'C': 
                System.out.println("PROPORCIONA LA MEDIDA DE UN LADO: ");
                N1 = SC.nextInt();
                N3 = N1*N1;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case 'R': 
                System.out.println("PROPORCIONA SU ALTURA: ");
                N1 = SC.nextInt();
                System.out.println("PROPORCIONA SU BASE: ");
                N2 = SC.nextInt();
                N3 = N1 * N2;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case 'T': 
                System.out.println("PROPORCIONA SU ALTURA: ");
                N1 = SC.nextInt();
                System.out.println("PROPORCIONA SU BASE: ");
                N2 = SC.nextInt();
                N3 = (N1 * N2)/2;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case 'O': 
                System.out.println("PROPORCIONA SU RADIO: ");
                N1 = SC.nextInt();
                N3 = 3.1416 * (N1*N1);
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            default: System.out.println("FIGURA NO RECONOCIDA");
            break;
        }
    }
}
