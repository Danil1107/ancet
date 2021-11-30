package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="anqs")
public class AnQsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String qtext;
    private String atext1;
    private String atext2;
    private String atext3;
    private String atext4;
    private String atext5;
    private int anid;
    public AnQsModel(){super();}

    public AnQsModel(int aid, String qtext, String atext1, String atext2, String atext3, String atext4, String atext5, int anid) {
        this.aid = aid;
        this.qtext = qtext;
        this.atext1 = atext1;
        this.atext2 = atext2;
        this.atext3 = atext3;
        this.atext4 = atext4;
        this.atext5 = atext5;
        this.anid = anid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getQtext() {
        return qtext;
    }

    public void setQtext(String qtext) {
        this.qtext = qtext;
    }

    public String getAtext1() {
        return atext1;
    }

    public void setAtext1(String atext1) {
        this.atext1 = atext1;
    }

    public String getAtext2() {
        return atext2;
    }

    public void setAtext2(String atext2) {
        this.atext2 = atext2;
    }

    public String getAtext3() {
        return atext3;
    }

    public void setAtext3(String atext3) {
        this.atext3 = atext3;
    }

    public String getAtext4() {
        return atext4;
    }

    public void setAtext4(String atext4) {
        this.atext4 = atext4;
    }

    public String getAtext5() {
        return atext5;
    }

    public void setAtext5(String atext5) {
        this.atext5 = atext5;
    }

    public int getAnid() {
        return anid;
    }

    public void setAnid(int anid) {
        this.anid = anid;
    }

    @Override
    public String toString() {
        return "AnQsModel{" +
                "aid=" + aid +
                ", qtext='" + qtext + '\'' +
                ", atext1='" + atext1 + '\'' +
                ", atext2='" + atext2 + '\'' +
                ", atext3='" + atext3 + '\'' +
                ", atext4='" + atext4 + '\'' +
                ", atext5='" + atext5 + '\'' +
                ", anid=" + anid +
                '}';
    }
}
