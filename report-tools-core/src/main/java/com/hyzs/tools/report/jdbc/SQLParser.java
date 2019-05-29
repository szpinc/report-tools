package com.hyzs.tools.report.jdbc;

import com.hyzs.tools.report.constant.Constants;
import com.hyzs.tools.report.dbo.ParamDO;
import com.hyzs.tools.report.exception.SqlParseException;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

@Slf4j
public class SQLParser {

    private String sortSql(@NonNull ParamDO param) {
        //build sql
        String sortSql = StringUtils.EMPTY;
        if (param.getSortable() == Constants.SORT_TRUE) {
            sortSql = StringUtils.join(SelectType.SORT.getValue(), param.getName());
            if (Constants.SORT_DESC.equals(param.getSortType())) {
                sortSql = StringUtils.join(sortSql, StringUtils.SPACE, Constants.SORT_DESC);
            }
        }
        return sortSql;
    }


    /**
     * 解析sql，不做任何处理
     *
     * @param sql
     * @return
     */
    public String parse(@NonNull String sql) {
        return replace(sql, SqlPlaceHolder.DEFAULT, StringUtils.EMPTY);
    }

    /**
     * 解析sql，获取sql执行的总记录数
     *
     * @param sql
     * @return
     */
    public String parseCountSql(@NonNull String sql) {
        return replace(SelectType.COUNT.getValue(), SqlPlaceHolder.PARAM, parse(sql));
    }

    private String replace(String sql, SqlPlaceHolder placeHolder, String rstr) {
        return StringUtils.replace(sql, placeHolder.getValue(), rstr);
    }

    private String pageSql(boolean pageable, Page page) {
        if (!pageable) {
            return StringUtils.EMPTY;
        }
        return StringUtils.join(SelectType.LIMIT.getValue(), (page.getCurrent() - 1) * page.getLimit() + 1, ",", page.getLimit());
    }


    public String parse(@NonNull String sql, ParamDO param, SqlPlaceHolder placeHolder, boolean pageable, Page page) {
        check(sql, placeHolder);
        String replaceSql = StringUtils.join(sortSql(param), StringUtils.SPACE, pageSql(pageable, page));
        return StringUtils.replace(sql, placeHolder.getValue(), replaceSql);
    }

    private void check(String sql, SqlPlaceHolder placeHolder) {
        if (StringUtils.isEmpty(sql)) {
            throw new SqlParseException("sql不能为空");
        }

        if (!sql.contains(placeHolder.getValue())) {
            throw new SqlParseException("sql没有包含占位符");
        }
    }
}
