package com.hyzs.tools.report.daomanager.impl;

import com.hyzs.tools.report.daomanager.ReportDaoManager;
import com.hyzs.tools.report.dbo.ReportDO;
import com.hyzs.tools.report.daomanager.immutable.impl.ImmutableReportDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.hyzs.tools.report.mapper.ReportMapper;
import com.hyzs.tools.report.dao.ReportDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReportDaoManagerImpl extends  ImmutableReportDaoManagerImpl implements ReportDaoManager{


    @Autowired
    private ReportDao reportDao;

}
