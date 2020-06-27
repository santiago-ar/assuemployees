package com.tcs.assurance.employees.model;

import javax.persistence.*;

@Entity
public class Empleado {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    @Column(name = "numerodocumento", length = 20, nullable = false)
    private String numerodocumento;


    private String correo;
    private String telefono;
    private Boolean activo;
    private double salario;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="iddepartamento")
    private Departamento iddepartamento;

    public Empleado() {
    }

    public Empleado(Integer idempleado, String nombre, String numeroDocumento, String correo, String telefono, Boolean activo, double salario, Departamento iddepartamento) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.numerodocumento = numeroDocumento;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
        this.salario = salario;
        this.iddepartamento = iddepartamento;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numerodocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numerodocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Departamento iddepartamento) {
        this.iddepartamento = iddepartamento;
    }
}
