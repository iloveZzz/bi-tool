package com.yss.report.bitool.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Functions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.yss.report.bitool.dto.ViewDashboardDataset;
import com.yss.report.bitool.dto.ViewDashboardDatasource;
import com.yss.report.bitool.entity.DashboardDataset;
import com.yss.report.bitool.mapper.DashboardDatasetMapper;
import com.yss.report.bitool.mapper.DashboardDatasourceMapper;
import com.yss.report.bitool.service.DataProviderService;
import com.yss.report.bitool.service.DatasourceService;
import com.yss.report.bitool.service.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yfyuan on 2016/8/9.
 */
@RestController
@RequestMapping("/dashboard")
public class DashboardController  {
    @Autowired
    private DatasourceService datasourceService;
    @Autowired
    private DashboardDatasourceMapper datasourceDao;
    @Autowired
    private DashboardDatasetMapper datasetDao;
    @Autowired
    private DataProviderService dataProviderService;
    @GetMapping(value = "/getDatasourceList")
    public List<ViewDashboardDatasource> getDatasourceList() {
        return datasourceService.getViewDatasourceList(() -> datasourceDao.selectAll());
    }
    @GetMapping(value = "/getDatasetList")
    public List<ViewDashboardDataset> getDatasetList() {
        List<DashboardDataset> list = datasetDao.selectAll();
        return Lists.transform(list, ViewDashboardDataset.TO);
    }
    @GetMapping(value = "/test")
    public ServiceStatus test(@RequestParam(name = "datasource", required = false) String datasource, @RequestParam(name = "query", required = false) String query) {
        JSONObject queryO = JSONObject.parseObject(query);
        JSONObject datasourceO = JSONObject.parseObject(datasource);
        return dataProviderService.test(datasourceO, Maps.transformValues(queryO, Functions.toStringFunction()));
    }
}
