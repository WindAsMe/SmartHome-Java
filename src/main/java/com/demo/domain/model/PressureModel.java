package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : PressureModel.java
 * Time       : Create on 18-7-26
 */
public class PressureModel {

    private int id;
    private Float pressure;
    private String time;

    public PressureModel(int id, Float pressure, String time) {
        this.id = id;
        this.pressure = pressure;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PressureModel{" +
                "id=" + id +
                ", pressure=" + pressure +
                ", time='" + time + '\'' +
                '}';
    }
}
