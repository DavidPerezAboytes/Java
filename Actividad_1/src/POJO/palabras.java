
package POJO;

import javax.swing.JOptionPane;


public class palabras {
    private String palabra;
    
    public void set_palabra(String pa){
        this.palabra=pa;
    }
    public void palindromo(){
        //System.out.println(palabra);
        int aux=0;
        int lon= palabra.length();
        for (int i=0;i<lon;i++){
            for(int j=lon-1;j>=0;j--){
                if (palabra.charAt(i)!=palabra.charAt(j))
                aux=1;
                else 
                aux=0;
            }
            
        }
        if (aux==0)
            //System.out.println("es un palindromo");
            JOptionPane.showMessageDialog(null,palabra+"\nes un palindromo" );
        else 
            //System.out.println("no es un palindromo");
            JOptionPane.showMessageDialog(null,palabra+"\nno es un palindromo" );
    }
}
