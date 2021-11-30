package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="prepods")
public class PrepodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String ptext;
    private int kk;
    public PrepodModel(){super();}

    public PrepodModel(int pid, String ptext, int kk) {
        this.pid = pid;
        this.ptext = ptext;
        this.kk = kk;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtext() {
        return ptext;
    }

    public void setPtext(String ptext) {
        this.ptext = ptext;
    }

    public int getKk() {
        return kk;
    }

    public void setKk(int kk) {
        this.kk = kk;
    }

    @Override
    public String toString() {
        return "PrepodModel{" +
                "pid=" + pid +
                ", ptext='" + ptext + '\'' +
                ", kk=" + kk +
                '}';
    }
}
