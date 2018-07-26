package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : HumidModel.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/HumidModel.java
 */
public class HumidModel {

    private int id;
    private Float humid;

    public HumidModel(int id, float humid) {
        this.id = id;
        this.humid = humid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHumid() {
        return humid;
    }

    public void setHumid(float humid) {
        this.humid = humid;
    }

}
