package com.yss.report.bitool.service;

import com.yss.report.bitool.vo.ServiceStatus;

public interface DatasetService {
    ServiceStatus save(String json);
}
