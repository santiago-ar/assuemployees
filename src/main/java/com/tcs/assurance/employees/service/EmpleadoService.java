package com.tcs.assurance.employees.service;


import com.tcs.assurance.employees.entity.Empleado;
import com.tcs.assurance.employees.entity.Promedio;
import com.tcs.assurance.employees.repository.EmpleadoRepository;
import com.tcs.assurance.employees.repository.PromedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private PromedioRepository promedioRepository;

    public List<Empleado> listAll(){
        return empleadoRepository.findAll();
    }

    public Double payment(Integer idDepartamento){
        List<Promedio> prom = promedioRepository.findAllById(Collections.singleton(idDepartamento));
        double aux =0;
       for(int i=0;i<prom.size();i++){
            aux=aux+prom.get(i).getSalario();
        }
        return aux/prom.size();
    }

     public void save(Empleado empleado){
        empleadoRepository.save(empleado);
    }


    public  Empleado findByNumerodocumento(String documento){
        return  empleadoRepository.findByNumerodocumento(documento);
    }
}
