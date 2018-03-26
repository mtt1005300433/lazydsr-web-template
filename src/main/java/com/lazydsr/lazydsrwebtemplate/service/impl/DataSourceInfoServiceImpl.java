package com.lazydsr.lazydsrwebtemplate.service.impl;

import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.mapper.DataSourceInfoMapper;
import com.lazydsr.lazydsrwebtemplate.service.DataSourceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DatasourceInfoServiceImpl
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.service.impl
 * Created by Lazy on 2018/3/9 21:55
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class DataSourceInfoServiceImpl implements DataSourceInfoService {
    @Autowired
    private DataSourceInfoMapper dataSourceInfoMapper;

    @Override
    public List<DataSourceInfo> findAll() {
        List<DataSourceInfo> dataSourceInfos = dataSourceInfoMapper.selectAll();
        return dataSourceInfos;
    }

    @Override
    public List<DataSourceInfo> findByStatus(int status) {
        List<DataSourceInfo> dataSourceInfos = dataSourceInfoMapper.selectAllNormal();
        return dataSourceInfos;
    }
}
