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
//Declaracion de la clase Tiempo3 con metodos establecer y obtener

import java.text.DecimalFormat;

public class Tiempo3 {
    private int hora;       // 0 - 23
    private int minuto;     // 0 - 59
    private int segundo;    // 0 - 59
    
    //El constructor de Tiempo3 inicializa cada variable de instancia en cero
    //se asegura de que cada objeto Tiempo3 inicie en un estado consistente
    public Tiempo3(){
        this(0,0,0); //Invoca al constructor de Tiempo3 con tres argumentos
    }
    
    //Constructor de Tiempo3, se proporciona hora, minuto y segundo con valor predeterminado de 0
    public Tiempo3(int h){
        this(h,0,0); //Invoca al constructor de Tiempo3 con tres argumentos
    }
    
    //Constructor de Tiempo3, se proporciona hora y minuto, segundo con valor predeterminado de 0
    public Tiempo3(int h, int m){
        this(h,m,0); //Invoca al constructor de Tiempo3 con tres argumentos
    }
    
    //Constructor de Tiempo3, se proporciona hora, minuto y segundo
    public Tiempo3(int h, int m, int s){
        establecerHora(h,m,s); //invoca a establecerHora para validar la hora
    }
    
    //Constructor de Tiempo3 se proporciona otro objeto Tiempo2
    public Tiempo3(Tiempo3 tiempo){
        //invocar al constructor Tiempo3 con tres argumentos
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo());
    }
    
    //Metodo establecer
    //establecer un nuevo valor de tiempo utilizando la hora universal, realizar
    //comprobaciones de validez en los datos; establecer valores invalidos en cero
    
    public void establecerHora(int h, int m, int s){
        establecerHora(h);              //establecer la hora
        establecerMinuto(m);            //establecer el minuto
        establecerSegundo(s);           //establecer el segundo
    }
    
    //validar y establecer la hora
    public void establecerHora(int h){
        hora = ((h >= 0 && h < 24) ?h : 0);
    }
    
    //validar y establecer minuto
    public void establecerMinuto(int m){
        minuto = ((m >= 0 && m < 60) ?m : 0);
    }
    
    //validar y establecer segundo
    public void establecerSegundo(int s){
        segundo = ((s >= 0 && s < 60) ?s : 0);
    }
    
    //Metodos obtener
    //obtener el valor de hora
    public int obtenerHora(){
        return hora;
    }
    
    //obtener el valor de minuto
    public int obtenerMinuto(){
        return minuto;
    }
    
    //obtener el valor de segundo
    public int obtenerSegundo(){
        return segundo;
    }
    
    //convertir a String en formato de hora universal
    public String aStingUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return dosDigitos.format(obtenerHora()) + ":" +
                dosDigitos.format(obtenerMinuto()) + ":" +
                dosDigitos.format(obtenerSegundo());
    }
    
    //convertir a String en formato de hora estandar
    public String aStingEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        
        return ((obtenerHora() == 12 || obtenerHora() == 0) ?12 : obtenerHora()%12) + ":" 
                + dosDigitos.format(obtenerSegundo())
                + ":" + dosDigitos.format(obtenerSegundo()) 
                + (obtenerHora() < 12 ?" AM" : " PM");
    }
}//fin de la clase Tiempo3
