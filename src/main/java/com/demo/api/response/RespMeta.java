package com.demo.api.response;

/**
 * Author     : WindAsMe
 * File       : RespMeta.java
 * Time       : Create on 18-7-25
 */
public class RespMeta {
    private int code = -1;
    private String errorMsg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
