package com.tcs.assurance.employees.controller;


import com.tcs.assurance.employees.entity.Empleado;
import com.tcs.assurance.employees.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> listAll(){
        return empleadoService.listAll();
    }

    //Agregar
    @PostMapping("/empleados")
    public void add(@RequestBody Empleado empleado) {
        empleadoService.save(empleado);
    }


    //PromedioDeSaliaroEmpleadoPorIdDepartamento
    @GetMapping("/empleados/promedioporid/{id}")
    public Double getProm(@PathVariable Integer id){
        return empleadoService.payment(id);
    }

    //Listar por documento de empleado
    @GetMapping("/empleados/{documento}")
    public ResponseEntity<Empleado> get(@PathVariable String documento) {
        try {
            Empleado empleado = empleadoService.findByNumerodocumento(documento);
            return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Empleado>(HttpStatus.NOT_FOUND);
        }
    }

}
