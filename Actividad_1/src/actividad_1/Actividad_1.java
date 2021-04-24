
package actividad_1;

import POJO.numeros;
import POJO.palabras;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Actividad_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("introduce una opcion: "
                    + "\nOpcion 1: numeros hasta introducir un negativo"
                    + "\nOpcion 2: tabla de multiplicar"
                    + "\nOpcion 3: contraseña"
                    + "\nOpcion 4: Palindromo"
                    + "\nOpcion 5: conversion de grados ");
            opcion= sc.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    numeros eje1=new numeros();
                    int n;
                    int d=0;
                    do{
                        System.out.println("introduce digito:\n");
                        n=sc.nextInt();
                        eje1.numerosp(n,d);
                        d++;
                    }while (n>=0);
                    break;
                case 2:
                    numeros eje2=new numeros();
                    int n1,n2;
                    System.out.println("introduce 2 digitos:\n");
                    n1=sc.nextInt();
                    n2=sc.nextInt();
                    eje2.set_num(n2);
                    eje2.set_num1(n1);
                    eje2.tabla();
                    break;
                case 3:
                    numeros eje3=new numeros();
                    eje3.contaseña();
                    break;
                case 4:
                    palabras eje4 =new palabras();
                    
                    String palabra;
                    //System.out.println("Introduce una palabra:");
                    //palabra=sc.next();
                    palabra=JOptionPane.showInputDialog("Introduce una palabra:");
                    eje4.set_palabra(palabra);
                    eje4.palindromo();
                    break;
                case 5:
                    numeros gra = new numeros();
                    System.out.println("Introdusca los grados:");
                    double grados;
                    grados=sc.nextInt();
                    gra.set_gra(grados);
                    int opcion1;
        do{
            System.out.println("introduce una opcion: "
                    + "\nOpcion 1: C° a F°"
                    + "\nOpcion 2: F° a C°"
                    + "\nOpcion 3: F° a K"
                    + "\nOpcion 4: K  a F°"
                    + "\nOpcion 5: C° a K"
                    + "\nOpcion 6: K  a C°");
            opcion1= sc.nextInt();
            gra.set_num1(opcion1);
            gra.grados();
        }while (opcion1!=0);
                    break;
                    
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion !=0);
    }
    
}
