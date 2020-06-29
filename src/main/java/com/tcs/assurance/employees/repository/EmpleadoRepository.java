package com.tcs.assurance.employees.repository;

import com.tcs.assurance.employees.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {

    Empleado findByNumerodocumento(String numerodocumento);
}
