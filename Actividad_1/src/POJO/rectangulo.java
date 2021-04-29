package POJO;
//clase hijo2
public class rectangulo extends figuras{
    public rectangulo (int l,int la){
        super.set_lados(l, la);
    }
    public void perimetro(){
        int p = (super.lado1*2)+(super.lado2*2);
        System.out.println("El perimetro es: "+p+"\n");
    }
    public void area (){
        int a =super.lado1*super.lado2;
        System.out.println("El area es: "+a+"\n");
    }
}