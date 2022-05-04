package com.projectExam.ExamenFinalGraphQL.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Entity
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "titule", nullable = false)
    private String titule;
    @Column(name = "author_book")
    private String authorBook;
    @Column(name = "launch_date")
    private LocalDate launchDate;
    private transient String formattedDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFormattedDate() {
        return getLaunchDate().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitule() {
        return titule;
    }

    public void setTitule(String titule) {
        this.titule = titule;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    public Libro(int id, String titule, String authorBook, LocalDate launchDate, String formattedDate) {
        this.id = id;
        this.titule = titule;
        this.authorBook = authorBook;
        this.launchDate = launchDate;
        this.formattedDate = formattedDate;
    }

    public Libro() {
    }
}
