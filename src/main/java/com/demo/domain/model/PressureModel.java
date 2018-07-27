package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : PressureModel.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/PressureModel.java
 */
public class PressureModel {

    private int id;
    private Float pressure;

    public PressureModel(int id, float pressure) {
        this.id = id;
        this.pressure = pressure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "PressureModel{" +
                "id=" + id +
                ", pressure=" + pressure +
                '}';
    }
}
