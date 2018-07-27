package com.demo.api.Resource;

import com.demo.api.response.Response;
import com.demo.api.response.Responses;
import com.demo.domain.model.HumidModel;
import com.demo.domain.model.PressureModel;
import com.demo.domain.model.TempModel;
import com.demo.domain.service.HumidService;
import com.demo.domain.service.PressureService;
import com.demo.domain.service.TempService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

/**
 * Author     : WindAsMe
 * File       : TestResource.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/TestResource.java
 */
@RestController
public class TestResource {

    @Resource
    private HumidService humidService;
    @Resource
    private PressureService pressureService;
    @Resource
    private TempService tempService;

    private final static Logger logger = LoggerFactory.getLogger(TestResource.class);

    @GetMapping("/humid")
    public Response GetHumidData() {
        // System.out.println("humid");
        HashMap<String, String> map = new HashMap<>();
        HumidModel model = this.humidService.getHumidDataLatest();
        if (model != null) {
            logger.info("invoke GET /humid {}", model.toString());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());
            map.put("id", String.valueOf(model.getId()));
            map.put("humid", String.valueOf(model.getHumid()));
            map.put("time", time);
            return Responses.successResponse(map);
        }
        return Responses.errorResponse("数据为空");
    }

    @GetMapping("/temp")
    public Response GetTempData() {
        // System.out.println("temp");
        HashMap<String, String> map = new HashMap<>();
        TempModel model = this.tempService.getTempDataLatest();
        if (model != null) {
            logger.info("invoke GET /temp {}", model.toString());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());
            map.put("id", String.valueOf(model.getId()));
            map.put("temp", String.valueOf(model.getTemp()));
            map.put("time", time);
            return Responses.successResponse(map);
        }
        return Responses.errorResponse("数据为空");
    }

    @GetMapping("/press")
    public Response GetPressureData() {
        // System.out.println("pressure");
        HashMap<String, String> map = new HashMap<>();
        PressureModel model = this.pressureService.getPressureDataLatest();
        if (model != null) {
            logger.info("invoke GET /press {}", model.toString());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(System.currentTimeMillis());
            map.put("id", String.valueOf(model.getId()));
            map.put("press", String.valueOf(model.getPressure()));
            map.put("time", time);
            return Responses.successResponse(map);
        }
        return Responses.errorResponse("数据为空");
    }

    @GetMapping("/all")
    public Response GetAllData (){
        // System.out.println("all");
        HashMap<String, String> map = new HashMap<>();
        HumidModel model1 = this.humidService.getHumidDataLatest();
        TempModel model2 = this.tempService.getTempDataLatest();
        PressureModel model3 = this.pressureService.getPressureDataLatest();
        if (model1 != null && model2 != null && model3 != null) {
            logger.info("invoke GET /all {}",
                    "humid: " + model1.toString()
                            + " temp: " + model2.toString()
                            + " press: " + model3.toString());
            map.put("humid", String.valueOf(model1.getHumid()));
            map.put("temp", String.valueOf(model2.getTemp()));
            map.put("press", String.valueOf(model3.getPressure()));
            map.put("time", String.valueOf(System.currentTimeMillis()));
            return Responses.successResponse(map);
        }
        return Responses.errorResponse("数据为空");
    }

    // Every month date 15
    // Clear the Database
    @Scheduled(cron = "0 0 0 15 * ?")
    public void delete(){
        this.humidService.deleteHumidData();
        this.pressureService.deletePressureData();
        this.tempService.deleteTempData();
    }
}
