package com.hyzs.tools.report.service.impl;

import com.hyzs.tools.report.daomanager.DbDaoManager;
import com.hyzs.tools.report.dbo.DbDO;
import com.hyzs.tools.report.service.DbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 12:14
 */
@Service
@Slf4j
public class DbServiceImpl extends ServiceImpl<DbDaoManager, DbDO, Long> implements DbService {

}
