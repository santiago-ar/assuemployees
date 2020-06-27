package com.tcs.assurance.employees.controller;


import com.tcs.assurance.employees.model.Departamento;
import com.tcs.assurance.employees.model.Empleado;
import com.tcs.assurance.employees.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/empleados/{id}")
    public Double getProm(@PathVariable Integer id){
        return empleadoService.payment(id);
    }


}
