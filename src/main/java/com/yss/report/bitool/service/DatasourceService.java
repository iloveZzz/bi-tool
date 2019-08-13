package com.yss.report.bitool.service;

import com.yss.report.bitool.dataprovider.DataProviderManager;
import com.yss.report.bitool.dataprovider.annotation.DatasourceParameter;
import com.yss.report.bitool.entity.DashboardDatasource;
import com.yss.report.bitool.dto.ViewDashboardDatasource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class DatasourceService {
    public List<ViewDashboardDatasource> getViewDatasourceList(Supplier<List<DashboardDatasource>> daoQuery) {
        List<DashboardDatasource> list = daoQuery.get();
        List<ViewDashboardDatasource> vlist = list.stream().map(e -> (ViewDashboardDatasource) ViewDashboardDatasource.TO.apply(e)).collect(Collectors.toList());
        vlist.forEach(e -> {
            try {
                List<String> fields = DataProviderManager.getProviderFieldByType(e.getType(), DatasourceParameter.Type.Password);
                fields.forEach(f -> {
                    if (e.getConfig().containsKey(f)) {
                        e.getConfig().put(f, "");
                    }
                });
            } catch (Exception ex) {
            }
        });
        return vlist;
    }
}