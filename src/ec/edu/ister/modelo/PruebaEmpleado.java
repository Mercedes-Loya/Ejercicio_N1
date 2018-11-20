/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author MARIA LOYA
 */
//Demostracion de un objeto que tiene como miembro a otro objeto

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Fecha nacimiento = new Fecha(7,24,1949);
        Fecha contratacion = new Fecha(3, 12, 1988);
        Empleado empleado = new Empleado("Juan", "Perez", nacimiento, contratacion);
        
        JOptionPane.showMessageDialog(null, empleado.aStringEmpleado(), "Prueba de la clase Empleado", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}//fin de la clase PruebaEmpleado
