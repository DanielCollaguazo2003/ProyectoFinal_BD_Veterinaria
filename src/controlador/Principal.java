/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.interfaz;
import Vista.vista;

/**
 *
 * @author XaviO_o
 */
public class Principal {
    public static void main(String[] args) {
        vista v = new vista();
        interfaz i = new interfaz();
        
        listenerBotonSesion se = new listenerBotonSesion(v, i);
        v.listenerSesion(se);
        
        v.setVisible(true);
    }
}
