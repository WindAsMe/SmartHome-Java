package com.demo.domain.service;

import com.demo.domain.model.FlagModel;
import com.demo.infra.persistence.sql.mapper.FlagMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FlagService {

    @Resource
    private FlagMapper flagMapper;

    public void setFlagData(int flag) {
        this.flagMapper.setFlagData(flag);
    }

    public FlagModel getFlagDataLatest() {
        return this.flagMapper.getFlagDataLatest();
    }
}
