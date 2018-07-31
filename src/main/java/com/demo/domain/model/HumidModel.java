package com.demo.domain.model;

/**
 * Author     : WindAsMe
 * File       : HumidModel.java
 * Time       : Create on 18-7-26
 */
public class HumidModel {

    private int id;
    private Float humid;
    private String time;

    public HumidModel(int id, Float humid, String time) {
        this.id = id;
        this.humid = humid;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getHumid() {
        return humid;
    }

    public void setHumid(Float humid) {
        this.humid = humid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HumidModel{" +
                "id=" + id +
                ", humid=" + humid +
                ", time='" + time + '\'' +
                '}';
    }
}
