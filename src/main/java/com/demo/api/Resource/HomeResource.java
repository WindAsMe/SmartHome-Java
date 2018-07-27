package com.demo.api.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author     : WindAsMe
 * File       : HomeResource.java
 * Time       : Create on 18-7-27
 */
@RestController
public class HomeResource {

    @GetMapping("/home")
    public void HomeControl(@RequestParam("flag") Integer flag) {
        if (flag == 1) {
            // TODO: Send Raspberry to turn on Air
            System.out.println("Send Raspberry to turn on Air");
        }
        if (flag == 2) {
            // TODO: Send Raspberry to turn off Air
            System.out.println("Send Raspberry to turn off Air");
        }
        if (flag == 3) {
            // TODO: Send Raspberry to turn on Light
            System.out.println("Send Raspberry to turn on Light");
        }
        if (flag == 4) {
            // TODO: Send Raspberry to turn off Light
            System.out.println("Send Raspberry to turn off Light");
        }
    }
}
