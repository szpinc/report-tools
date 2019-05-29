package com.hyzs.tools.report.jdbc;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 10:59
 */
public class SortSqlFactory implements SqlFactory {

    private String sql;

    public SortSqlFactory (String sql) {



    }


    @Override
    public String getSql() {
        return sql;
    }
}
