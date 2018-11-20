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
//declaracion de la clase fecha

public class Fecha {
    private int mes;        //1-12
    private int dia;        //1-31 con base en el mes
    private int anio;       //cualquier año
    
    //constructor: llama a comprobar Mes para confirmar el valor apropiado de mes
    //llama a comprobar Dia para confirmar el valor apropiado de dia
    public Fecha(int elMes, int elDia, int elAnio){
        mes = comprobarMes(elMes);      //validar mes
        anio =elAnio;                   //podria validar anio
        dia = comprobarDia(elAnio);     //validar dia
        
        System.out.println("Constructor de objeto Fecha para la fecha " + aStringFecha());
    }//fin del constructor Fecha
    
    //metodo utilitario para confirmar el valor apropiado del mes
    private int comprobarMes(int mesPrueba){
        if (mesPrueba > 0 && mesPrueba <= 12) {
            return mesPrueba;
        }
        else{ //mes invalido
            System.out.println("Mes invalido (" + mesPrueba+ ") se establece en 1.");
            return 1; //mantener el objeto en estado consistente
        }
    }// fin del metodo comprobarMes
    
    //metodo utilitario para confirmar valor apropiado de dia, con base en mes y anio
    private int comprobarDia(int diaPrueba){
        int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        //comprobar si el dia esta dentro del rango del mes
        if(diaPrueba > 0 && diaPrueba <= diasPorMes[mes])
            return diaPrueba;
        //comprobar si es año bisiesto
        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        }
        
        System.out.println("Dia invalido (" + diaPrueba + ") se establece en 1.");
        return 1; //mantener el objeto en estado consistente
    }// din del metodo comprobarDia
    
    //devolver un String de la forma mes/dia/año
    public String aStringFecha(){
        return mes + "/" + dia+ "/"+anio;
    }
}//fin de la clase Fecha

