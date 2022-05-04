package com.projectExam.ExamenFinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegLibros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameChild;
    private String librosLeidos;
    private int cantLibrosLeidos;

    public RegLibros() {
    }

    public RegLibros(Long id, String nameChild, String librosLeidos, int cantLibrosLeidos) {
        this.id = id;
        this.nameChild = nameChild;
        this.librosLeidos = librosLeidos;
        this.cantLibrosLeidos = cantLibrosLeidos;
    }

    public RegLibros(Long id, String nameChild, String librosLeidos) {
        this.id = id;
        this.nameChild = nameChild;
        this.librosLeidos = librosLeidos;
    }

    public RegLibros(Long id, String nameChild, int cantLibrosLeidos) {
        this.id = id;
        this.nameChild = nameChild;
        this.cantLibrosLeidos = cantLibrosLeidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameChild() {
        return nameChild;
    }

    public void setNameChild(String nameChild) {
        this.nameChild = nameChild;
    }

    public String getLibrosLeidos() {
        return librosLeidos;
    }

    public void setLibrosLeidos(String librosLeidos) {
        this.librosLeidos = librosLeidos;
    }

    public int getCantLibrosLeidos() {
        return cantLibrosLeidos;
    }

    public void setCantLibrosLeidos(int cantLibrosLeidos) {
        this.cantLibrosLeidos = cantLibrosLeidos;
    }
}
