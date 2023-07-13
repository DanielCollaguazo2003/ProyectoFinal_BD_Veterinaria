/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author XaviO_o
 */
public class listenerBotonSesion implements ActionListener{
    vista v;
   // interfaz i;

    public listenerBotonSesion(vista v) {
        this.v = v;
    //    this.i = i;
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String user = "DanielCollaguazo";
       String password = "Collaguazo123";
       
        if (user.equals(v.textUser()) && password.equals(v.textPassword())) {
          //  i.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(v, "Usuario o contrasenia incorrecta");
        }
    }
    
    
}
