package com.hyzs.tools.report.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 17:16
 */

@Data
@ApiModel("报表分类信息")
public class ReportCategoryDTO {
    @ApiModelProperty("报表分类ID")
    private String id;
    @ApiModelProperty("报表分类名")
    @NotNull(message = "分类名不能为空")
    private String name;
    @ApiModelProperty("报表分类描述")
    private String description;
}
