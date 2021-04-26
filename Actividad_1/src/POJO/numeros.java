
package POJO;

import java.util.Random;

public class numeros {
    private int num;
    private int aux=0;
    private int num1;
    private double gra;
    
    
    public void set_num(int n){
        this.num=n;
    }
    public void set_num1(int n){
        this.num1=n;
    }
    public void set_gra(double g){
        this.gra=g;
    }
    public void numerosp(int n, int d){
        if (n>0){
            aux=aux+n;
        }else {
            System.out.println(aux/d);
        }
    }
    public void tabla(){
        for (int i=1;i<=num1;i++){
            for(int j=1;j<=num;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public void contaseña(){
        Random rnd=new Random();
        for(int x=0;x<10;x++){
            int num_al_1=1+rnd.nextInt(3);
            int num_al;
            switch (num_al_1) {
                case 1:
                    num_al=48+ rnd.nextInt(57-48);
                    char letra = (char)num_al;
                    System.out.print(letra);
                    break;
                case 2:
                    num_al=65+ rnd.nextInt(90-65);
                    char letra1 = (char)num_al;
                    System.out.print(letra1);
                    break;
                case 3:
                    num_al=97+ rnd.nextInt(122-97);
                    char letra2 = (char)num_al;
                    System.out.print(letra2);
                    break;
                                   
            }
            
        }
        System.out.println();
    }
    public void grados(){
        switch(num1){
            case 1:
                double res;
                res=(gra*9/5)+32;
                System.out.println(res);
                break;
            case 2:
                double res1;
                res1=(gra-32)*5/9;
                System.out.println(res1);
                break;
            case 3:
                double res2;
                res2=((gra-32)*5/9)+273.15;
                System.out.println(res2);
                break;
            case 4:
                double res3;
                res3=((gra-273.15)*9/5)+32;
                System.out.println(res3);
                break;
            case 5:
                double res4;
                res4=gra+273.15;
                System.out.println(res4);
                break;
            case 6:
                double res5;
                res5=gra-273.15;
                System.out.println(res5);
                break;
            case 0:
                System.out.println("Adios");
                break;
            default :
                System.out.println("no existe esta opcion ");
                    break;
        }
    }
    public void arreglo(){
        Random rnd=new Random();
        int arr[] = new int [10];
        for (int y=0; y<10;y++){
            int n=rnd.nextInt(1000);
            arr[y]=n;
        }
        
        int aux=0;
        for (int x=0;x<10;x++){
            if (arr[x]==num){
                aux=1;
            }}
            if (aux==1)
                System.out.println("el numero esta en el arreglo"); 
            else
                System.out.println("el numero No esta en el arreglo");
        }
    public void burbuja (){
        Random rnd=new Random();
        int arr[] = new int [10];
        for (int y=0; y<10;y++){
            int n=rnd.nextInt(1000);
            arr[y]=n;
        }
        for (int y=0; y<10;y++){
            System.out.print(arr[y]+"\t");
        }
        System.out.println();
        int aux=0;
        for (int i=1;i<10;i++){
            for (int j=0;j<10;j++){
                if (arr[j]>arr[i]){
                  aux=arr[i];
                  arr[i]=arr[j];
                  arr[j]=aux;
                }
            }
        }
        for (int y=0; y<10;y++){
            System.out.print(arr[y]+"\t");
        }
        System.out.println();
    }
    }
    

