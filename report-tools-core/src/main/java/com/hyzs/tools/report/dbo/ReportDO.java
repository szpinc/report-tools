package com.hyzs.tools.report.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class ReportDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="report";




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
     *categoryId
     */
    public static final String  CATEGORY_ID="categoryId";

    /**
     *
     *category_id
     */
    public static final String  DB_CATEGORY_ID="category_id";

    /**
     *
     *databaseId
     */
    public static final String  DATABASE_ID="databaseId";

    /**
     *
     *database_id
     */
    public static final String  DB_DATABASE_ID="database_id";

    /**
     *
     *description
     */
    public static final String  DESCRIPTION="description";

    /**
     *
     *description
     */
    public static final String  DB_DESCRIPTION="description";

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
     *pageable
     */
    public static final String  PAGEABLE="pageable";

    /**
     *
     *pageable
     */
    public static final String  DB_PAGEABLE="pageable";

    /**
     *
     *statement
     */
    public static final String  STATEMENT="statement";

    /**
     *
     *statement
     */
    public static final String  DB_STATEMENT="statement";

    /**
     *
     *formKey
     */
    public static final String  FORM_KEY="formKey";

    /**
     *
     *form_key
     */
    public static final String  DB_FORM_KEY="form_key";

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
    private Long categoryId;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long databaseId;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String description;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String name;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer pageable;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String statement;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String formKey;


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

