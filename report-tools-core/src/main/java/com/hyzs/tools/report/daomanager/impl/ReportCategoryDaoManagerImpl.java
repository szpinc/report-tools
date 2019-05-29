package com.hyzs.tools.report.daomanager.impl;

import com.hyzs.tools.report.daomanager.ReportCategoryDaoManager;
import com.hyzs.tools.report.dbo.ReportCategoryDO;
import com.hyzs.tools.report.daomanager.immutable.impl.ImmutableReportCategoryDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.hyzs.tools.report.mapper.ReportCategoryMapper;
import com.hyzs.tools.report.dao.ReportCategoryDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReportCategoryDaoManagerImpl extends  ImmutableReportCategoryDaoManagerImpl implements ReportCategoryDaoManager{


    @Autowired
    private ReportCategoryDao reportCategoryDao;

}
