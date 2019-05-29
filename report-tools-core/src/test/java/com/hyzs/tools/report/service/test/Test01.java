package com.hyzs.tools.report.service.test;

import lombok.Data;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/29 10:34
 */


public class Test01 {

    @Test
    public void testDemo() throws NoSuchFieldException, IllegalAccessException {

        Demo demo = new Demo();
        demo.setId(1L);
        demo.setName("test");

        Field id = demo.getClass().getDeclaredField("id");

        id.setAccessible(true);
        System.out.println(id.get(demo));

    }


}

@Data
class Demo {
    private Long id;
    private String name;
}
