package com.hyzs.tools.report.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 15:46
 */

@EqualsAndHashCode(callSuper = true)
@ApiModel("报表配置")
@ToString
@Data
public class ReportCategoryVO extends BaseVO {

    @ApiModelProperty(value = "报表配置ID")
    private Long id;

    @ApiModelProperty(value = "报表配置名")
    private String name;

    @ApiModelProperty(value = "报表配置描述")
    private String description;

}
