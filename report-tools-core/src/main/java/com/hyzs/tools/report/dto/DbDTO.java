package com.hyzs.tools.report.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/29 18:16
 */
@Data
public class DbDTO {
    /**
     * 数据源id
     */
    @ApiModelProperty(value = "数据源id")
    private Long id;
    /**
     * 数据库驱动类
     */
    @ApiModelProperty(value = "数据库驱动类")
    private String driverClass;
    /**
     * 数据库连接名
     */
    @ApiModelProperty(value = "数据库连接名")
    private String name;
    /**
     * 数据库连接密码
     */
    @ApiModelProperty(value = "数据库连接密码")
    private String password;
    /**
     * 数据库连接URL
     */
    @ApiModelProperty(value = "数据库连接URL")
    private String url;
    /**
     * 数据库用户名
     */
    @ApiModelProperty(value = "数据库用户名")
    private String username;
    /**
     * 数据库类型
     */
    @ApiModelProperty(value = "数据库类型")
    private String type;
    /**
     * 连接池初始化时建立物理连接的个数
     */
    @ApiModelProperty(value = "连接池初始化时建立物理连接的个数")
    private Integer initialSize;
    /**
     * 最大连接池数量
     */
    @ApiModelProperty(value = "最大连接池数量")
    private Integer maxActive;
    /**
     * 连接池最大空闲数
     */
    @ApiModelProperty(value = "连接池最小空闲数")
    private Integer minIdle;
}