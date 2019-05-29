package com.hyzs.tools.report.jdbc;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 11:29
 */
public class AbstractSqlFactory implements SqlFactory {

    String sql;
    SQLParser parser;

    public AbstractSqlFactory(String sql, SQLParser parser) {
        this.parser = parser;
        this.sql = sql;
    }

    @Override
    public String getSql() {
        return this.sql;
    }
}
