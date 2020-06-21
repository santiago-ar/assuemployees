package com.tcs.assurance.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired //inyeccion del producto
    private DepartamentoRepository repository;

    public List<Departamento> listAll(){
        return repository.findAll();
    }

    public void save(Departamento departamento){
        repository.save(departamento);
    }

    public Departamento get(Integer id){
        return repository.findById(id).get();
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
