package com.hyzs.tools.report.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class DbDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="db";




    //定义字段常量
    /**
     *
     *id
     */
    public static final String  ID="id";

    /**
     *
     *id
     */
    public static final String  DB_ID="id";

    /**
     *
     *driverClass
     */
    public static final String  DRIVER_CLASS="driverClass";

    /**
     *
     *driver_class
     */
    public static final String  DB_DRIVER_CLASS="driver_class";

    /**
     *
     *name
     */
    public static final String  NAME="name";

    /**
     *
     *name
     */
    public static final String  DB_NAME="name";

    /**
     *
     *password
     */
    public static final String  PASSWORD="password";

    /**
     *
     *password
     */
    public static final String  DB_PASSWORD="password";

    /**
     *
     *url
     */
    public static final String  URL="url";

    /**
     *
     *url
     */
    public static final String  DB_URL="url";

    /**
     *
     *username
     */
    public static final String  USERNAME="username";

    /**
     *
     *username
     */
    public static final String  DB_USERNAME="username";

    /**
     *
     *type
     */
    public static final String  TYPE="type";

    /**
     *
     *type
     */
    public static final String  DB_TYPE="type";

    /**
     *连接池初始化时建立物理连接的个数
     *initialSize
     */
    public static final String  INITIAL_SIZE="initialSize";

    /**
     *连接池初始化时建立物理连接的个数
     *initial_size
     */
    public static final String  DB_INITIAL_SIZE="initial_size";

    /**
     *最大连接池数量
     *maxActive
     */
    public static final String  MAX_ACTIVE="maxActive";

    /**
     *最大连接池数量
     *max_active
     */
    public static final String  DB_MAX_ACTIVE="max_active";

    /**
     *连接池最大空闲数
     *minIdle
     */
    public static final String  MIN_IDLE="minIdle";

    /**
     *连接池最大空闲数
     *min_idle
     */
    public static final String  DB_MIN_IDLE="min_idle";

    /**
     *是否删除:0‐否,1‐是
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0‐否,1‐是
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";

    /**
     *创建时间
     *gmtCreate
     */
    public static final String  GMT_CREATE="gmtCreate";

    /**
     *创建时间
     *gmt_create
     */
    public static final String  DB_GMT_CREATE="gmt_create";

    /**
     *更新时间
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *更新时间
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";




    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String driverClass;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String name;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String password;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String url;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String username;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String type;


    /**
     *连接池初始化时建立物理连接的个数
     */
    @ApiModelProperty(value = "连接池初始化时建立物理连接的个数")
    private Integer initialSize;


    /**
     *最大连接池数量
     */
    @ApiModelProperty(value = "最大连接池数量")
    private Integer maxActive;


    /**
     *连接池最大空闲数
     */
    @ApiModelProperty(value = "连接池最大空闲数")
    private Integer minIdle;


    /**
     *是否删除:0‐否,1‐是
     */
    @ApiModelProperty(value = "是否删除:0‐否,1‐是")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}

