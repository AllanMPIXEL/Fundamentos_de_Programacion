package com.ej1.vinic;

import java.util.Scanner;

public class ViniC {

    public static void main(String[] args) {
            String C;
            int T;
            double K;
            double K1;
            double P;
            double P1;
            Scanner L = new Scanner(System.in);
            System.out.print("Kilo: ");
            K = L.nextDouble();
            System.out.print("Tipo de la fruta (A o B): ");
            C = L.next();
            System.out.print("Tamaño de la fruta (1 o 2): ");
            T = L.nextInt();
            System.out.print("Teclea el precio: ");
            P = L.nextDouble();
            if(C.equals("A") && T == 1){
                P1 = P + 0.20;
                K1 = K * P1;
                System.out.print("El costo total es: " + K1);
                
            }else if(C.equals("A") && T == 2){
                P1 = P + 0.30;
                K1 = K * P1;
                System.out.print("El costo total es: " + K1);
                
            }else if(C.equals("B") && T == 1){
                P1 = P - 0.30;
                K1 = K * P1;
                System.out.print("El costo total es: " + K1);
                
            }else{
                P1 = P - 0.50;
                K1 = K * P1;
                System.out.print("El costo total es: " + K1);
        }
            
    }
}
