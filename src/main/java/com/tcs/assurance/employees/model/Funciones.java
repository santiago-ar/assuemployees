package com.tcs.assurance.employees.model;

import javax.persistence.*;
@Entity
public class Funciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfunciones;
    private String nombre;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="iddepartamento")
    private Departamento iddepartamento;

    public Funciones(Integer idfunciones, String nombre) {
        this.idfunciones = idfunciones;
        this.nombre = nombre;

    }

    public Integer getIdfunciones() {
        return idfunciones;
    }

    public void setIdfunciones(Integer idfunciones) {
        this.idfunciones = idfunciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Departamento iddepartamento) {
        this.iddepartamento = iddepartamento;
    }
}
