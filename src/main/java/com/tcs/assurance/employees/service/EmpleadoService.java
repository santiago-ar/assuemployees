package com.tcs.assurance.employees.service;


import com.tcs.assurance.employees.model.Empleado;
import com.tcs.assurance.employees.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;


    public List<Empleado> listAll(){
        return empleadoRepository.findAll();
    }

    public void save(Empleado empleado){
        empleadoRepository.save(empleado);
    }
}
