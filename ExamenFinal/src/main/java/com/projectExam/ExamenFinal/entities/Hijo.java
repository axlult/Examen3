package com.projectExam.ExamenFinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hijo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String Plan;
    private String alergias; 
    private String Encargado;

    public Hijo() {
    }

    public Hijo(Long id, String name, String Plan, String alergias, String encargado) {
        this.id = id;
        this.name = name;
        this.Plan = Plan;
        this.alergias = alergias;
        Encargado = encargado;
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

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String plan) {
        this.Plan = plan;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String encargado) {
        Encargado = encargado;
    }
}
