package com.hyzs.tools.report.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class ReportParamDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="report_param";




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
     *reportId
     */
    public static final String  REPORT_ID="reportId";

    /**
     *
     *report_id
     */
    public static final String  DB_REPORT_ID="report_id";

    /**
     *
     *paramId
     */
    public static final String  PARAM_ID="paramId";

    /**
     *
     *param_id
     */
    public static final String  DB_PARAM_ID="param_id";

    /**
     *
     *gmtCreate
     */
    public static final String  GMT_CREATE="gmtCreate";

    /**
     *
     *gmt_create
     */
    public static final String  DB_GMT_CREATE="gmt_create";

    /**
     *
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";

    /**
     *
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";




    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long reportId;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long paramId;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private java.util.Date gmtCreate;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private java.util.Date gmtModified;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer isDeleted;
}

