
package actividad_1;

import POJO.numeros;
import POJO.palabras;
import POJO.vehiculo;
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
                    + "\nOpcion 5: conversion de grados"
                    + "\nOpcion 6: adivina el numero"
                    + "\nOpcion 7: ordenamiento de numeros (Burbuja)"
                    + "\nOpcion 8: Clases ");
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
                case 6:
                    numeros arre =new numeros();
                    int num;
                    System.out.println("Introdusca un digito para saber si esta dentro del arreglo aleatorio de 10 elementos");
                    num=sc.nextInt();
                    arre.set_num(num);
                    arre.arreglo();
                    break;
                case 7:
                    numeros burbu =new numeros ();
                    System.out.println("Burbuja");
                    burbu.burbuja();
                    break;
                case 8:
                    System.out.println("Uso de clases");
                    System.out.println("Clase vehiculo"
                            + "Objeto 1: bicicleta"
                            + "Objeto 2: carro"
                            + "Objeto 3: avion");
                    vehiculo bicicleta =new vehiculo("EMtb","negro","Specialized");
                    vehiculo carro =new vehiculo("Golf GTI","Blanco","VolksWagen");
                    vehiculo avion =new vehiculo("Boeing 737","Blanco","Boeing");
                    
                    System.out.println("Objeto 1"
                            + "\n Nombre: "+ bicicleta.get_nombre()
                            + "\n Color:  "+ bicicleta.get_color()
                            + "\n Marca:  "+ bicicleta.get_marca());
                    System.out.println("Objeto 2"
                            + "\n Nombre: "+ carro.get_nombre()
                            + "\n Color:  "+ carro.get_color()
                            + "\n Marca:  "+ carro.get_marca());
                    System.out.println("Objeto 3"
                            + "\n Nombre: "+ avion.get_nombre()
                            + "\n Color:  "+ avion.get_color()
                            + "\n Marca:  "+ avion.get_marca());
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion !=0);
    }
    
}
