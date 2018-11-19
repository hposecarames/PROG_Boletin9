package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author menuven
 */
public class SumaProducto {

    int numero = 10;
    int numero1;
    

    public void suma() {
        
        int numero2=0;
        while (numero < 91) {
            numero1 = numero++;
            numero2 = numero2 + numero1;
            
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros entre 10 y 90 es: "+numero2);
    }

    public void producto() {
        int numero2=1;
        while (numero < 91) {
            numero1 = numero++;
            numero2 = numero2 * numero1;
        }
        JOptionPane.showMessageDialog(null,"El producto de los numeros entre 10 y 90 es: "+numero2);
    }
       
}
