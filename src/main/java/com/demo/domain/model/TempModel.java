package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : TempModel.java
 * Time       : Create on 18-7-26
 */
public class TempModel {

    private int id;
    private Float temp;
    private String time;

    public TempModel(int id, Float temp, String time) {
        this.id = id;
        this.temp = temp;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TempModel{" +
                "id=" + id +
                ", temp=" + temp +
                ", time='" + time + '\'' +
                '}';
    }
}
