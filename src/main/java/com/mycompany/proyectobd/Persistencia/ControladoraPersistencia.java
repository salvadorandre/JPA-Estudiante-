
package com.mycompany.proyectobd.Persistencia;

import com.mycompany.proyectobd.Logica.Estudiante;
import com.mycompany.proyectobd.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    EstudianteJpaController estudianteJPA = new EstudianteJpaController(); 
    
    
    public void guardar(Estudiante estudiante) { 
        estudianteJPA.create(estudiante);
    }

    public List<Estudiante> traerEstudiantes() {
        
        return estudianteJPA.findEstudianteEntities(); 
    }

    public void eliminarEstudiante(int id) throws NonexistentEntityException {
        estudianteJPA.destroy(id);
    }

    public Estudiante buscarEstudiante(int idEstudiante) {
        return estudianteJPA.findEstudiante(idEstudiante); 
    }

    public void modificarEstudiante(Estudiante estudiante) throws Exception {
        
        estudianteJPA.edit(estudiante);
    }


    
}
