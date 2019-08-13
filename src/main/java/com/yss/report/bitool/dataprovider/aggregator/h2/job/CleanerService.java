package com.yss.report.bitool.dataprovider.aggregator.h2.job;

import com.alibaba.druid.pool.DruidDataSource;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by zyong on 2017/9/18.
 */
@Component
public class CleanerService {

    private Logger LOG = LoggerFactory.getLogger(this.getClass());





    protected void cleanDB() {
    }

}
