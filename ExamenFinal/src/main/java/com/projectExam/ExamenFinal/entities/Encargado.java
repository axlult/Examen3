package com.projectExam.ExamenFinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Encargado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cedula;
    private String direccion;
    private String telPrim;
    private String telSec;

    public Encargado() {
    }

    public Encargado(Long id, String name, String cedula, String direccion, String telPrim, String telSec) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telPrim = telPrim;
        this.telSec = telSec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelPrim() {
        return telPrim;
    }

    public void setTelPrim(String telPrim) {
        this.telPrim = telPrim;
    }

    public String getTelSec() {
        return telSec;
    }

    public void setTelSec(String telSec) {
        this.telSec = telSec;
    }
}
