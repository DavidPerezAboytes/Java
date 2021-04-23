
package actividad_1;

import POJO.numeros;
import java.util.Scanner;

public class Actividad_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("introduce una opcion: \nOpcion 1: numeros hasta introducir un negativo\nOpcion 2: tabla de multiplicar\nOpcion 3: contraseña");
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
                    eje2.set_num(n1);
                    eje2.set_num1(n2);
                    eje2.tabla();
                    break;
                case 3:
                    numeros eje3=new numeros();
                    eje3.contaseña();
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while (opcion !=0);
    }
    
}
