
package com.mycompany.proyectobd.Logica;

import com.mycompany.proyectobd.Persistencia.ControladoraPersistencia;
import com.mycompany.proyectobd.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
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
 
    public List<Estudiante> traerEstudiantes() { 
        return control.traerEstudiantes(); 
    }
    
    public void eliminarEstudiante(int id) throws NonexistentEntityException { 
        control.eliminarEstudiante(id); 
    }

    public Estudiante buscarEstudiante(int idEstudiante) {
        return control.buscarEstudiante(idEstudiante); 
    }

    public void modificarEstudiante(Estudiante estudiante, String nombreEstudiante, String apellidoEstudiante, String generoEstudiante) throws Exception {
        
        estudiante.setNombre(nombreEstudiante);
        estudiante.setApellido(apellidoEstudiante);
        estudiante.setGenero(generoEstudiante);
        
        control.modificarEstudiante(estudiante); 
    }
}
