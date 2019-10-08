package com.yss.report.bitool.service;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.yss.report.bitool.base.SpringBootTestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试动态数据源
 * @author daomingzhu
 * @date 2019/9/28 16:03
 */
public class DataProviderServiceTest extends SpringBootTestBase {
    @Autowired
    DataProviderService dataProviderService;
    @Test
    public void test1() {
        JSONObject datasourceO = JSONObject.parseObject("{\"datasourceId\":9,\"userId\":\"1\",\"sourceName\":\"LOCAL_ORACLE\",\"sourceType\":\"jdbc\",\"createTime\":\"Aug 8, 2019 10:29:51 AM\",\"updateTime\":\"Aug 8, 2019 10:29:51 AM\",\"config\":\"{\\\"aggregateProvider\\\":true,\\\"password\\\":\\\"zhudao123\\\",\\\"pooled\\\":true,\\\"driver\\\":\\\"oracle.jdbc.OracleDriver\\\",\\\"jdbcurl\\\":\\\"jdbc:oracle:thin:@localhost/ORCL\\\",\\\"username\\\":\\\"DB_ZHU\\\"}\"}");
        JSONObject  queryO = JSONObject.parseObject("{\"sql\":\"SELECT * FROM HR.EMPLOYEES\"}");
        ServiceStatus test = dataProviderService.test(datasourceO, Maps.transformValues(queryO, Functions.toStringFunction()));
        System.out.println(new Gson().toJson(test));
    }
}