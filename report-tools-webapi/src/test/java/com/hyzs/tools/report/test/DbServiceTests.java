//package com.hyzs.tools.report.test;
//
//import com.hyzs.gz.common.core.bo.PageBO;
//import com.hyzs.gz.common.dao.dto.PageQueryDTO;
//import com.hyzs.tools.report.dbo.DbDO;
//import com.hyzs.tools.report.dto.DbPageDTO;
//import com.hyzs.tools.report.service.DbService;
//import com.hyzs.tools.report.vo.DbVO;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * @author Sun Zhi Peng
// * @version 1.0.0
// * @date 2019/5/28 14:41
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Slf4j
//public class DbServiceTests {
//
//    @Autowired
//    private DbService dbService;
//
//    @Test
//    public void findDbListTest() {
//
//        DbPageDTO page = new DbPageDTO();
//        new DbPageDTO();
//        page.setCurrPage(1);
//        page.setPageSize(10);
//
//        PageBO<DbVO> dbList = dbService.findDbList(page);
//
//        dbList.getList().forEach((dbDO) -> log.info("DbDO:[{}]", dbDO));
//
//        log.info("总记录数:[{}],总页数:[{}]", dbList.getTotalCount(), dbList.getTotalPage());
//    }
//
//
//}
