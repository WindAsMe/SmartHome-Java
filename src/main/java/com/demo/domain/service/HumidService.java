package com.demo.domain.service;

import com.demo.domain.model.HumidModel;
import com.demo.infra.persistence.sql.mapper.HumidMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author     : WindAsMe
 * File       : humidService.java
 * Time       : Create on 18-7-26
 */
@Service
public class HumidService {

    @Resource
    private HumidMapper humidMapper;

    public HumidModel getHumidDataLatest() {
        return this.humidMapper.getHumidDataLatest();
    }

    public int deleteHumidData() {
        return this.humidMapper.deleteHumidData();
    }
}
