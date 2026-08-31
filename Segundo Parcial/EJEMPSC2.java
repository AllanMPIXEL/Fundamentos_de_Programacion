package com.ej1.ejempsc2;
import java.util.Scanner;
public class EJEMPSC2 {

    public static void main(String[] args) {
        int MES;
        Scanner SC = new Scanner(System.in);
        System.out.println("MES A SELECCIONAR: ");
        MES = SC.nextInt();
            switch (MES) {
            case 1: System.out.println("ENERO");
            System.out.println("TIENE 31 DIAS");
            break;
            case 2: System.out.println("FEBRERO");
            System.out.println("TIENE 28 DIAS");
            break;
            case 3: System.out.println("MARZO");
            System.out.println("TIENE 31 DIAS");
            break;
            case 4: System.out.println("ABRIL");
            System.out.println("TIENE 30 DIAS");
            break;
            case 5: System.out.println("MAYO");
            System.out.println("TIENE 31 DIAS");
            break;
            case 6: System.out.println("JUNIO");
            System.out.println("TIENE 30 DIAS");
            break;
            case 7: System.out.println("JULIO");
            System.out.println("TIENE 31 DIAS");
            break;
            case 8: System.out.println("AGOSTO");
            System.out.println("TIENE 31 DIAS");
            break;
            case 9: System.out.println("SEPTIEMBRE");
            System.out.println("TIENE 30 DIAS");
            break;
            case 10: System.out.println("OCTUBRE");
            System.out.println("TIENE 31 DIAS");
            break;
            case 11: System.out.println("NOVIEMBRE");
            System.out.println("TIENE 30 DIAS");
            break;
            case 12: System.out.println("DICIEMBRE");
            System.out.println("TIENE 31 DIAS");
            break;
            default: System.out.println("ERROR DE CAPTURA");
            break;
        }
    }
}
