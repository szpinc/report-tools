package com.hyzs.tools.report.jdbc;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/27 9:41
 */
public enum SelectType {

    SORT(" ORDER BY "),
    LIMIT(" LIMIT "),
    COUNT("SELECT COUNT(1) AS 'count' FROM (${}) `count`");

    private String value;

    private SelectType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
