package smarthome.demo.api.response;

/**
 * Author     : WindAsMe
 * File       : Response.java
 * Time       : Create on 18-7-25
 * Location   : ../Home/JavaForLeeCode/Response.java
 */
import java.util.HashMap;
import java.util.Map;

public class Response {
    private RespMeta meta;
    private Map<String, Object> data;

    public Response addData(String name, Object object) {
        if (data == null) {
            data = new HashMap<>();
        }
        data.put(name, object);
        return this;
    }

    public RespMeta getMeta() {
        return meta;
    }

    public void setMeta(RespMeta meta) {
        this.meta = meta;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
