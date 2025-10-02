
package com.mycompany.proyectobd.Persistencia;

import com.mycompany.proyectobd.Logica.Estudiante;

public class ControladoraPersistencia {
    
    EstudianteJpaController estudianteJPA = new EstudianteJpaController(); 
    
    
    public void guardar(Estudiante estudiante) { 
        estudianteJPA.create(estudiante);
    }
    
}
