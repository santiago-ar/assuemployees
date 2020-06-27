package com.tcs.assurance.employees.controller;


import com.tcs.assurance.employees.model.Empleado;
import com.tcs.assurance.employees.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> listAll(){
        return empleadoService.listAll();
    }
}
