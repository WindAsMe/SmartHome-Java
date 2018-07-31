package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.TempModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Author     : WindAsMe
 * File       : TempMapper.java
 * Time       : Create on 18-7-26
 */
@Mapper
public interface TempMapper {

    void setTempMapperData(@Param("temp") Float temp);

    TempModel getTempDataLatest();
    int deleteTempData();
}
