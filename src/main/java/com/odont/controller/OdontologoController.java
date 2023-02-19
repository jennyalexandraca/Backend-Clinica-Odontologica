package com.odont.controller;

import com.odont.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.odont.dto.OdontologoDto;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private OdontologoService odontologoService;

    // URI Final: "/odontologos"
    @PostMapping("/guardar")
    public ResponseEntity<String> registrarOdontologo(@RequestBody OdontologoDto odontologoDto) {
        ResponseEntity<String> responseEntity = null;
        if (odontologoService.guardar(odontologoDto).isPresent()) {
            responseEntity = ResponseEntity.ok("El odontologo se guardo exitosamente");
        } else {
            responseEntity = ResponseEntity.internalServerError().body("No se pude registrar al odontologo");
        }
        return responseEntity;
    }

    // URI Final: "/odontologos"
    @PutMapping()
    //@PutMapping(value = "/odontologos/update)
    public ResponseEntity<OdontologoDto> actualizarOdontologo(@RequestBody OdontologoDto odontologoDto) {
        return ResponseEntity.ok(odontologoService.actualizar(odontologoDto.getMatricula()));
    }

    // URI Final: "/odontologos/{matricula}"
    @GetMapping("/{matricula}")
    public ResponseEntity<OdontologoDto> buscarOdontologoPorMatricula(@PathVariable Long matricula) {
        return Optional.ofNullable(odontologoService.listar(matricula))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // URI Final: "/odontologos"
    @GetMapping()
    public ResponseEntity<List<OdontologoDto>> buscarTodosOdontologos() {
        return ResponseEntity.ok(odontologoService.buscarTodos());
    }

    // URI Final: "/odontologos/{matricula}"
    @DeleteMapping("/{matricula}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable Long matricula) {
        return Optional.ofNullable(odontologoService.eliminar(matricula))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


}