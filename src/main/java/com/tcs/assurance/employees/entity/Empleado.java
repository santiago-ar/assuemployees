package com.tcs.assurance.employees.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    private String apellidos;
    @Column(name = "numerodocumento", length = 20, nullable = false)
    private String numerodocumento;

    private String correo;
    private String telefono;
    private Boolean activo;
    private double salario;

    //DistintosEmpleados pueden tener un departamento
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name="iddepartamento")
    private Departamento iddepartamento;
    //Un empleado puede tener muchas funciones
    @OneToMany(mappedBy="idfunciones")
    private List<Funciones> listaFunciones;

    public Empleado() {
    }

    public Empleado(Integer idempleado, String nombre, String apellidos, String numerodocumento, String correo, String telefono, Boolean activo, double salario, Departamento iddepartamento, List<Funciones> listaFunciones) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numerodocumento = numerodocumento;
        this.correo = correo;
        this.telefono = telefono;
        this.activo = activo;
        this.salario = salario;
        this.iddepartamento = iddepartamento;
        this.listaFunciones = listaFunciones;
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

    public List<Funciones> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(List<Funciones> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
