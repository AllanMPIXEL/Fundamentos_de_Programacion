package com.ej1.mat2;
import java.util.Scanner;

public class Mat2{
    static Scanner sc=new Scanner(System.in);
    static int[][]m=new int[4][4];
    static boolean llena=false;

    static void mostrar(){
        System.out.println("\nMatriz:");
        for(int[]f:m){
            for(int x:f)System.out.print(x+"\t");
            System.out.println();
        }
    }

    static boolean existe(int x){
        for(int[]f:m)
            for(int y:f)
                if(y==x)return true;
        return false;
    }

    public static void main(String[]args){
        int op;
        do{
            System.out.println("\n1.Rellenar matriz");
            System.out.println("2.Suma de filas y columnas");
            System.out.println("3.Suma de una fila");
            System.out.println("4.Suma de una columna");
            System.out.println("5.Mayor y menor");
            System.out.println("6.Contar pares");
            System.out.println("7.Contar impares");
            System.out.println("8.Matriz de cuadrados");
            System.out.println("9.Diagonal principal");
            System.out.println("10.Diagonal inversa");
            System.out.println("11.Media");
            System.out.println("12.Salir");
            System.out.print("Opcion: ");
            op=sc.nextInt();

            if(op==1){
                for(int i=0;i<4;i++)
                    for(int j=0;j<4;j++){
                        int x;
                        do{
                            System.out.print("Valor ["+i+"]["+j+"]: ");
                            x=sc.nextInt();
                            if(existe(x))System.out.println("El numero ya existe.");
                        }while(existe(x));
                        m[i][j]=x;
                    }
                llena=true;
                mostrar();
            }else if(op>=2&&op<=11&&!llena){
                System.out.println("Debes rellenar la matriz primero.");
            }else if(op==2){
                for(int i=0;i<4;i++){
                    int s=0;
                    for(int j=0;j<4;j++)s+=m[i][j];
                    System.out.println("Fila "+(i+1)+": "+s);
                }
                for(int j=0;j<4;j++){
                    int s=0;
                    for(int i=0;i<4;i++)s+=m[i][j];
                    System.out.println("Columna "+(j+1)+": "+s);
                }
                mostrar();
            }else if(op==3){
                int f;
                do{System.out.print("Fila (1-4): ");f=sc.nextInt();}while(f<1||f>4);
                int s=0;
                for(int j=0;j<4;j++)s+=m[f-1][j];
                System.out.println("Suma: "+s);
                mostrar();
            }else if(op==4){
                int c;
                do{System.out.print("Columna (1-4): ");c=sc.nextInt();}while(c<1||c>4);
                int s=0;
                for(int i=0;i<4;i++)s+=m[i][c-1];
                System.out.println("Suma: "+s);
                mostrar();
            }else if(op==5){
                int may=m[0][0],men=m[0][0],fm=0,cm=0,fn=0,cn=0;
                for(int i=0;i<4;i++)
                    for(int j=0;j<4;j++){
                        if(m[i][j]>may){may=m[i][j];fm=i;cm=j;}
                        if(m[i][j]<men){men=m[i][j];fn=i;cn=j;}
                    }
                System.out.println("Mayor: "+may+" ["+(fm+1)+"]["+(cm+1)+"]");
                System.out.println("Menor: "+men+" ["+(fn+1)+"]["+(cn+1)+"]");
                mostrar();
            }else if(op==6){
                int c=0;
                for(int[]f:m)for(int x:f)if(x%2==0)c++;
                System.out.println("Pares: "+c);
                mostrar();
            }else if(op==7){
                int c=0;
                for(int[]f:m)for(int x:f)if(x%2!=0)c++;
                System.out.println("Impares: "+c);
                mostrar();
            }else if(op==8){
                int[][]c=new int[4][4];
                for(int i=0;i<4;i++)
                    for(int j=0;j<4;j++)c[i][j]=m[i][j]*m[i][j];
                mostrar();
                System.out.println("\nMatriz de cuadrados:");
                for(int[]f:c){
                    for(int x:f)System.out.print(x+"\t");
                    System.out.println();
                }
            }else if(op==9){
                int s=0;
                for(int i=0;i<4;i++)s+=m[i][i];
                System.out.println("Diagonal principal: "+s);
                mostrar();
            }else if(op==10){
                int s=0;
                for(int i=0;i<4;i++)s+=m[i][3-i];
                System.out.println("Diagonal inversa: "+s);
                mostrar();
            }else if(op==11){
                int s=0;
                for(int[]f:m)for(int x:f)s+=x;
                System.out.println("Media: "+(s/16.0));
                mostrar();
            }else if(op!=12)System.out.println("Opcion no valida.");

        }while(op!=12);
    }
}
