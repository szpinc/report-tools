package com.hyzs.tools.report.jdbc;

import lombok.NonNull;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 11:28
 */
public class CountSqlFactory extends AbstractSqlFactory {

    public CountSqlFactory(@NonNull String sql, @NonNull SQLParser parser) {
        super(sql,parser);
    }

    private void hand () {
        this.sql = this.parser.parseCountSql(sql);
    }

}
