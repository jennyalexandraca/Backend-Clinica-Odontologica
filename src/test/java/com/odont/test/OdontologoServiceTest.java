package com.odont.test;

import com.odont.controller.OdontologoController;
import com.odont.repository.OdontologoRepository;
import com.odont.service.OdontologoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

/*
@SpringBootTest
class OdontologoServiceTest {

    private int ID_TEST;
    private int MATRICULA_TEST;
    private String NOMBRE_TEST;
    private String APELLIDO_TEST;

    @BeforeEach
    void setUp() {
        ID_TEST = 1;
        MATRICULA_TEST = 234;
        NOMBRE_TEST = "Ramiro";
        APELLIDO_TEST = "Calle";
    }

    //Optional es un método que nos permite manejar los null
    @Test
    public void controladorOdontologo(){
        Optional<OdontologoController> odontologo = Optional.empty();
        assertFalse(odontologo.isPresent());
    }

    @Test
    void guardar() {
        OdontologoService odontologoServiceTest = new OdontologoService(new OdontologoRepository());
        //OdontologoDto odontologoDtoTest = odontologoServiceTest.guardar();
        //Assert.assertNotNull(odontologoDtoTest);
    }

    @Test
    void listar() {
        OdontologoService odontologoServiceTest = new OdontologoService(new OdontologoRepository());
        //OdontologoDto odontologoDtoTest = odontologoServiceTest.listar(1);
        //Assert.assertNotNull(odontologoDtoTest);
    }

    @Test
    void eliminar() {
        OdontologoService odontologoServiceTest = new OdontologoService(new OdontologoRepository());
        //String odontologoEliminado = odontologoServiceTest.eliminar(1);
        //Assert.assertNotNull(odontologoEliminado);
        //Assert.assertTrue(odontologoEliminado == "204");
    }

    @Test
    void actualizar() {
        OdontologoService odontologoServiceTest = new OdontologoService(new OdontologoRepository());
        //OdontologoDto odontologoDtoTest = odontologoServiceTest.actualizar(new odontologoDtoTest(1, 1234, "Jorge", "Lalinde"));
        //Assert.assertNotNull(odontologoDtoTest);
    }


}

 */
