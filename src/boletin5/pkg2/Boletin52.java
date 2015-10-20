
package boletin5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Boletin52 {

   
    public static void main(String[] args) {
        Satelite primerSatelite=new Satelite();
        primerSatelite.verPosicion();
        
        
        Satelite segundoSatelite=new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Inserte el meridiano:")),Double.parseDouble(JOptionPane.showInputDialog("Inserte el paralelo")),Double.parseDouble(JOptionPane.showInputDialog("Inseta la distancia a la tierra")));
        segundoSatelite.verPosicion();
        
        
    }
    
}
