package com.tcs.assurance.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
