/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;
//clase hijo3
public class triangulo extends figuras{
    public triangulo (int l,int la){
        super.set_lados(l, la);
    }
    public void perimetro(){
        int p = super.lado1+(super.lado2*2);
        System.out.println("El perimetro es: "+p+"\n");
    }
    public void area (){
        int a =(super.lado1*super.lado2)/2;
        System.out.println("El area es: "+a+"\n");
    }
}