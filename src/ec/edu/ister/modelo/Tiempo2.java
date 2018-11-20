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
//Declaracion de la clase Tiempo2 con constructores sobrecargads

import java.text.DecimalFormat;

public class Tiempo2 {
    private int hora;       // 0 - 23
    private int minuto;     // 0 - 59
    private int segundo;    // 0 - 59
    
    //El constructor de Tiempo2 inicializa cada variable de instancia en cero
    //se asegura de que cada objeto Tiempo2 inicie en un estado consistente
    public Tiempo2(){
        this(0,0,0); //Invoca al constructor de Tiempo2 con tres argumentos
    }
    
    //Constructor de Tiempo2, se proporciona hora, minuto y segundo con valor predeterminado de 0
    public Tiempo2(int h){
        this(h,0,0); //Invoca al constructor de Tiempo2 con tres argumentos
    }
    
    //Constructor de Tiempo2, se proporciona hora y minuto, segundo con valor predeterminado de 0
    public Tiempo2(int h, int m){
        this(h,m,0); //Invoca al constructor de Tiempo2 con tres argumentos
    }
    
    //Constructor de Tiempo2, se proporciona hora, minuto y segundo
    public Tiempo2(int h, int m, int s){
        establecerHora(h,m,s); //invoca a establecerHora para validar la hora
    }
    
    //Constructor de Tiempo2 se proporciona otro objeto Tiempo2
    public Tiempo2(Tiempo2 tiempo){
        //invocar al constructor Tiempo2 con tres argumentos
        this(tiempo.hora,tiempo.minuto,tiempo.segundo);
    }
    
    //establecer un nuevo valor de tiempo utilizando la hora universall, realizar
    //comprobaciones de validez en los datos; establecer valores invalidos en cero
    
    public void establecerHora(int h, int m, int s){
        hora = ((h >= 0 && h < 24) ?h : 0);
        minuto = ((m >= 0 && h < 60) ?m : 0);
        segundo = ((s >= 0 && s < 60) ?s : 0);
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
}//fin de la clase Tiempo2
