
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author menuven
 */
public class TablaM {
    int i;
    int numero;
    int contador;
    public void datos(){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        
    }
    public void multiplica(){
        
        for(i = 0; i < 10; i++) {
            
            while (contador<11){
                JOptionPane.showMessageDialog(null, numero+"*"+contador+"="+(numero*contador));
                contador++;
            }
            
        }
        
    }     
        
    }
    

