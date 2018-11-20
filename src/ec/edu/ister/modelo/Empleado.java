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
//declaracion de la clase Empleado

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    
    //constructor para inicializar nombre, fecha de nacimineto y de contratacion
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion){
        primerNombre=nombre;
        apellidoPaterno=apellido;
        fechaNacimiento=fechaDeNacimiento;
        fechaContratacion=fechaDeContratacion;
    }
    
    //convertir Empleado a formato de String
    public String aStringEmpleado(){
        return apellidoPaterno + ", " + primerNombre + " Contratado: "+
                fechaContratacion.aStringFecha() + " Fecha de nacimiento: "+
                fechaNacimiento.aStringFecha();
    }
}//fin de la clase Empleado

