package com.hyzs.tools.report.daomanager.impl;

import com.hyzs.tools.report.daomanager.ParamDaoManager;
import com.hyzs.tools.report.dbo.ParamDO;
import com.hyzs.tools.report.daomanager.immutable.impl.ImmutableParamDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.hyzs.tools.report.mapper.ParamMapper;
import com.hyzs.tools.report.dao.ParamDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class ParamDaoManagerImpl extends  ImmutableParamDaoManagerImpl implements ParamDaoManager{


    @Autowired
    private ParamDao paramDao;

}
