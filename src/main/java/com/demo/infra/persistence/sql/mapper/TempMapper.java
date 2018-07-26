package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.TempModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author     : WindAsMe
 * File       : TempMapper.java
 * Time       : Create on 18-7-26
 * Location   : ../Home/JavaForLeeCode/TempMapper.java
 */
@Mapper
public interface TempMapper {

    TempModel getTempDataLatest();
    int deleteTempData();
}
