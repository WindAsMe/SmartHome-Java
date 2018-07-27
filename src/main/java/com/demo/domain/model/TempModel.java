package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : TempModel.java
 * Time       : Create on 18-7-26
 */
public class TempModel {

    private int id;
    private Float temp;

    public TempModel(int id, float temp) {
        this.id = id;
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "TempModel{" +
                "id=" + id +
                ", temp=" + temp +
                '}';
    }
}
