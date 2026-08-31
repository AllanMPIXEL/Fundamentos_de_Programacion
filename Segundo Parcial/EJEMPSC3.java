package com.ej1.ejempsc3;

import java.util.Scanner;

public class EJEMPSC3 {

    public static void main(String[] args) {
        int N1;
        int N2;
        int N3;
        char S;
        Scanner SC = new Scanner(System.in);
            System.out.println("SELECCIONA UN OPERADOR: ");
            S = SC.next().toUpperCase().charAt(0);
            switch (S) {
            case '+': 
                System.out.println("PRIMER NUMERO: ");
                N1 = SC.nextInt();
                System.out.println("SEGUNDO NUMERO: ");
                N2 = SC.nextInt();
                N3 = N1 + N2;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case '-': 
                System.out.println("PRIMER NUMERO: ");
                N1 = SC.nextInt();
                System.out.println("SEGUNDO NUMERO: ");
                N2 = SC.nextInt();
                N3 = N1 - N2;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case '*': 
                System.out.println("PRIMER NUMERO: ");
                N1 = SC.nextInt();
                System.out.println("SEGUNDO NUMERO: ");
                N2 = SC.nextInt();
                N3 = N1 * N2;
                System.out.println("EL RESULTADO ES: "+N3);
            break;
            case '/': 
                System.out.println("PRIMER NUMERO: ");
                N1 = SC.nextInt();
                System.out.println("SEGUNDO NUMERO: ");
                N2 = SC.nextInt();
                if(N2 == 0){
                    System.out.println("NO ES VALIDO UTILIZAR 0");
                }
                else{
                N3 = N1 / N2;
                System.out.println("EL RESULTADO ES: "+N3);
                }
            break;
            default: System.out.println("OPERADOR NO EXISTE");
            break;
        }
    }
}
