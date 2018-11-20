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
//Clase PruebaTiempo1 que utiliza la clase Tiempo1
import javax.swing.JOptionPane;

public class PruebaTiempo1 {
    
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1(); // llamar al constructor de Tiempo1
        
        //anexar version String de tiempo a salida de String
        String salida = "La hora universal inicial es: " + tiempo.aStringUniversal()
                + "\nLa hora estandar inicial es: " + tiempo.aStringEstandar();
        
        //cambiar tiempo y anexar hora actualizada a salida
        tiempo.establecerHora(13, 27, 6);
        salida += "\n\nLa hora universal despues de establecer Hora es: "+ tiempo.aStringUniversal()
                + "\nLa hora estandar despues de establecer Hora es: "+ tiempo.aStringUniversal(); 
        
        //establecer tiempo con valores invalidos; anexar tiempo actializado a salida
        
        tiempo.establecerHora(99, 99, 99);
        salida += "\n\nDespues de intentar ajustes invalidos: " + 
                "\nHora universal: " + tiempo.aStringUniversal() +
                "\nHora estandar: " + tiempo.aStringEstandar();
        
        JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }//fin del main
            
}//fin de la clase PruebaTiempo1

