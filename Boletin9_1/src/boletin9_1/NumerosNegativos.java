package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Pose Carames
 */
public class NumerosNegativos {

    int i;
    int numero;
    int contadorP;
    int contadorN;
    int cero;

    public void datos() {

        for (i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
            if (numero < 0) {
                contadorN++;
            } else if (numero > 0) {
                contadorP++;
            } else {
                cero++;
            }

        }
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "De los 10 números: " + '\n' + contadorP + " son positivos"
                + '\n' + contadorN + " son negativos" + '\n' + cero + " son ceros");
    }

}
