//package com.hyzs.tools.report.test.jdbc;
//
//import com.alibaba.fastjson.JSON;
//import com.hyzs.tools.report.constant.Constants;
//import com.hyzs.tools.report.daomanager.*;
//import com.hyzs.tools.report.dbo.DbDO;
//import com.hyzs.tools.report.dbo.ParamDO;
//import com.hyzs.tools.report.dbo.ReportDO;
//import com.hyzs.tools.report.dbo.ReportParamDO;
//import com.hyzs.tools.report.jdbc.DatasourceBuilder;
//import com.hyzs.tools.report.jdbc.Page;
//import com.hyzs.tools.report.jdbc.SQLParser;
//import com.hyzs.tools.report.jdbc.SqlPlaceHolder;
//import com.hyzs.tools.report.mapper.ParamMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.sql.DataSource;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author Sun Zhi Peng
// * @version 1.0.0
// * @date 2019/5/27 18:41
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class JdbcTests {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    private DbDaoManager dbDaoManager;
//    @Autowired
//    private ParamDaoManager paramDaoManager;
//    @Autowired
//    private ReportDaoManager reportDaoManager;
//    @Autowired
//    private ReportCategoryDaoManager reportCategoryDaoManager;
//    @Autowired
//    private ReportParamDaoManager reportParamDaoManager;
//
//    @Test
//    public void getDBTest() {
//
//        DbDO dbDO = dbDaoManager.getById(1);
//        ReportDO reportDO = reportDaoManager.getById(1);
//
//        List<ReportParamDO> reportParamDOList = reportParamDaoManager.listByReportId(1);
//
//        reportParamDaoManager.listAll().forEach(System.out::println);
//
//        System.out.println(reportParamDOList.size());
//
//
//        ParamDO paramDO = paramDaoManager.getById(reportParamDOList.stream().findFirst().get().getParamId());
//
//        paramDO.setSortable(Constants.SORT_TRUE);
//        paramDO.setSortType(Constants.SORT_DESC);
//
//        paramDO = paramDaoManager.getById(4);
//
//        DataSource dataSource = DatasourceBuilder.newInstance()
//                .setUrl(dbDO.getUrl())
//                .setUserName(dbDO.getUsername())
//                .setPassword(dbDO.getPassword())
//                .setInitialSize(dbDO.getInitialSize())
//                .setMaxActive(dbDO.getMaxActive())
//                .setMinIdle(dbDO.getMinIdle())
//                .setDriverClassName(dbDO.getDriverClass())
//                .build();
//
//        SQLParser sqlParser = new SQLParser();
//
//        Page page = new Page();
//
//        page.setSize(100);
//        page.setCurrent(1);
//        page.setLimit(10);
//
////        String sql = sqlParser.parse(reportDO.getStatement(), paramDO, SqlPlaceHolder.DEFAULT, reportDO.getPageable() == 1, page);
//
////        String sql = sqlParser.parse(reportDO.getStatement());
//
//        String sql = sqlParser.parseCountSql(reportDO.getStatement());
//        System.out.println(sql);
//
//        jdbcTemplate.setDataSource(dataSource);
//
//        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
//
//        result.forEach(map -> log.info(JSON.toJSONString(map)));
//
//    }
//
//
//}
