package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.HumidModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author     : WindAsMe
 * File       : HumidMapper.java
 * Time       : Create on 18-7-26
 */
@Mapper
public interface HumidMapper {

    HumidModel getHumidDataLatest();
    int deleteHumidData();
}
