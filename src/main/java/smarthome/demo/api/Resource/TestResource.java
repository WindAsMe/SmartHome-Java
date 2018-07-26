package smarthome.demo.api.Resource;

import org.springframework.web.bind.annotation.*;
import smarthome.demo.api.response.Response;
import smarthome.demo.api.response.Responses;

import java.util.HashMap;

/**
 * Author     : WindAsMe
 * File       : TestResource.java
 * Time       : Create on 18-7-25
 * Location   : ../Home/JavaForLeeCode/TestResource.java
 */
@RestController
public class TestResource {

    @GetMapping("/test")
    public Response Test(@RequestParam("username") String username,
                         @RequestParam("password") String password) {
        HashMap<String, String> map = new HashMap<>();
        map.put("data", "true");
        System.out.println("here: " + username + ", " + password);
        return Responses.successResponse(map);
    }
}
