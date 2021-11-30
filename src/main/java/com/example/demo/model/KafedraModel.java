package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="kafedras")
public class KafedraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idk;
    private String ktext;
    private int fk;
    public KafedraModel(){super();}

    public KafedraModel(int idk, String ktext, int fk) {
        this.idk = idk;
        this.ktext = ktext;
        this.fk = fk;
    }

    public int getIdk() {
        return idk;
    }

    public void setIdk(int idk) {
        this.idk = idk;
    }

    public String getKtext() {
        return ktext;
    }

    public void setKtext(String ktext) {
        this.ktext = ktext;
    }

    public int getFk() {
        return fk;
    }

    public void setFk(int fk) {
        this.fk = fk;
    }

    @Override
    public String toString() {
        return "KafedraModel{" +
                "idk=" + idk +
                ", ktext='" + ktext + '\'' +
                ", fk=" + fk +
                '}';
    }
}
