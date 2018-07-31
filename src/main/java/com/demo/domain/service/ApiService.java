package com.demo.domain.service;

import com.demo.domain.model.ApiModel;
import com.demo.infra.persistence.sql.mapper.ApiMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ApiService {

    @Resource
    private ApiMapper apiMapper;

    public void setApiData(Boolean flag, Boolean isRead) {
        this.apiMapper.setApiData(flag, isRead);
    }

    public ApiModel getApiDataLatest() {
        return this.apiMapper.getApiDataLatest();
    }

    public void updateApiDataLatest(int id) {
        this.apiMapper.updateApiDataLatest(id);
    }
}
