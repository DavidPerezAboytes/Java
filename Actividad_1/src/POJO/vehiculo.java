/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author pumas
 */
public class vehiculo {
    private String nombre;
    private String color;
    private String marca;
// constructor
    public vehiculo(String n,String c,String m){
        nombre=n;
        color= c;
        marca=m;
    }
// metodo set
    public void set_nombre(String pa){
        this.nombre=pa;
    }
    public void set_color(String co){
        this.color=co;
    }
    public void set_marca(String ma){
        this.marca=ma;
    }
// metodo get
    public String get_nombre(){
        return nombre;
    }
    public String get_color(){
        return color;
    }
    public String get_marca(){
        return marca;
    }
    
}
