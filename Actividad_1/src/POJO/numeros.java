
package POJO;

import java.util.Random;

public class numeros {
    private int num;
    private int aux=0;
    private int num1;
    
    public void set_num(int n){
        this.num=n;
    }
    public void set_num1(int n){
        this.num1=n;
    }
    public void numerosp(int n, int d){
        if (n>0){
            aux=aux+n;
        }else {
            System.out.println(aux/d);
        }
    }
    public void tabla(){
        for (int i=0;i<num1;i++){
            System.out.println(num+"x"+(i+1)+"="+num*(i+1));
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
    
}
