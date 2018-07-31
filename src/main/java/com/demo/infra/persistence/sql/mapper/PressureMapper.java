package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.PressureModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author     : WindAsMe
 * File       : PressureMapper.java
 * Time       : Create on 18-7-26
 */
@Mapper
public interface PressureMapper {

    void setPressureMapperData(@Param("pressure") Float pressure);

    PressureModel getPressureDataLatest();
    int deletePressureData();
}
