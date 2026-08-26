package com.ej1.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int E;
        double P;
        int M;
        int D;
        Scanner sc = new Scanner(System.in);
        System.out.print("Teclea tu edad: ");
        E = sc.nextInt();
        if(E >= 18){
            System.out.print("Teclea tu Promedio: ");
            P = sc.nextDouble();
            if(P >= 9 ){
                System.out.print("Tu beca es de $10,000");
            }else if(P >= 7.5 && P < 9){
                System.out.print("Tu beca es de $8,000");
            }else if(P >= 6.0 && P < 7.5){
                System.out.print("Tu beca es de $5,000");
                System.out.println("Se le invita a mejorar su promedio para obtener mas beneficios");
            }else if(P < 6.0){
                System.out.println("Se le invita a mejorar su promedio para obtener mas beneficios");
            }
        }
         if(E < 18){
            System.out.println("Teclea tu Promedio");
            P = sc.nextDouble();
            if(P >= 9 ){
                System.out.println("Tu beca es de $8,000");
            }else if(P >= 7.5 && P < 9){
                System.out.println("Tu beca es de $6,000");
            }else if(P >= 6.0 && P < 7.5){
                System.out.println("Tu beca es de $4,000");
                System.out.println("Se le invita a mejorar su promedio para obtener mas beneficios");
            }else if(P < 6.0){
                System.out.println("Se le invita a mejorar su promedio para obtener mas beneficios");
            }
        }
    }
}   

