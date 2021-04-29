
package POJO;
//clase padre
public abstract class figuras {
    //atributos
    public int lado1;
    public int lado2;
    //metodos
    public void set_lado1(int l){
        this.lado1=l;
    }
    public void set_lados(int l,int la){
        this.lado2=la;
        this.lado1=l;
    }
    public int get_lado1(){
        return lado1;
    }

    public int get_lado2(){
        return lado2;
    }
}


