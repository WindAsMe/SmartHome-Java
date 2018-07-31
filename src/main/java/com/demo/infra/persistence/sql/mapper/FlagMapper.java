package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.FlagModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface FlagMapper {

    void setFlagData(@Param("flag") int flag);

    FlagModel getFlagDataLatest();
}
