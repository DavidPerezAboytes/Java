
package POJO;

public class calculadora {
//  Atributos
    private int a;
    private int b;
    private int suma;
    private int resta;
    private int mult;
    private int div;
//  Metodos 
    public void set_a(int a){
        this.a=a;
    }
    public void set_b(int b){
        this.b=b;
    }
    public int get_suma(){
        return suma;
    }
    public int get_mult(){
        return mult;
    }
    public int get_resta(){
        return resta;
    }
    public int get_div(){
        return div;
    }
    public void suma (){
        suma=a+b;
    }
    public void resta(){
        resta=a-b;
    }
    public void mult(){
        mult=a*b;
    }
    public void div (){
        div=a/b;
    }
}
