package com.hyzs.tools.report.test;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.dao.dto.PageQueryDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/29 10:34
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test01 {

    @Test
    public void testDemo() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 5, 6);
        PageQueryDTO pageQueryDTO = new PageQueryDTO();
        pageQueryDTO.setPageSize(2);
        pageQueryDTO.setCurrPage(1);

        PageBO<Integer> integerPageBO = DaoUtils.listDOByPage(() -> integers, pageQueryDTO);


        System.out.println("总记录数:" + integerPageBO.getTotalCount());
        integerPageBO.getList().forEach(System.out::println);
    }


}
