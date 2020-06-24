package com.tcs.assurance.employees.controller;

import com.tcs.assurance.employees.model.Departamento;
import com.tcs.assurance.employees.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartamentoController {
    @Autowired
    private DepartamentoService service;
    @GetMapping("/departamentos")
    public List<Departamento> list(){
        return service.listAll();
    }

    @GetMapping("/departamentos/{id}")
    public Departamento get(@PathVariable Integer id){
        return  service.get(id);
    }
}
