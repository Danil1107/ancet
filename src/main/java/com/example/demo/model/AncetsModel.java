package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="ancets")
public class AncetsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String antext;
    public AncetsModel(){super();}

    public AncetsModel(int id, String antext) {
        this.id = id;
        this.antext = antext;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAntext() {
        return antext;
    }

    public void setAntext(String antext) {
        this.antext = antext;
    }

    @Override
    public String toString() {
        return "AncetsModel{" +
                "id=" + id +
                ", antext='" + antext + '\'' +
                '}';
    }
}
