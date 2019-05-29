package com.hyzs.tools.report.web.api;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tools.report.dbo.DbDO;
import com.hyzs.tools.report.dto.DbDTO;
import com.hyzs.tools.report.dto.DbPageDTO;
import com.hyzs.tools.report.service.DbService;
import com.hyzs.tools.report.vo.DbVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/28 14:48
 */

@RestController
@Api(tags = "数据源配置接口")
@RequestMapping(value = "/webapi/db", method = RequestMethod.POST)
public class DbController extends BaseController {

    @Autowired
    private DbService dbService;

    @ApiOperation(value = "查询所有数据源")
    @RequestMapping("listAllDb")
    public ResponseVO<List<DbVO>> listAllDb() {
        List<DbVO> voList = dbService.findAll(DbVO.class);
        return CommonUtils.okResponseVO(voList);
    }

    @ApiOperation(value = "分页查询所有数据源", notes = "分页查询至少需要传入'crrPage'和'pageSize'")
    @RequestMapping("pageListAllDb")
    public ResponseVO<PageBO<DbVO>> pageListAllDb(@RequestBody DbPageDTO dbPageDTO) {
        PageBO<DbVO> pageBO = dbService.findAllByPage(dbPageDTO, DbVO.class);
        return CommonUtils.okResponseVO(pageBO);

    }

    @ApiOperation(value = "添加或更新数据源", notes = "带上'id'为更改，不带'id'为新增")
    @RequestMapping("saveDb")
    public ResponseVO<Object> saveDb(@RequestBody DbDTO dto) {
        dbService.save(CommonUtils.newInstance(dto, DbDO.class));
        return CommonUtils.okResponseVO(null);
    }


    @ApiOperation(value = "删除数据源", notes = "根据id删除数据源")
    @RequestMapping("deleteDb")
    public ResponseVO<Object> deleteDb(@RequestBody @ApiParam(value = "数据源id", required = true) Long id) {
        dbService.deleteById(id);
        return CommonUtils.okResponseVO(null);
    }

}
