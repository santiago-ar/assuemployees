package com.tcs.assurance.employees.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Como el nombre de la clase es el mismo de la bd  y los campos no se necesita especificar

 */
@Entity
public class Departamento {
    private Integer iddepartamento;
    private String nombre;
    private String descripcion;
    private Integer codigo;

    public Departamento() {
    }

    public Departamento(Integer iddepartamento, String nombre, String descripcion, Integer codigo) {
        super();
        this.iddepartamento = iddepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Integer iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
