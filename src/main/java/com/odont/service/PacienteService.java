package com.odont.service;

import com.odont.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    /*

    private RepositoryGenerics<Paciente> pacienteServiceRepositoryGenerics;

    private RepositoryGenerics<Paciente> pacienteRepositoryGenerics;

    public PacienteService(RepositoryGenerics<Paciente> pacienteRepositoryGenerics) {
        this.pacienteRepositoryGenerics = pacienteRepositoryGenerics;
    }

    public Paciente guardar( Paciente paciente){
        // TODO: Validaciones
        pacienteRepositoryGenerics.guardar(paciente);
        return paciente;
    }

    public Paciente listar (Long id){
        return pacienteRepositoryGenerics.listar(id);
    }

    public void eliminar(Long id){
        // TODO: Validaciones
        pacienteRepositoryGenerics.eliminar(id);
    }

    public List<Paciente> buscarTodos(){
        return pacienteRepositoryGenerics.buscarTodos();
    }

    public Paciente actualizar( Paciente paciente){
        // TODO: Validaciones
        return pacienteRepositoryGenerics.actualizar(paciente);
    }


     */

}
