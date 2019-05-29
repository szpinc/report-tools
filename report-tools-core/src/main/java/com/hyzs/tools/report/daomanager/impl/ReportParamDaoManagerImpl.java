package com.hyzs.tools.report.daomanager.impl;

import com.hyzs.tools.report.daomanager.ReportParamDaoManager;
import com.hyzs.tools.report.dbo.ReportParamDO;
import com.hyzs.tools.report.daomanager.immutable.impl.ImmutableReportParamDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.hyzs.tools.report.mapper.ReportParamMapper;
import com.hyzs.tools.report.dao.ReportParamDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReportParamDaoManagerImpl extends  ImmutableReportParamDaoManagerImpl implements ReportParamDaoManager{


    @Autowired
    private ReportParamDao reportParamDao;

}
