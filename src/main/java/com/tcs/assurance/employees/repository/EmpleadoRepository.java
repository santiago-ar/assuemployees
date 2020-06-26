package com.tcs.assurance.employees.repository;

import com.tcs.assurance.employees.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
}
