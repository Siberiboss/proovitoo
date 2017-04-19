package com.example.jersey;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
/**
 * Created by Jonas on 4/17/2017.
 */

@Entity
@Table(name="data")
public class Data {
    private String data;
    private int uid;

    public Data() {}
    public Data(String data) {
        this.data = data;
    }

    @Column(name="data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "uid", unique = true)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}



