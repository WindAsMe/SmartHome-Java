package com.demo.domain.model;

public class ApiModel {

    private int id;
    private boolean flag;
    private boolean isRead;

    public ApiModel() {
    }

    public ApiModel(int id, boolean flag, boolean isRead) {
        this.id = id;
        this.flag = flag;
        this.isRead = isRead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }


    @Override
    public String toString() {
        return "ApiModel{" +
                "id=" + id +
                ", flag=" + flag +
                ", isRead=" + isRead +
                '}';
    }
}
