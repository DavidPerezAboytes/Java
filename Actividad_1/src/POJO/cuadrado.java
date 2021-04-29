package POJO;
//clase hijo1
public class cuadrado extends figuras{
    public cuadrado (int l){
        super.set_lado1(l);
    }
    public void perimetro(){
        int p = super.lado1*4;
        System.out.println("El perimetro es: "+p+"\n");
    }
    public void area (){
        int a =super.lado1*super.lado1;
        System.out.println("El area es: "+a+"\n");
    }
}