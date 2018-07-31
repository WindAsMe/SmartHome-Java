package com.demo.domain.model;

public class FlagModel {

    private int id;
    private int flag;

    public FlagModel() {
    }

    public FlagModel(int id, int flag) {
        this.id = id;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "FlagModel{" +
                "id=" + id +
                ", flag=" + flag +
                '}';
    }
}
