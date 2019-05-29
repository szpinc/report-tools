package com.hyzs.tools.report.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class ParamDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="param";




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
     *sortable
     */
    public static final String  SORTABLE="sortable";

    /**
     *
     *sortable
     */
    public static final String  DB_SORTABLE="sortable";

    /**
     *
     *value
     */
    public static final String  VALUE="value";

    /**
     *
     *value
     */
    public static final String  DB_VALUE="value";

    /**
     *
     *sortType
     */
    public static final String  SORT_TYPE="sortType";

    /**
     *
     *sort_type
     */
    public static final String  DB_SORT_TYPE="sort_type";

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
    private String name;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer sortable;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String value;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String sortType;


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

