package com.ej1.ejempsc1;
import java.util.Scanner;
public class EJEMPSC1 {
   
    public static void main(String[] args) {
        int DIA;
        Scanner SC = new Scanner(System.in);
        System.out.println("¿Que dia de la semana seleccionas?: ");
        DIA = SC.nextInt();
            switch (DIA) {
            case 1: System.out.println("LUNES");
            break;
            case 2: System.out.println("MARTES");
            break;
            case 3: System.out.println("MIERCOLES");
            break;
            case 4: System.out.println("JUEVES");
            break;
            case 5: System.out.println("VIERNES");
            break;
            case 6: System.out.println("SABADO");
            break;
            case 7: System.out.println("DOMINGO");
            break;
            default: System.out.println("Error de captura");
            break;
        }
    }
}
