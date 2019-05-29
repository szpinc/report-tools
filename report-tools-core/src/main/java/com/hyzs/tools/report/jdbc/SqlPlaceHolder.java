package com.hyzs.tools.report.jdbc;

public enum SqlPlaceHolder {

    DEFAULT("#{}"),
    PARAM("${}");

    private String value;

    private SqlPlaceHolder (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
