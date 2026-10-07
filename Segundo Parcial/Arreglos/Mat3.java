package com.ej1.mat3;
import java.util.Scanner;
public class Mat3 {
public class Ejercicio3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Estudiantes: ");
        int n=sc.nextInt();
        System.out.print("Examenes: ");
        int m=sc.nextInt();

        double[][]c=new double[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                do{
                    System.out.print("Estudiante "+(i+1)+", examen "+(j+1)+": ");
                    c[i][j]=sc.nextDouble();
                }while(c[i][j]<0||c[i][j]>10);
            }

        double[]p=new double[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)p[i]+=c[i][j];
            p[i]/=m;
            System.out.println("Promedio estudiante "+(i+1)+": "+p[i]);
        }

        double mejor=p[0];
        for(int i=1;i<n;i++)if(p[i]>mejor)mejor=p[i];

        System.out.println("\nMejor promedio: "+mejor);
        for(int i=0;i<n;i++)
            if(p[i]==mejor)System.out.println("Estudiante "+(i+1));

        int ce=0,cb=0;
        for(double x:p){
            if(x>=9&&x<=10)ce++;
            if(x<7)cb++;
        }

        double[][]excelentes=new double[ce][m+1];
        double[][]bajos=new double[cb][m+1];

        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(p[i]>=9){
                excelentes[a][0]=i+1;
                for(int j=0;j<m;j++)excelentes[a][j+1]=c[i][j];
                a++;
            }
            if(p[i]<7){
                bajos[b][0]=i+1;
                for(int j=0;j<m;j++)bajos[b][j+1]=c[i][j];
                b++;
            }
        }

        System.out.println("\nAlumnos con promedio entre 9 y 10:");
        if(ce==0)System.out.println("Ninguno");
        for(int i=0;i<ce;i++){
            System.out.print("Estudiante "+(int)excelentes[i][0]+": ");
            for(int j=1;j<=m;j++)System.out.print(excelentes[i][j]+" ");
            System.out.println();
        }

        System.out.println("\nAlumnos con promedio menor a 7:");
        if(cb==0)System.out.println("Ninguno");
        for(int i=0;i<cb;i++){
            System.out.print("Estudiante "+(int)bajos[i][0]+": ");
            for(int j=1;j<=m;j++)System.out.print(bajos[i][j]+" ");
            System.out.println();
        }

        double[]pe=new double[m];
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++)pe[j]+=c[i][j];
            pe[j]/=n;
        }

        double max=pe[0],min=pe[0];
        for(int j=1;j<m;j++){
            if(pe[j]>max)max=pe[j];
            if(pe[j]<min)min=pe[j];
        }

        System.out.println("\nPromedio de cada examen:");
        for(int j=0;j<m;j++)
            System.out.println("Examen "+(j+1)+": "+pe[j]);

        System.out.println("Examen con mayor promedio: ");
        for(int j=0;j<m;j++)
            if(pe[j]==max)System.out.println("Examen "+(j+1)+" ("+max+")");

        System.out.println("Examen con menor promedio: ");
        for(int j=0;j<m;j++)
            if(pe[j]==min)System.out.println("Examen "+(j+1)+" ("+min+")");

        sc.close();
        }
    }
}

