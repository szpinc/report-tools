package com.hyzs.tools.report.daomanager.immutable.impl;

import com.hyzs.tools.report.dbo.ParamDO;
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
import com.hyzs.tools.report.daomanager.immutable.ImmutableParamDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tools.report.mapper.ParamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableParamDaoManagerImpl extends CommonDaoManagerImpl<ParamDO,Long> implements ImmutableParamDaoManager {

        @Autowired
        private ParamMapper paramMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(paramMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(ParamDO.ID,ParamDO.DB_ID);
            fieldMap.put(ParamDO.DB_ID,ParamDO.DB_ID);

            fieldMap.put(ParamDO.NAME,ParamDO.DB_NAME);
            fieldMap.put(ParamDO.DB_NAME,ParamDO.DB_NAME);

            fieldMap.put(ParamDO.SORTABLE,ParamDO.DB_SORTABLE);
            fieldMap.put(ParamDO.DB_SORTABLE,ParamDO.DB_SORTABLE);

            fieldMap.put(ParamDO.VALUE,ParamDO.DB_VALUE);
            fieldMap.put(ParamDO.DB_VALUE,ParamDO.DB_VALUE);

            fieldMap.put(ParamDO.SORT_TYPE,ParamDO.DB_SORT_TYPE);
            fieldMap.put(ParamDO.DB_SORT_TYPE,ParamDO.DB_SORT_TYPE);

            fieldMap.put(ParamDO.IS_DELETED,ParamDO.DB_IS_DELETED);
            fieldMap.put(ParamDO.DB_IS_DELETED,ParamDO.DB_IS_DELETED);

            fieldMap.put(ParamDO.GMT_CREATE,ParamDO.DB_GMT_CREATE);
            fieldMap.put(ParamDO.DB_GMT_CREATE,ParamDO.DB_GMT_CREATE);

            fieldMap.put(ParamDO.GMT_MODIFIED,ParamDO.DB_GMT_MODIFIED);
            fieldMap.put(ParamDO.DB_GMT_MODIFIED,ParamDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<ParamDO> listByName(String name, String... fieldNames){
            return this.paramMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByName(String name, String... fieldNames){
            return this.paramMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.paramMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(ParamDO updateDO, String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(ParamDO updateDO,  String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.paramMapper.deleteByName(name);
        }



        public List<ParamDO> listByInName(Collection<String> nameList, String... fieldNames){
            return this.paramMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByInName(Collection<String> nameList, String... fieldNames){
            return this.paramMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            return this.paramMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(ParamDO updateDO, Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(ParamDO updateDO,  Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            return this.paramMapper.deleteByInName(nameList);
        }


        public List<ParamDO> listBySortable(Integer sortable, String... fieldNames){
            return this.paramMapper.listBySortable(sortable,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapBySortable(Integer sortable, String... fieldNames){
            return this.paramMapper.mapBySortable(sortable,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySortable(Integer sortable){
            return this.paramMapper.countBySortable(sortable);
        }

        public Integer updateNotNullFieldsBySortable(ParamDO updateDO, Integer sortable){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsBySortable(updateDO,sortable);
        }

        public Integer updateAllFieldsBySortable(ParamDO updateDO,  Integer sortable){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsBySortable(updateDO,sortable);
        }

        public Integer deleteBySortable( Integer sortable){
            return this.paramMapper.deleteBySortable(sortable);
        }



        public List<ParamDO> listByInSortable(Collection<Integer> sortableList, String... fieldNames){
            return this.paramMapper.listByInSortable(sortableList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByInSortable(Collection<Integer> sortableList, String... fieldNames){
            return this.paramMapper.mapByInSortable(sortableList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSortable(Collection<Integer> sortableList){
            return this.paramMapper.countByInSortable(sortableList);
        }

        public Integer updateNotNullFieldsByInSortable(ParamDO updateDO, Collection<Integer> sortableList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByInSortable(updateDO,sortableList);
        }

        public Integer updateAllFieldsByInSortable(ParamDO updateDO,  Collection<Integer> sortableList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByInSortable(updateDO,sortableList);
        }

        public Integer deleteByInSortable( Collection<Integer> sortableList){
            return this.paramMapper.deleteByInSortable(sortableList);
        }


        public List<ParamDO> listByValue(String value, String... fieldNames){
            return this.paramMapper.listByValue(value,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByValue(String value, String... fieldNames){
            return this.paramMapper.mapByValue(value,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByValue(String value){
            return this.paramMapper.countByValue(value);
        }

        public Integer updateNotNullFieldsByValue(ParamDO updateDO, String value){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByValue(updateDO,value);
        }

        public Integer updateAllFieldsByValue(ParamDO updateDO,  String value){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByValue(updateDO,value);
        }

        public Integer deleteByValue( String value){
            return this.paramMapper.deleteByValue(value);
        }



        public List<ParamDO> listByInValue(Collection<String> valueList, String... fieldNames){
            return this.paramMapper.listByInValue(valueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByInValue(Collection<String> valueList, String... fieldNames){
            return this.paramMapper.mapByInValue(valueList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInValue(Collection<String> valueList){
            return this.paramMapper.countByInValue(valueList);
        }

        public Integer updateNotNullFieldsByInValue(ParamDO updateDO, Collection<String> valueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByInValue(updateDO,valueList);
        }

        public Integer updateAllFieldsByInValue(ParamDO updateDO,  Collection<String> valueList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByInValue(updateDO,valueList);
        }

        public Integer deleteByInValue( Collection<String> valueList){
            return this.paramMapper.deleteByInValue(valueList);
        }


        public List<ParamDO> listBySortType(String sortType, String... fieldNames){
            return this.paramMapper.listBySortType(sortType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapBySortType(String sortType, String... fieldNames){
            return this.paramMapper.mapBySortType(sortType,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countBySortType(String sortType){
            return this.paramMapper.countBySortType(sortType);
        }

        public Integer updateNotNullFieldsBySortType(ParamDO updateDO, String sortType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsBySortType(updateDO,sortType);
        }

        public Integer updateAllFieldsBySortType(ParamDO updateDO,  String sortType){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsBySortType(updateDO,sortType);
        }

        public Integer deleteBySortType( String sortType){
            return this.paramMapper.deleteBySortType(sortType);
        }



        public List<ParamDO> listByInSortType(Collection<String> sortTypeList, String... fieldNames){
            return this.paramMapper.listByInSortType(sortTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,ParamDO> mapByInSortType(Collection<String> sortTypeList, String... fieldNames){
            return this.paramMapper.mapByInSortType(sortTypeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInSortType(Collection<String> sortTypeList){
            return this.paramMapper.countByInSortType(sortTypeList);
        }

        public Integer updateNotNullFieldsByInSortType(ParamDO updateDO, Collection<String> sortTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateNotNullFieldsByInSortType(updateDO,sortTypeList);
        }

        public Integer updateAllFieldsByInSortType(ParamDO updateDO,  Collection<String> sortTypeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.paramMapper.updateAllFieldsByInSortType(updateDO,sortTypeList);
        }

        public Integer deleteByInSortType( Collection<String> sortTypeList){
            return this.paramMapper.deleteByInSortType(sortTypeList);
        }


}

