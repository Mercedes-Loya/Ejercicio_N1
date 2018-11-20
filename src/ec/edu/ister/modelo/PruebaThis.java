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
//Uso de la referencia this para hacer referencia a los campos y metodos.
import javax.swing.*;
import java.text.DecimalFormat;

public class PruebaThis {
    public static void main(String[] args) {
        HoraSimple hora = new HoraSimple( 12,30,19);
        
        JOptionPane.showMessageDialog(null, hora.crearCadena(), "Demostracion de la referencia \"this\"",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }
}//Fin de la clase PruebaThis

class HoraSimple{
    private int hora;
    private int minuto;
    private int segundo;
    
    //el constructor utiliza nombres de parametros identicos a los nombres de la variable
    //de instancia; se requiere la referencia "this" para diferenciar entre los nombres
    
    public HoraSimple(int hora, int minuto, int segundo){
        this.hora = hora;           //establece hora del objeto "this"
        this.minuto = minuto;       //establece minuto del objeto "this"
        this.segundo = segundo;     //establece segundo del objeto "this"
    }
    
    //usar "this" eplicito e implicito para llamar al metodo aStringEstandar
    
    public String crearCadena(){
        return "this.aStringEstandar(): " + this.aStringEstandar() +
                "\naStringEstandar(): " + aStringEstandar();
    }
    
    // devolver  la representacion String de HoraSimple
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        //"this" no se requiere aqui, ya que el metodo no tiene
        //variables locales con los mismos nombres que las variables de instancia
        return dosDigitos.format(this.hora) + ":" + 
               dosDigitos.format(this.minuto) + ":" +
               dosDigitos.format(this.segundo);
    }
}//Fin de la clase HoraSimple

