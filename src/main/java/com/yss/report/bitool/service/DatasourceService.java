package com.yss.report.bitool.service;

import com.yss.report.bitool.dto.ViewDashboardDatasource;
import com.yss.report.bitool.entity.DashboardDatasource;

import java.util.List;
import java.util.function.Supplier;

public interface DatasourceService {
    List<ViewDashboardDatasource> getViewDatasourceList(Supplier<List<DashboardDatasource>> daoQuery);
}
