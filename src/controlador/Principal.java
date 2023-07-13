
package controlador;

import Vista.interfaz;
import Vista.vista;

/**
 *
 * @author XaviO_o
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("hola mi rey soy anthonazo el huevazo");
        
        vista v = new vista();
        interfaz i = new interfaz();
        
        listenerBotonSesion se = new listenerBotonSesion(v, i);
        v.listenerSesion(se);
        
        System.out.println("Hola soy Paul");
        
        v.setVisible(true);
    }
}
