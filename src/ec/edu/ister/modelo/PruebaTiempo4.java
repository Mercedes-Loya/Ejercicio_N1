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
// Demostracion de los metodos establecer y obtener de la clase Tiempo3

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class PruebaTiempo4 extends JApplet implements ActionListener {
    private Tiempo3 tiempo;
    
    private jLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
    private jTextField horaCampo, minutoCampo, segundoCampo, pantallaCampo;
    private jButton ticBoton;
    
    //crear objetos Tiempo3 y configurar GUI
    public void init(){
        tiempo = new Tiempo3(); //crear objeto Tiempo3
        
        //obtener el panel de contenido del applet y cambiar esquema a FlowLayout
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        //configurar horaEtiqueta y horaCampo
        horaEtiqueta = new JLabel("Establecer hora");
        horaCampo = new JTextField(10);
        contenedor.add(horaEtiqueta);
        contenedor.add(horaCampo);
        
        //configurar minutoEtiqueta y minutoCampo
        minutoEtiqueta = new JLabel("Establecer minuto");
        minutoCampo = new JTextField(10);
        contenedor.add(minutoEtiqueta);
        contenedor.add(minutoCampo);
        
        //configurar segundoEtiqueta y segundoCampo
        segundoEtiqueta = new JLabel("Establecer segundo");
        segundoCampo = new JTextField(10);
        contenedor.add(segundoEtiqueta);
        contenedor.add(segundoCampo);
        
        //configurar pantallaCampo
        pantallaCampo = new JTextField(30);
        pantallaCampo.setEditable(false);
        contenedor.add(pantallaCampo);
        
        //configurar ticBoton
        ticBoton = new JButton("Agregar 1 a Segundo");
        contenedor.add(ticBoton);
        
        //registrar los manejadores de eventos, ese applet es el ActionListener
        //el cual contiene el metodo actionPerformed que sera llamdo para
        //mantener los eventos generados por horaCampo, minutoCampo, segundoCampo y ticBoton
        horaCampo.addActionListener(this);
        minutoCampo.addActionListener(this);
        segundoCampo.addActionListener(this);
        ticBoton.addActionListener(this);
        
        mostrarHora(); //actualizar texto en pantallaCampo y barra de estado
    } //fin del metodo init
    
    //manejador de eventos para los eventosd el boton y campo de texto
    public void actionPerformed(ActionEvent evento){
        //procesar evento en ticBoton
        if (evento.getSource() == ticBoton)
            tic();
        //procesar evento de horaCampo
        else if (evento.getSource() == horaCampo){
            tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
            horaCampo.setText("");
        }
        
        //procesar evento de minutoCampo
        else if (evento.getSource() == minutoCampo){
            tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
            minutoCampo.setText("");
        }
        
        //procesar evento de segundoCampo
        else if (evento.getSource() == segundoCampo){
            tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
            segundoCampo.setText("");
        }
        
        mostrarHora(); //actualizar texto en pantallaCampo y barra de estado
    }// fin del metodo actionPerformed
    
    //actualizar pantallaCampo y barra de estado del contenedor de applets
    public void mostrarHora(){
        pantallaCampo.setText("Hora: "+tiempo.obtenerHora()+
                "; Minuto: "+ tiempo.obtenerMinuto()+
                ": Segundo: "+ tiempo.obtenerSegundo());
        showStatus("La hora estandar es: " + tiempo.aStingEstandar()+
                "; la hora universal es: "+ tiempo.aStingUniversal());
    }// fin del metodo mostrarHora
    
    //sumar uno al segundo y actualizar la hora/minuto si es necesario
    public void tic(){
        tiempo.establecerSegundo((tiempo.obtenerSegundo() + 1) % 60);
        
        if (tiempo.obtenerSegundo() == 0) {
            tiempo.establecerMinuto((tiempo.obtenerMinuto() + 1) % 60);
            if (tiempo.obtenerMinuto() == 0) {
                tiempo.establecerHora((tiempo.obtenerHora() + 1) % 24);
                
            }
        }
    }//fin del metodo tic
}// fin de la clase PruebaTiempo4
