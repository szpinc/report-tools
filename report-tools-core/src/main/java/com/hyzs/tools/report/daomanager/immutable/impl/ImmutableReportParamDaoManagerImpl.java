package com.hyzs.tools.report.daomanager.immutable.impl;

import com.hyzs.tools.report.dbo.ReportParamDO;
import com.hyzs.gz.common.dao.manager.DOChecker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.Date;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import java.util.stream.Collectors;
import org.springframework.util.CollectionUtils;
import com.hyzs.tools.report.daomanager.immutable.ImmutableReportParamDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tools.report.mapper.ReportParamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableReportParamDaoManagerImpl extends CommonDaoManagerImpl<ReportParamDO,Long> implements ImmutableReportParamDaoManager {

        @Autowired
        private ReportParamMapper reportParamMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(reportParamMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(ReportParamDO.ID,ReportParamDO.DB_ID);
            fieldMap.put(ReportParamDO.DB_ID,ReportParamDO.DB_ID);

            fieldMap.put(ReportParamDO.REPORT_ID,ReportParamDO.DB_REPORT_ID);
            fieldMap.put(ReportParamDO.DB_REPORT_ID,ReportParamDO.DB_REPORT_ID);

            fieldMap.put(ReportParamDO.PARAM_ID,ReportParamDO.DB_PARAM_ID);
            fieldMap.put(ReportParamDO.DB_PARAM_ID,ReportParamDO.DB_PARAM_ID);

            fieldMap.put(ReportParamDO.GMT_CREATE,ReportParamDO.DB_GMT_CREATE);
            fieldMap.put(ReportParamDO.DB_GMT_CREATE,ReportParamDO.DB_GMT_CREATE);

            fieldMap.put(ReportParamDO.GMT_MODIFIED,ReportParamDO.DB_GMT_MODIFIED);
            fieldMap.put(ReportParamDO.DB_GMT_MODIFIED,ReportParamDO.DB_GMT_MODIFIED);

            fieldMap.put(ReportParamDO.IS_DELETED,ReportParamDO.DB_IS_DELETED);
            fieldMap.put(ReportParamDO.DB_IS_DELETED,ReportParamDO.DB_IS_DELETED);



            super.setFieldNameMap(fieldMap);
        }



        public List<ReportParamDO> listByReportId(Long reportId, String... fieldNames){
            return this.reportParamMapper.listByReportId(reportId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportParamDO> mapByReportId(Long reportId, String... fieldNames){
            return this.reportParamMapper.mapByReportId(reportId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByReportId(Long reportId){
            return this.reportParamMapper.countByReportId(reportId);
        }

        public Integer updateNotNullFieldsByReportId(ReportParamDO updateDO, Long reportId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateNotNullFieldsByReportId(updateDO,reportId);
        }

        public Integer updateAllFieldsByReportId(ReportParamDO updateDO,  Long reportId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateAllFieldsByReportId(updateDO,reportId);
        }

        public Integer deleteByReportId( Long reportId){
            return this.reportParamMapper.deleteByReportId(reportId);
        }



        public List<ReportParamDO> listByInReportId(Collection<Long> reportIdList, String... fieldNames){
            return this.reportParamMapper.listByInReportId(reportIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportParamDO> mapByInReportId(Collection<Long> reportIdList, String... fieldNames){
            return this.reportParamMapper.mapByInReportId(reportIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInReportId(Collection<Long> reportIdList){
            return this.reportParamMapper.countByInReportId(reportIdList);
        }

        public Integer updateNotNullFieldsByInReportId(ReportParamDO updateDO, Collection<Long> reportIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateNotNullFieldsByInReportId(updateDO,reportIdList);
        }

        public Integer updateAllFieldsByInReportId(ReportParamDO updateDO,  Collection<Long> reportIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateAllFieldsByInReportId(updateDO,reportIdList);
        }

        public Integer deleteByInReportId( Collection<Long> reportIdList){
            return this.reportParamMapper.deleteByInReportId(reportIdList);
        }


        public List<ReportParamDO> listByParamId(Long paramId, String... fieldNames){
            return this.reportParamMapper.listByParamId(paramId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportParamDO> mapByParamId(Long paramId, String... fieldNames){
            return this.reportParamMapper.mapByParamId(paramId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByParamId(Long paramId){
            return this.reportParamMapper.countByParamId(paramId);
        }

        public Integer updateNotNullFieldsByParamId(ReportParamDO updateDO, Long paramId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateNotNullFieldsByParamId(updateDO,paramId);
        }

        public Integer updateAllFieldsByParamId(ReportParamDO updateDO,  Long paramId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateAllFieldsByParamId(updateDO,paramId);
        }

        public Integer deleteByParamId( Long paramId){
            return this.reportParamMapper.deleteByParamId(paramId);
        }



        public List<ReportParamDO> listByInParamId(Collection<Long> paramIdList, String... fieldNames){
            return this.reportParamMapper.listByInParamId(paramIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportParamDO> mapByInParamId(Collection<Long> paramIdList, String... fieldNames){
            return this.reportParamMapper.mapByInParamId(paramIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInParamId(Collection<Long> paramIdList){
            return this.reportParamMapper.countByInParamId(paramIdList);
        }

        public Integer updateNotNullFieldsByInParamId(ReportParamDO updateDO, Collection<Long> paramIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateNotNullFieldsByInParamId(updateDO,paramIdList);
        }

        public Integer updateAllFieldsByInParamId(ReportParamDO updateDO,  Collection<Long> paramIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportParamMapper.updateAllFieldsByInParamId(updateDO,paramIdList);
        }

        public Integer deleteByInParamId( Collection<Long> paramIdList){
            return this.reportParamMapper.deleteByInParamId(paramIdList);
        }


}

