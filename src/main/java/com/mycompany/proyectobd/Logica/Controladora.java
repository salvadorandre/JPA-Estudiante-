
package com.mycompany.proyectobd.Logica;

import com.mycompany.proyectobd.Persistencia.ControladoraPersistencia;
import javax.swing.JOptionPane;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia(); 
    
    
    public void guardar(String nombre, String apellido, String genero) { 
        
        Estudiante estudiante = new Estudiante(); 
        
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setGenero(genero);
        
        
        control.guardar(estudiante); 
        
        
        JOptionPane.showMessageDialog(null, "El registro fue agregado correctamente");
        
    }
    
    
}
