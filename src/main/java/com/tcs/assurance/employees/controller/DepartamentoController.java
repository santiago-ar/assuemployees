package com.tcs.assurance.employees.controller;

import com.tcs.assurance.employees.model.Departamento;
import com.tcs.assurance.employees.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    //Listar Todos
    @GetMapping("/departamentos")
    public List<Departamento> list() {
        return departamentoService.listAll();
    }

    //Listar por id
    @GetMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> get(@PathVariable Integer id) {
        try {
            Departamento departamento = departamentoService.get(id);
            return new ResponseEntity<Departamento>(departamento, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Departamento>(HttpStatus.NOT_FOUND);
        }
    }

    //Agregar
    @PostMapping("/departamentos")
    public void add(@RequestBody Departamento departamento) {
        departamentoService.save(departamento);
    }

    //Actualizar
    @PutMapping("/departamentos/{id}")
    public ResponseEntity<Departamento> update(@RequestBody Departamento departamento, @PathVariable Integer id) {
        try {
            Departamento existeDepartamento = departamentoService.get(id);
            departamentoService.save(departamento);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    //Eliminar
    @DeleteMapping("/departamento/{id}")
    public void delete(@PathVariable Integer id) {
        departamentoService.delete(id);
    }

}
