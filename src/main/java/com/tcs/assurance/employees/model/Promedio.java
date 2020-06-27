package com.tcs.assurance.employees.model;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Promedio {

    @Id
    private Integer iddepartamento;
    private double salario;

    public Promedio() {
    }

    public Promedio(Integer iddepartamento, double salario) {
        this.iddepartamento = iddepartamento;
        this.salario = salario;
    }

    public Integer getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
