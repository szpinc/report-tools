package com.hyzs.tools.report.jdbc;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.beanutils.BeanUtils;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * @author GhostDog
 */
public class DatasourceBuilder {

    private Properties prop;

    private Map<String, Object> map;

    public DataSource build() {
        Objects.requireNonNull(map, "Datasource配置不能为空");
        DruidDataSource druidDataSource = new DruidDataSource();
        try {
            BeanUtils.populate(druidDataSource, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }

    public DatasourceBuilder setUrl(String url) {
        setProp("url", url);
        return this;
    }

    public DatasourceBuilder setUserName(String userName) {
        setProp("username", userName);
        return this;
    }

    public DatasourceBuilder setPassword(String password) {
        setProp("password", password);
        return this;
    }

    public DatasourceBuilder setDriverClassName(String driverClass) {
        setProp("driverClass", driverClass);
        return this;
    }

    public DatasourceBuilder setInitialSize(Integer initialSize) {
        setProp("initialSize", initialSize);
        return this;
    }

    public DatasourceBuilder setMaxActive(Integer maxActive) {
        setProp("maxActive", maxActive);
        return this;
    }

    public DatasourceBuilder setMinIdle(Integer minIdle) {
        setProp("minIdle", minIdle);
        return this;
    }

    public DatasourceBuilder setDbType(String dbType) {
        setProp("dbType", dbType);
        return this;
    }


    private void setProp(String name, Object value) {
        if (Objects.isNull(map)) {
            map = new HashMap<>();
        }
        map.put(name, value);
    }

    public DatasourceBuilder setProp(Properties prop) {
        this.prop = prop;
        return this;
    }

    public DatasourceBuilder setConfigMap(Map<String, Object> config) {
        this.map = config;
        return this;
    }

    public static DatasourceBuilder newInstance() {
        return new DatasourceBuilder();
    }

    private DatasourceBuilder() {
    }
}
