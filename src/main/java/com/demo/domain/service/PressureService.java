package com.demo.domain.service;

import com.demo.domain.model.PressureModel;
import com.demo.infra.persistence.sql.mapper.PressureMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author     : WindAsMe
 * File       : PressureService.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/PressureService.java
 */
@Service
public class PressureService {

    @Resource
    private PressureMapper pressureMapper;

    public PressureModel getPressureDataLatest() {
        return this.pressureMapper.getPressureDataLatest();
    }

    public int deletePressureData() {
        return this.pressureMapper.deletePressureData();
    }
}