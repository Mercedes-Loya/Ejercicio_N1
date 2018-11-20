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
//Constructores sobrecargados utilizados para inicializar objetos Tiempo2
import javax.swing.*;

public class PruebaTiempo3 {
    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();             //00:00:00
    Tiempo2 t2 = new Tiempo2(2);            //02:00:00
    Tiempo2 t3 = new Tiempo2(21,34);        //21:34:00
    Tiempo2 t4 = new Tiempo2(12,25,42);     //12:25:42
    Tiempo2 t5 = new Tiempo2(27,74,99);     //00:00:00
    Tiempo2 t6 = new Tiempo2(t4);           //12:25:42
    
    String salida = "Se construyo con: " + 
            "\nt1: todos los argumentos predeterminados" +
            "\n         "+t1.aStringUniversal()+
            "\n         "+t1.aStringEstandar();
    
    salida += "\nt2: Se especifico hora; minuto y segundo predeterminados" +
            "\n         "+t2.aStringUniversal()+
            "\n         "+t2.aStringEstandar();
            
    salida += "\nt3: Se especifico hora y  minuto; segundo predeterminado" +
            "\n         "+t3.aStringUniversal()+
            "\n         "+t3.aStringEstandar();
            
    salida += "\nt4: Se especificaron hora, minuto y segundo" +
            "\n         "+t4.aStringUniversal()+
            "\n         "+t5.aStringEstandar();
    
    salida += "\nt5: Se especificaron todos como valores invalidos" +
            "\n         "+t5.aStringUniversal()+
            "\n         "+t5.aStringEstandar();
            
    salida += "\nt6: Se especifico objeto t4 de la clase Tiempo2" +
            "\n         "+t6.aStringUniversal()+
            "\n         "+t6.aStringEstandar();
    
            JOptionPane.showMessageDialog(null, salida,"Constructores sobrecargados", JOptionPane.INFORMATION_MESSAGE);
            
            System.exit(0);
    }//Fin del main
    
}//fin de la clase PruebaTiempo3

