package com.hyzs.tools.report.daomanager.immutable.impl;

import com.hyzs.tools.report.dbo.ReportDO;
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
import com.hyzs.tools.report.daomanager.immutable.ImmutableReportDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tools.report.mapper.ReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableReportDaoManagerImpl extends CommonDaoManagerImpl<ReportDO,Long> implements ImmutableReportDaoManager {

        @Autowired
        private ReportMapper reportMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(reportMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(ReportDO.ID,ReportDO.DB_ID);
            fieldMap.put(ReportDO.DB_ID,ReportDO.DB_ID);

            fieldMap.put(ReportDO.CATEGORY_ID,ReportDO.DB_CATEGORY_ID);
            fieldMap.put(ReportDO.DB_CATEGORY_ID,ReportDO.DB_CATEGORY_ID);

            fieldMap.put(ReportDO.DATABASE_ID,ReportDO.DB_DATABASE_ID);
            fieldMap.put(ReportDO.DB_DATABASE_ID,ReportDO.DB_DATABASE_ID);

            fieldMap.put(ReportDO.DESCRIPTION,ReportDO.DB_DESCRIPTION);
            fieldMap.put(ReportDO.DB_DESCRIPTION,ReportDO.DB_DESCRIPTION);

            fieldMap.put(ReportDO.NAME,ReportDO.DB_NAME);
            fieldMap.put(ReportDO.DB_NAME,ReportDO.DB_NAME);

            fieldMap.put(ReportDO.PAGEABLE,ReportDO.DB_PAGEABLE);
            fieldMap.put(ReportDO.DB_PAGEABLE,ReportDO.DB_PAGEABLE);

            fieldMap.put(ReportDO.STATEMENT,ReportDO.DB_STATEMENT);
            fieldMap.put(ReportDO.DB_STATEMENT,ReportDO.DB_STATEMENT);

            fieldMap.put(ReportDO.FORM_KEY,ReportDO.DB_FORM_KEY);
            fieldMap.put(ReportDO.DB_FORM_KEY,ReportDO.DB_FORM_KEY);

            fieldMap.put(ReportDO.IS_DELETED,ReportDO.DB_IS_DELETED);
            fieldMap.put(ReportDO.DB_IS_DELETED,ReportDO.DB_IS_DELETED);

            fieldMap.put(ReportDO.GMT_CREATE,ReportDO.DB_GMT_CREATE);
            fieldMap.put(ReportDO.DB_GMT_CREATE,ReportDO.DB_GMT_CREATE);

            fieldMap.put(ReportDO.GMT_MODIFIED,ReportDO.DB_GMT_MODIFIED);
            fieldMap.put(ReportDO.DB_GMT_MODIFIED,ReportDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<ReportDO> listByCategoryId(Long categoryId, String... fieldNames){
            return this.reportMapper.listByCategoryId(categoryId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByCategoryId(Long categoryId, String... fieldNames){
            return this.reportMapper.mapByCategoryId(categoryId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByCategoryId(Long categoryId){
            return this.reportMapper.countByCategoryId(categoryId);
        }

        public Integer updateNotNullFieldsByCategoryId(ReportDO updateDO, Long categoryId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByCategoryId(updateDO,categoryId);
        }

        public Integer updateAllFieldsByCategoryId(ReportDO updateDO,  Long categoryId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByCategoryId(updateDO,categoryId);
        }

        public Integer deleteByCategoryId( Long categoryId){
            return this.reportMapper.deleteByCategoryId(categoryId);
        }



        public List<ReportDO> listByInCategoryId(Collection<Long> categoryIdList, String... fieldNames){
            return this.reportMapper.listByInCategoryId(categoryIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInCategoryId(Collection<Long> categoryIdList, String... fieldNames){
            return this.reportMapper.mapByInCategoryId(categoryIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInCategoryId(Collection<Long> categoryIdList){
            return this.reportMapper.countByInCategoryId(categoryIdList);
        }

        public Integer updateNotNullFieldsByInCategoryId(ReportDO updateDO, Collection<Long> categoryIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInCategoryId(updateDO,categoryIdList);
        }

        public Integer updateAllFieldsByInCategoryId(ReportDO updateDO,  Collection<Long> categoryIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInCategoryId(updateDO,categoryIdList);
        }

        public Integer deleteByInCategoryId( Collection<Long> categoryIdList){
            return this.reportMapper.deleteByInCategoryId(categoryIdList);
        }


        public List<ReportDO> listByDatabaseId(Long databaseId, String... fieldNames){
            return this.reportMapper.listByDatabaseId(databaseId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByDatabaseId(Long databaseId, String... fieldNames){
            return this.reportMapper.mapByDatabaseId(databaseId,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDatabaseId(Long databaseId){
            return this.reportMapper.countByDatabaseId(databaseId);
        }

        public Integer updateNotNullFieldsByDatabaseId(ReportDO updateDO, Long databaseId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByDatabaseId(updateDO,databaseId);
        }

        public Integer updateAllFieldsByDatabaseId(ReportDO updateDO,  Long databaseId){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByDatabaseId(updateDO,databaseId);
        }

        public Integer deleteByDatabaseId( Long databaseId){
            return this.reportMapper.deleteByDatabaseId(databaseId);
        }



        public List<ReportDO> listByInDatabaseId(Collection<Long> databaseIdList, String... fieldNames){
            return this.reportMapper.listByInDatabaseId(databaseIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInDatabaseId(Collection<Long> databaseIdList, String... fieldNames){
            return this.reportMapper.mapByInDatabaseId(databaseIdList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDatabaseId(Collection<Long> databaseIdList){
            return this.reportMapper.countByInDatabaseId(databaseIdList);
        }

        public Integer updateNotNullFieldsByInDatabaseId(ReportDO updateDO, Collection<Long> databaseIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInDatabaseId(updateDO,databaseIdList);
        }

        public Integer updateAllFieldsByInDatabaseId(ReportDO updateDO,  Collection<Long> databaseIdList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInDatabaseId(updateDO,databaseIdList);
        }

        public Integer deleteByInDatabaseId( Collection<Long> databaseIdList){
            return this.reportMapper.deleteByInDatabaseId(databaseIdList);
        }


        public List<ReportDO> listByDescription(String description, String... fieldNames){
            return this.reportMapper.listByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByDescription(String description, String... fieldNames){
            return this.reportMapper.mapByDescription(description,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDescription(String description){
            return this.reportMapper.countByDescription(description);
        }

        public Integer updateNotNullFieldsByDescription(ReportDO updateDO, String description){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByDescription(updateDO,description);
        }

        public Integer updateAllFieldsByDescription(ReportDO updateDO,  String description){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByDescription(updateDO,description);
        }

        public Integer deleteByDescription( String description){
            return this.reportMapper.deleteByDescription(description);
        }



        public List<ReportDO> listByInDescription(Collection<String> descriptionList, String... fieldNames){
            return this.reportMapper.listByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInDescription(Collection<String> descriptionList, String... fieldNames){
            return this.reportMapper.mapByInDescription(descriptionList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDescription(Collection<String> descriptionList){
            return this.reportMapper.countByInDescription(descriptionList);
        }

        public Integer updateNotNullFieldsByInDescription(ReportDO updateDO, Collection<String> descriptionList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer updateAllFieldsByInDescription(ReportDO updateDO,  Collection<String> descriptionList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInDescription(updateDO,descriptionList);
        }

        public Integer deleteByInDescription( Collection<String> descriptionList){
            return this.reportMapper.deleteByInDescription(descriptionList);
        }


        public List<ReportDO> listByName(String name, String... fieldNames){
            return this.reportMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByName(String name, String... fieldNames){
            return this.reportMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.reportMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(ReportDO updateDO, String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(ReportDO updateDO,  String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.reportMapper.deleteByName(name);
        }



        public List<ReportDO> listByInName(Collection<String> nameList, String... fieldNames){
            return this.reportMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInName(Collection<String> nameList, String... fieldNames){
            return this.reportMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            return this.reportMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(ReportDO updateDO, Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(ReportDO updateDO,  Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            return this.reportMapper.deleteByInName(nameList);
        }


        public List<ReportDO> listByPageable(Integer pageable, String... fieldNames){
            return this.reportMapper.listByPageable(pageable,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByPageable(Integer pageable, String... fieldNames){
            return this.reportMapper.mapByPageable(pageable,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPageable(Integer pageable){
            return this.reportMapper.countByPageable(pageable);
        }

        public Integer updateNotNullFieldsByPageable(ReportDO updateDO, Integer pageable){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByPageable(updateDO,pageable);
        }

        public Integer updateAllFieldsByPageable(ReportDO updateDO,  Integer pageable){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByPageable(updateDO,pageable);
        }

        public Integer deleteByPageable( Integer pageable){
            return this.reportMapper.deleteByPageable(pageable);
        }



        public List<ReportDO> listByInPageable(Collection<Integer> pageableList, String... fieldNames){
            return this.reportMapper.listByInPageable(pageableList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInPageable(Collection<Integer> pageableList, String... fieldNames){
            return this.reportMapper.mapByInPageable(pageableList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPageable(Collection<Integer> pageableList){
            return this.reportMapper.countByInPageable(pageableList);
        }

        public Integer updateNotNullFieldsByInPageable(ReportDO updateDO, Collection<Integer> pageableList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInPageable(updateDO,pageableList);
        }

        public Integer updateAllFieldsByInPageable(ReportDO updateDO,  Collection<Integer> pageableList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInPageable(updateDO,pageableList);
        }

        public Integer deleteByInPageable( Collection<Integer> pageableList){
            return this.reportMapper.deleteByInPageable(pageableList);
        }


        public List<ReportDO> listByStatement(String statement, String... fieldNames){
            return this.reportMapper.listByStatement(statement,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByStatement(String statement, String... fieldNames){
            return this.reportMapper.mapByStatement(statement,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByStatement(String statement){
            return this.reportMapper.countByStatement(statement);
        }

        public Integer updateNotNullFieldsByStatement(ReportDO updateDO, String statement){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByStatement(updateDO,statement);
        }

        public Integer updateAllFieldsByStatement(ReportDO updateDO,  String statement){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByStatement(updateDO,statement);
        }

        public Integer deleteByStatement( String statement){
            return this.reportMapper.deleteByStatement(statement);
        }



        public List<ReportDO> listByInStatement(Collection<String> statementList, String... fieldNames){
            return this.reportMapper.listByInStatement(statementList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInStatement(Collection<String> statementList, String... fieldNames){
            return this.reportMapper.mapByInStatement(statementList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInStatement(Collection<String> statementList){
            return this.reportMapper.countByInStatement(statementList);
        }

        public Integer updateNotNullFieldsByInStatement(ReportDO updateDO, Collection<String> statementList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInStatement(updateDO,statementList);
        }

        public Integer updateAllFieldsByInStatement(ReportDO updateDO,  Collection<String> statementList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInStatement(updateDO,statementList);
        }

        public Integer deleteByInStatement( Collection<String> statementList){
            return this.reportMapper.deleteByInStatement(statementList);
        }


        public List<ReportDO> listByFormKey(String formKey, String... fieldNames){
            return this.reportMapper.listByFormKey(formKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByFormKey(String formKey, String... fieldNames){
            return this.reportMapper.mapByFormKey(formKey,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByFormKey(String formKey){
            return this.reportMapper.countByFormKey(formKey);
        }

        public Integer updateNotNullFieldsByFormKey(ReportDO updateDO, String formKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByFormKey(updateDO,formKey);
        }

        public Integer updateAllFieldsByFormKey(ReportDO updateDO,  String formKey){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByFormKey(updateDO,formKey);
        }

        public Integer deleteByFormKey( String formKey){
            return this.reportMapper.deleteByFormKey(formKey);
        }



        public List<ReportDO> listByInFormKey(Collection<String> formKeyList, String... fieldNames){
            return this.reportMapper.listByInFormKey(formKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ReportDO> mapByInFormKey(Collection<String> formKeyList, String... fieldNames){
            return this.reportMapper.mapByInFormKey(formKeyList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInFormKey(Collection<String> formKeyList){
            return this.reportMapper.countByInFormKey(formKeyList);
        }

        public Integer updateNotNullFieldsByInFormKey(ReportDO updateDO, Collection<String> formKeyList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateNotNullFieldsByInFormKey(updateDO,formKeyList);
        }

        public Integer updateAllFieldsByInFormKey(ReportDO updateDO,  Collection<String> formKeyList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.reportMapper.updateAllFieldsByInFormKey(updateDO,formKeyList);
        }

        public Integer deleteByInFormKey( Collection<String> formKeyList){
            return this.reportMapper.deleteByInFormKey(formKeyList);
        }


}

