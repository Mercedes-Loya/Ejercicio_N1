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
//Declaracion de la clase Tiempo1 que mantiene la hora en formato de 24 horas.
import java.text.DecimalFormat;

public class Tiempo1 {
    private int hora;       // 0 - 23
    private int minuto;     // 0 - 59
    private int segundo;    // 0 - 59
    
    //El constructor de Tiempo1 inicializa cada variable de instancia en cero
    //se asegura de que cada objeto Tiempo1 inicie en un estado consistente
    public Tiempo1(){
        establecerHora( 0, 0,0 );
    }
    
    //establecer un nuevo valor de tiempo utilizando hora universal, realizar
    //comprobaciones de valides en los datos, establecer valores invalidos en cero
    
    public void establecerHora(int h, int m, int s ){
        hora = (( h >= 0 && h < 24) ?h : 0);
        minuto = (( m >= 0 && m < 60) ?m : 0);
        segundo = (( s >= 0 && m < 60) ?s : 0);
    }
    
    //convertir a String en formato de hora universal
    public String aStringUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return dosDigitos.format(hora) + ":" + dosDigitos.format(minuto) + ":" + dosDigitos.format(segundo);
    }
    
    //convertir a String en formato de hora estandar
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return ((hora == 12 || hora ==0) ?12 : hora % 12) + ":" + dosDigitos.format(minuto) + ":" + dosDigitos.format(segundo) 
        + (hora < 12 ? " AM" : " PM"); 
    }
}//fin de la clase Tiempo1
