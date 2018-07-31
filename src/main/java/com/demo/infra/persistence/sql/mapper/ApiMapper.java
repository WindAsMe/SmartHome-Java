package com.demo.infra.persistence.sql.mapper;

import com.demo.domain.model.ApiModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ApiMapper {

    void setApiData(@Param("flag") Boolean flag, @Param("isRead") Boolean isRead);
    ApiModel getApiDataLatest();
    void updateApiDataLatest(@Param("id") int id);
}
