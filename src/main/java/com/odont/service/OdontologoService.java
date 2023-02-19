package com.odont.service;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.odont.dto.OdontologoDto;
import com.odont.model.Odontologo;
import com.odont.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(OdontologoService.class);
    @Autowired
    private OdontologoRepository odontologoRepository;

    final ObjectMapper mapper = new ObjectMapper();

    public Optional<Odontologo> guardar (OdontologoDto odontologoDto){
        Odontologo odontologo = mapper.convertValue(odontologoDto, Odontologo.class);
        logger.debug("Guardando nuevo odontologo");
        return Optional.of(odontologoRepository.saveAndFlush(odontologo));
    }


    public String eliminar(Long matricula){
        List<Odontologo> odontologoList = odontologoRepository.findAll();
        if(odontologoRepository.findById(matricula).isPresent()){
            odontologoRepository.deleteById(matricula);
            logger.debug("Eliminando odontologo");
            return "Odontologo con matricula " + matricula + " eliminado";
        } else {
            logger.info("No se puede eliminar odontologo");
            return "No se pudo eliminar al odontólogo con matricula " + matricula;
        }
    }

    public OdontologoDto actualizar( Long matricula){

       OdontologoDto odontologoDto = null;
        List<OdontologoDto> odontologoDtoList = this.buscarTodos();
            for(OdontologoDto odonDto:odontologoDtoList) {
                if (odonDto.getMatricula().equals(matricula)) {
                    //odontologoDto = this.guardar();
                }
            }
        logger.debug("Actualizando odontologo");
        return odontologoDto;

    }

    public OdontologoDto listar(Long matricula){
        OdontologoDto odontologoDto = null;
        List<OdontologoDto> odontologoDtoList = this.buscarTodos();
        for(OdontologoDto odonDto:odontologoDtoList){
            if (odonDto.getMatricula().equals(matricula)){
                logger.debug("Listando odontologo");
                odontologoDto = odonDto;
            }
        }
        return odontologoDto;
    }

    public List<OdontologoDto> buscarTodos(){
        List<Odontologo> odontologoList = odontologoRepository.findAll();
        List<OdontologoDto> odontologoDtoList = new ArrayList<>();
        for (Odontologo odontologo: odontologoList){
            odontologoDtoList.add(mapper.convertValue(odontologo,OdontologoDto.class));
        }
        logger.debug("Buscando todos los odontologos");
        return odontologoDtoList;
    }












}