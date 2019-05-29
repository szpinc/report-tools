package com.hyzs.tools.report.web.api;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tools.report.dbo.DbDO;
import com.hyzs.tools.report.service.DbService;
import com.hyzs.tools.report.vo.DbVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "添加或更新数据源", notes = "带上'id'为更改，不带'id'为新增")
    @RequestMapping("saveDb")
    public ResponseVO<Object> saveDb(@RequestBody DbVO dbVO) {
        dbService.save(CommonUtils.newInstance(dbVO, DbDO.class));
        return CommonUtils.okResponseVO(null);
    }




}
