package com.yss.report.bitool.service;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.yss.report.bitool.dataprovider.DataProvider;
import com.yss.report.bitool.dataprovider.DataProviderManager;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author daomingzhu
 * @date 2019/9/28 16:01
 */
@Repository
public class DataProviderService {
    public ServiceStatus test(JSONObject dataSource, Map<String, String> query) {
        try {
            DataProvider dataProvider = DataProviderManager.getDataProvider(
                    dataSource.getString("sourceType"),
                    Maps.transformValues(dataSource.getJSONObject("config"), Functions.toStringFunction()),
                    query, true);
            dataProvider.test();
            return new ServiceStatus(ServiceStatus.Status.Success, null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ServiceStatus(ServiceStatus.Status.Fail, e.getMessage());
        }
    }
}
