package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.PressureModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author     : WindAsMe
 * File       : PressureMapper.java
 * Time       : Create on 18-7-26
 */
@Mapper
public interface PressureMapper {

    PressureModel getPressureDataLatest();
    int deletePressureData();
}
