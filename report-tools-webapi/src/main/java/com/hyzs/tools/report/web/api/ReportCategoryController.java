package com.hyzs.tools.report.web.api;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tools.report.dbo.ReportCategoryDO;
import com.hyzs.tools.report.dto.ReportCategoryDTO;
import com.hyzs.tools.report.dto.ReportCategoryPageDTO;
import com.hyzs.tools.report.service.ReportCategoryService;
import com.hyzs.tools.report.vo.ReportCategoryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 16:00
 */

@RestController
@Api(tags = "报表分类接口")
@RequestMapping(value = "/webapi/reportCategory", method = RequestMethod.POST)
public class ReportCategoryController extends BaseController {

    @Autowired
    private ReportCategoryService reportCategoryService;


    @ApiOperation(value = "分页查询所有报表分类", notes = "需要传入分页相关参数")
    @RequestMapping("pageListAllReportCategory")
    public ResponseVO<PageBO<ReportCategoryVO>> pageListAllReportCategory(@RequestBody ReportCategoryPageDTO page) {
        PageBO<ReportCategoryVO> pageBO = reportCategoryService.findAllByPage(page, ReportCategoryVO.class);
        return CommonUtils.okResponseVO(pageBO);
    }

    @ApiOperation(value = "查询所有报表分类", notes = "")
    @RequestMapping("listAllReportCategory")
    public ResponseVO<List<ReportCategoryVO>> listAllReportCategory() {
        List<ReportCategoryVO> categoryVOList = reportCategoryService.findAll().parallelStream().map(DO -> CommonUtils.newInstance(DO, ReportCategoryVO.class)).collect(Collectors.toList());
        return CommonUtils.okResponseVO(categoryVOList);
    }

    @RequestMapping("saveReportCategory")
    @ApiOperation(value = "添加或修改报表分类", notes = "添加分类数据时不需要传入id参数,修改数据才需要id参数")
    public ResponseVO saveReportCategory(@RequestBody ReportCategoryDTO reportCategoryDTO) {
        ReportCategoryDO reportCategoryDO = CommonUtils.newInstance(reportCategoryDTO, ReportCategoryDO.class);
        reportCategoryService.save(reportCategoryDO);
        return CommonUtils.okResponseVO("success");
    }
}
