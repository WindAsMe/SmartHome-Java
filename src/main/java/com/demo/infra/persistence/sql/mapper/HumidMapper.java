package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.HumidModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author     : WindAsMe
 * File       : HumidMapper.java
 * Time       : Create on 18-7-26
 */
@Mapper
public interface HumidMapper {

    void setHumidData(@Param("humid") Float humid);

    HumidModel getHumidDataLatest();
    int deleteHumidData();
}
