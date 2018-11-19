
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class AreaRectangulo {
    
    double base;
    double altura;
        

public void datos(){
    
    base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
    while (base<=0){
        JOptionPane.showMessageDialog(null, "Introduce un numero mayor de 0");
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
    }
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
    while (altura<=0){
        JOptionPane.showMessageDialog(null, "Introduce un numero mayor de 0");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
    }
}
public void area(){
    JOptionPane.showMessageDialog(null, "El area es: "+base*altura);
}
}