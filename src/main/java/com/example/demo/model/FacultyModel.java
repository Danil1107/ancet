package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="faculties")
public class FacultyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String facul;
    public FacultyModel(){super();}

    public FacultyModel(int id, String facul) {
        this.id = id;
        this.facul = facul;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacul() {
        return facul;
    }

    public void setFacul(String facul) {
        this.facul = facul;
    }

    @Override
    public String toString() {
        return "FacultyModel{" +
                "id=" + id +
                ", facul='" + facul + '\'' +
                '}';
    }
}
