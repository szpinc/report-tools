package com.hyzs.tools.report.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 12:34
 */

@EqualsAndHashCode(callSuper = true)
@ApiModel("数据源信息")
@Data
@ToString
public class DbVO extends BaseVO {

    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     * 数据库驱动类
     */
    @ApiModelProperty(value = "")
    private String driverClass;


    /**
     * 数据库连接名
     */
    @ApiModelProperty(value = "")
    private String name;


    /**
     * 数据库连接密码
     */
    @ApiModelProperty(value = "")
    private String password;


    /**
     * 数据库连接URL
     */
    @ApiModelProperty(value = "")
    private String url;


    /**
     * 数据库用户名
     */
    @ApiModelProperty(value = "")
    private String username;


    /**
     * 数据库类型
     */
    @ApiModelProperty(value = "")
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
