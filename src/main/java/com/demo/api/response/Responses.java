package com.demo.api.response;
import java.util.HashMap;

/**
 * Author     : WindAsMe
 * File       : Responses.java
 * Time       : Create on 18-7-25
 */
public class Responses {

    public static Response successResponse() {
        Response response = new Response();
        RespMeta meta = new RespMeta();
        meta.setCode(0);
        response.setMeta(meta);

        return response;
    }

    public static Response successResponse(HashMap data) {
        Response response = new Response();

        RespMeta meta = new RespMeta();
        meta.setCode(0);
        response.setMeta(meta);

        response.setData(data);
        return response;
    }

    public static Response errorResponse(String errorMsg) {

        RespMeta meta = new RespMeta();
        meta.setCode(1);
        meta.setErrorMsg(errorMsg);

        Response response = new Response();
        response.setMeta(meta);
        return response;
    }
}
