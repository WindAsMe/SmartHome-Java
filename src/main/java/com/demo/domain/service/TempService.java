package com.demo.domain.service;

import com.demo.domain.model.TempModel;
import com.demo.infra.persistence.sql.mapper.TempMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author     : WindAsMe
 * File       : TempMapper.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/TempMapper.java
 */
@Service
public class TempService {

    @Resource
    private TempMapper tempMapper;

    public TempModel getTempDataLatest() {
        return this.tempMapper.getTempDataLatest();
    }

    public int deleteTempData() {
        return this.tempMapper.deleteTempData();
    }
}
