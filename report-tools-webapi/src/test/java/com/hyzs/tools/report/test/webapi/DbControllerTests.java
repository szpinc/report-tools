package com.hyzs.tools.report.test.webapi;

import com.hyzs.tools.report.web.api.DbController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 15:08
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbControllerTests {

    @Autowired
    private DbController dbController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(dbController).build();
    }

    @Test
    public void testGetAll() throws Exception {

        String content = mockMvc.perform(get("/config/db/list").param("crrPage", "1").param("pageSize")).andReturn().getResponse().getContentAsString();
        System.out.println(content);

    }

}
