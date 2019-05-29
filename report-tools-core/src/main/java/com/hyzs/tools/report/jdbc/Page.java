package com.hyzs.tools.report.jdbc;

import lombok.Data;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/27 9:58
 */
@Data
public class Page {

    private int current;

    private int size;

    private int limit;
}
