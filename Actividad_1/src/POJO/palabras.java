
package POJO;


public class palabras {
    private String palabra;
    
    public void set_palabra(String pa){
        this.palabra=pa;
    }
    public void palindromo(){
        int aux=0;
        int lon= palabra.length();
        for (int i=0;i<lon;i++){
            for(int j=lon-1;j>=0;j--)
            if (palabra.charAt(i)==palabra.charAt(j))
                aux=aux;
            else 
                aux=1;
        }
        if (aux==0)
            System.out.println("es un palindromo");
        else 
            System.out.println("no es un palindromo");
    }
}
