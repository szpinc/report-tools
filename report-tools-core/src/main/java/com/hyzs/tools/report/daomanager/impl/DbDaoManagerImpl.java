package com.hyzs.tools.report.daomanager.impl;

import com.hyzs.tools.report.daomanager.DbDaoManager;
import com.hyzs.tools.report.dbo.DbDO;
import com.hyzs.tools.report.daomanager.immutable.impl.ImmutableDbDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.hyzs.tools.report.mapper.DbMapper;
import com.hyzs.tools.report.dao.DbDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class DbDaoManagerImpl extends  ImmutableDbDaoManagerImpl implements DbDaoManager{


    @Autowired
    private DbDao dbDao;

}
