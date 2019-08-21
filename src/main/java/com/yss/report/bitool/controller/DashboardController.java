package com.yss.report.bitool.controller;

import com.google.common.collect.Lists;
import com.yss.report.bitool.dto.ViewDashboardDataset;
import com.yss.report.bitool.entity.DashboardDataset;
import com.yss.report.bitool.mapper.DashboardDatasetMapper;
import com.yss.report.bitool.mapper.DashboardDatasourceMapper;
import com.yss.report.bitool.service.DatasetService;
import com.yss.report.bitool.service.impl.DatasourceServiceImpl;
import com.yss.report.bitool.dto.ViewDashboardDatasource;
import com.yss.report.bitool.vo.ServiceStatus;
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
    private DatasourceServiceImpl datasourceService;
    @Autowired
    private DatasetService datasetService;
    @Autowired
    private DashboardDatasourceMapper datasourceDao;
    @Autowired
    private DashboardDatasetMapper datasetDao;
    @GetMapping(value = "/getDatasourceList")
    public List<ViewDashboardDatasource> getDatasourceList() {
        return datasourceService.getViewDatasourceList(() -> datasourceDao.selectAll());
    }
    @GetMapping(value = "/getDatasetList")
    public List<ViewDashboardDataset> getDatasetList() {
        List<DashboardDataset> list = datasetDao.selectAll();
        return Lists.transform(list, ViewDashboardDataset.TO);
    }
//    @RequestMapping(value = "/getDatasourceParams")
//    public List<Map<String, Object>> getDatasourceParams(@RequestParam(name = "type") String type) {
//        return DataProviderViewManager.getDatasourceParams(type);
//    }
    @GetMapping(value = "/saveNewDataset")
    public ServiceStatus saveNewDataset(@RequestParam(name = "json") String json) {
        return datasetService.save(json);
    }
}
