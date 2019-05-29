package com.hyzs.tools.report.daomanager.immutable.impl;

import com.hyzs.tools.report.dbo.ReportCategoryDO;
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
import com.hyzs.tools.report.daomanager.immutable.ImmutableReportCategoryDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tools.report.mapper.ReportCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableReportCategoryDaoManagerImpl extends CommonDaoManagerImpl<ReportCategoryDO,Long> implements ImmutableReportCategoryDaoManager {

        @Autowired
        private ReportCategoryMapper reportCategoryMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(reportCategoryMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(ReportCategoryDO.ID,ReportCategoryDO.DB_ID);
            fieldMap.put(ReportCategoryDO.DB_ID,ReportCategoryDO.DB_ID);

            fieldMap.put(ReportCategoryDO.NAME,ReportCategoryDO.DB_NAME);
            fieldMap.put(ReportCategoryDO.DB_NAME,ReportCategoryDO.DB_NAME);

            fieldMap.put(ReportCategoryDO.DESCRIPTION,ReportCategoryDO.DB_DESCRIPTION);
            fieldMap.put(ReportCategoryDO.DB_DESCRIPTION,ReportCategoryDO.DB_DESCRIPTION);

            fieldMap.put(ReportCategoryDO.IS_DELETED,ReportCategoryDO.DB_IS_DELETED);
            fieldMap.put(ReportCategoryDO.DB_IS_DELETED,ReportCategoryDO.DB_IS_DELETED);

            fieldMap.put(ReportCategoryDO.GMT_CREATE,ReportCategoryDO.DB_GMT_CREATE);
            fieldMap.put(ReportCategoryDO.DB_GMT_CREATE,ReportCategoryDO.DB_GMT_CREATE);

            fieldMap.put(ReportCategoryDO.GMT_MODIFIED,ReportCategoryDO.DB_GMT_MODIFIED);
            fieldMap.put(ReportCategoryDO.DB_GMT_MODIFIED,ReportCategoryDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<ReportCategoryDO> listByName(String name, String... fieldNames){
            return this.reportCategoryMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportCategoryDO> mapByName(String name, String... fieldNames){
            return this.reportCategoryMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.reportCategoryMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(ReportCategoryDO updateDO, String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(ReportCategoryDO updateDO,  String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.reportCategoryMapper.deleteByName(name);
        }



        public List<ReportCategoryDO> listByInName(Collection<String> nameList, String... fieldNames){
            return this.reportCategoryMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportCategoryDO> mapByInName(Collection<String> nameList, String... fieldNames){
            return this.reportCategoryMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            return this.reportCategoryMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(ReportCategoryDO updateDO, Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(ReportCategoryDO updateDO,  Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            return this.reportCategoryMapper.deleteByInName(nameList);
        }


        public List<ReportCategoryDO> listByDescription(String description, String... fieldNames){
            return this.reportCategoryMapper.listByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportCategoryDO> mapByDescription(String description, String... fieldNames){
            return this.reportCategoryMapper.mapByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDescription(String description){
            return this.reportCategoryMapper.countByDescription(description);
        }

        public Integer updateNotNullFieldsByDescription(ReportCategoryDO updateDO, String description){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateNotNullFieldsByDescription(updateDO,description);
        }

        public Integer updateAllFieldsByDescription(ReportCategoryDO updateDO,  String description){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateAllFieldsByDescription(updateDO,description);
        }

        public Integer deleteByDescription( String description){
            return this.reportCategoryMapper.deleteByDescription(description);
        }



        public List<ReportCategoryDO> listByInDescription(Collection<String> descriptionList, String... fieldNames){
            return this.reportCategoryMapper.listByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportCategoryDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames){
            return this.reportCategoryMapper.mapByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDescription(Collection<String> descriptionList){
            return this.reportCategoryMapper.countByInDescription(descriptionList);
        }

        public Integer updateNotNullFieldsByInDescription(ReportCategoryDO updateDO, Collection<String> descriptionList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateNotNullFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer updateAllFieldsByInDescription(ReportCategoryDO updateDO,  Collection<String> descriptionList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportCategoryMapper.updateAllFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer deleteByInDescription( Collection<String> descriptionList){
            return this.reportCategoryMapper.deleteByInDescription(descriptionList);
        }


}

