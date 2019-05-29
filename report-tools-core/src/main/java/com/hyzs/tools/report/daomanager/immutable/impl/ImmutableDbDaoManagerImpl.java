package com.hyzs.tools.report.daomanager.immutable.impl;

import com.hyzs.tools.report.dbo.DbDO;
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
import com.hyzs.tools.report.daomanager.immutable.ImmutableDbDaoManager;
import com.hyzs.gz.common.dao.daomanager.impl.CommonDaoManagerImpl;
import com.hyzs.tools.report.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
public class ImmutableDbDaoManagerImpl extends CommonDaoManagerImpl<DbDO,Long> implements ImmutableDbDaoManager {

        @Autowired
        private DbMapper dbMapper;




        @PostConstruct
        private void init(){
           super.setCommonMapper(dbMapper);

            Map<String,String> fieldMap=new HashMap<>();
            fieldMap.put(DbDO.ID,DbDO.DB_ID);
            fieldMap.put(DbDO.DB_ID,DbDO.DB_ID);

            fieldMap.put(DbDO.DRIVER_CLASS,DbDO.DB_DRIVER_CLASS);
            fieldMap.put(DbDO.DB_DRIVER_CLASS,DbDO.DB_DRIVER_CLASS);

            fieldMap.put(DbDO.NAME,DbDO.DB_NAME);
            fieldMap.put(DbDO.DB_NAME,DbDO.DB_NAME);

            fieldMap.put(DbDO.PASSWORD,DbDO.DB_PASSWORD);
            fieldMap.put(DbDO.DB_PASSWORD,DbDO.DB_PASSWORD);

            fieldMap.put(DbDO.URL,DbDO.DB_URL);
            fieldMap.put(DbDO.DB_URL,DbDO.DB_URL);

            fieldMap.put(DbDO.USERNAME,DbDO.DB_USERNAME);
            fieldMap.put(DbDO.DB_USERNAME,DbDO.DB_USERNAME);

            fieldMap.put(DbDO.TYPE,DbDO.DB_TYPE);
            fieldMap.put(DbDO.DB_TYPE,DbDO.DB_TYPE);

            fieldMap.put(DbDO.INITIAL_SIZE,DbDO.DB_INITIAL_SIZE);
            fieldMap.put(DbDO.DB_INITIAL_SIZE,DbDO.DB_INITIAL_SIZE);

            fieldMap.put(DbDO.MAX_ACTIVE,DbDO.DB_MAX_ACTIVE);
            fieldMap.put(DbDO.DB_MAX_ACTIVE,DbDO.DB_MAX_ACTIVE);

            fieldMap.put(DbDO.MIN_IDLE,DbDO.DB_MIN_IDLE);
            fieldMap.put(DbDO.DB_MIN_IDLE,DbDO.DB_MIN_IDLE);

            fieldMap.put(DbDO.IS_DELETED,DbDO.DB_IS_DELETED);
            fieldMap.put(DbDO.DB_IS_DELETED,DbDO.DB_IS_DELETED);

            fieldMap.put(DbDO.GMT_CREATE,DbDO.DB_GMT_CREATE);
            fieldMap.put(DbDO.DB_GMT_CREATE,DbDO.DB_GMT_CREATE);

            fieldMap.put(DbDO.GMT_MODIFIED,DbDO.DB_GMT_MODIFIED);
            fieldMap.put(DbDO.DB_GMT_MODIFIED,DbDO.DB_GMT_MODIFIED);



            super.setFieldNameMap(fieldMap);
        }



        public List<DbDO> listByDriverClass(String driverClass, String... fieldNames){
            return this.dbMapper.listByDriverClass(driverClass,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByDriverClass(String driverClass, String... fieldNames){
            return this.dbMapper.mapByDriverClass(driverClass,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByDriverClass(String driverClass){
            return this.dbMapper.countByDriverClass(driverClass);
        }

        public Integer updateNotNullFieldsByDriverClass(DbDO updateDO, String driverClass){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByDriverClass(updateDO,driverClass);
        }

        public Integer updateAllFieldsByDriverClass(DbDO updateDO,  String driverClass){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByDriverClass(updateDO,driverClass);
        }

        public Integer deleteByDriverClass( String driverClass){
            return this.dbMapper.deleteByDriverClass(driverClass);
        }



        public List<DbDO> listByInDriverClass(Collection<String> driverClassList, String... fieldNames){
            return this.dbMapper.listByInDriverClass(driverClassList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInDriverClass(Collection<String> driverClassList, String... fieldNames){
            return this.dbMapper.mapByInDriverClass(driverClassList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInDriverClass(Collection<String> driverClassList){
            return this.dbMapper.countByInDriverClass(driverClassList);
        }

        public Integer updateNotNullFieldsByInDriverClass(DbDO updateDO, Collection<String> driverClassList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInDriverClass(updateDO,driverClassList);
        }

        public Integer updateAllFieldsByInDriverClass(DbDO updateDO,  Collection<String> driverClassList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInDriverClass(updateDO,driverClassList);
        }

        public Integer deleteByInDriverClass( Collection<String> driverClassList){
            return this.dbMapper.deleteByInDriverClass(driverClassList);
        }


        public List<DbDO> listByName(String name, String... fieldNames){
            return this.dbMapper.listByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByName(String name, String... fieldNames){
            return this.dbMapper.mapByName(name,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByName(String name){
            return this.dbMapper.countByName(name);
        }

        public Integer updateNotNullFieldsByName(DbDO updateDO, String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByName(updateDO,name);
        }

        public Integer updateAllFieldsByName(DbDO updateDO,  String name){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByName(updateDO,name);
        }

        public Integer deleteByName( String name){
            return this.dbMapper.deleteByName(name);
        }



        public List<DbDO> listByInName(Collection<String> nameList, String... fieldNames){
            return this.dbMapper.listByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInName(Collection<String> nameList, String... fieldNames){
            return this.dbMapper.mapByInName(nameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInName(Collection<String> nameList){
            return this.dbMapper.countByInName(nameList);
        }

        public Integer updateNotNullFieldsByInName(DbDO updateDO, Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInName(updateDO,nameList);
        }

        public Integer updateAllFieldsByInName(DbDO updateDO,  Collection<String> nameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInName(updateDO,nameList);
        }

        public Integer deleteByInName( Collection<String> nameList){
            return this.dbMapper.deleteByInName(nameList);
        }


        public List<DbDO> listByPassword(String password, String... fieldNames){
            return this.dbMapper.listByPassword(password,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByPassword(String password, String... fieldNames){
            return this.dbMapper.mapByPassword(password,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByPassword(String password){
            return this.dbMapper.countByPassword(password);
        }

        public Integer updateNotNullFieldsByPassword(DbDO updateDO, String password){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByPassword(updateDO,password);
        }

        public Integer updateAllFieldsByPassword(DbDO updateDO,  String password){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByPassword(updateDO,password);
        }

        public Integer deleteByPassword( String password){
            return this.dbMapper.deleteByPassword(password);
        }



        public List<DbDO> listByInPassword(Collection<String> passwordList, String... fieldNames){
            return this.dbMapper.listByInPassword(passwordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInPassword(Collection<String> passwordList, String... fieldNames){
            return this.dbMapper.mapByInPassword(passwordList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInPassword(Collection<String> passwordList){
            return this.dbMapper.countByInPassword(passwordList);
        }

        public Integer updateNotNullFieldsByInPassword(DbDO updateDO, Collection<String> passwordList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInPassword(updateDO,passwordList);
        }

        public Integer updateAllFieldsByInPassword(DbDO updateDO,  Collection<String> passwordList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInPassword(updateDO,passwordList);
        }

        public Integer deleteByInPassword( Collection<String> passwordList){
            return this.dbMapper.deleteByInPassword(passwordList);
        }


        public List<DbDO> listByUrl(String url, String... fieldNames){
            return this.dbMapper.listByUrl(url,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByUrl(String url, String... fieldNames){
            return this.dbMapper.mapByUrl(url,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUrl(String url){
            return this.dbMapper.countByUrl(url);
        }

        public Integer updateNotNullFieldsByUrl(DbDO updateDO, String url){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByUrl(updateDO,url);
        }

        public Integer updateAllFieldsByUrl(DbDO updateDO,  String url){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByUrl(updateDO,url);
        }

        public Integer deleteByUrl( String url){
            return this.dbMapper.deleteByUrl(url);
        }



        public List<DbDO> listByInUrl(Collection<String> urlList, String... fieldNames){
            return this.dbMapper.listByInUrl(urlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInUrl(Collection<String> urlList, String... fieldNames){
            return this.dbMapper.mapByInUrl(urlList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUrl(Collection<String> urlList){
            return this.dbMapper.countByInUrl(urlList);
        }

        public Integer updateNotNullFieldsByInUrl(DbDO updateDO, Collection<String> urlList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInUrl(updateDO,urlList);
        }

        public Integer updateAllFieldsByInUrl(DbDO updateDO,  Collection<String> urlList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInUrl(updateDO,urlList);
        }

        public Integer deleteByInUrl( Collection<String> urlList){
            return this.dbMapper.deleteByInUrl(urlList);
        }


        public List<DbDO> listByUsername(String username, String... fieldNames){
            return this.dbMapper.listByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByUsername(String username, String... fieldNames){
            return this.dbMapper.mapByUsername(username,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByUsername(String username){
            return this.dbMapper.countByUsername(username);
        }

        public Integer updateNotNullFieldsByUsername(DbDO updateDO, String username){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByUsername(updateDO,username);
        }

        public Integer updateAllFieldsByUsername(DbDO updateDO,  String username){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByUsername(updateDO,username);
        }

        public Integer deleteByUsername( String username){
            return this.dbMapper.deleteByUsername(username);
        }



        public List<DbDO> listByInUsername(Collection<String> usernameList, String... fieldNames){
            return this.dbMapper.listByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInUsername(Collection<String> usernameList, String... fieldNames){
            return this.dbMapper.mapByInUsername(usernameList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInUsername(Collection<String> usernameList){
            return this.dbMapper.countByInUsername(usernameList);
        }

        public Integer updateNotNullFieldsByInUsername(DbDO updateDO, Collection<String> usernameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInUsername(updateDO,usernameList);
        }

        public Integer updateAllFieldsByInUsername(DbDO updateDO,  Collection<String> usernameList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInUsername(updateDO,usernameList);
        }

        public Integer deleteByInUsername( Collection<String> usernameList){
            return this.dbMapper.deleteByInUsername(usernameList);
        }


        public List<DbDO> listByType(String type, String... fieldNames){
            return this.dbMapper.listByType(type,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByType(String type, String... fieldNames){
            return this.dbMapper.mapByType(type,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByType(String type){
            return this.dbMapper.countByType(type);
        }

        public Integer updateNotNullFieldsByType(DbDO updateDO, String type){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByType(updateDO,type);
        }

        public Integer updateAllFieldsByType(DbDO updateDO,  String type){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByType(updateDO,type);
        }

        public Integer deleteByType( String type){
            return this.dbMapper.deleteByType(type);
        }



        public List<DbDO> listByInType(Collection<String> typeList, String... fieldNames){
            return this.dbMapper.listByInType(typeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInType(Collection<String> typeList, String... fieldNames){
            return this.dbMapper.mapByInType(typeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInType(Collection<String> typeList){
            return this.dbMapper.countByInType(typeList);
        }

        public Integer updateNotNullFieldsByInType(DbDO updateDO, Collection<String> typeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInType(updateDO,typeList);
        }

        public Integer updateAllFieldsByInType(DbDO updateDO,  Collection<String> typeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInType(updateDO,typeList);
        }

        public Integer deleteByInType( Collection<String> typeList){
            return this.dbMapper.deleteByInType(typeList);
        }


        public List<DbDO> listByInitialSize(Integer initialSize, String... fieldNames){
            return this.dbMapper.listByInitialSize(initialSize,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInitialSize(Integer initialSize, String... fieldNames){
            return this.dbMapper.mapByInitialSize(initialSize,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInitialSize(Integer initialSize){
            return this.dbMapper.countByInitialSize(initialSize);
        }

        public Integer updateNotNullFieldsByInitialSize(DbDO updateDO, Integer initialSize){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInitialSize(updateDO,initialSize);
        }

        public Integer updateAllFieldsByInitialSize(DbDO updateDO,  Integer initialSize){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInitialSize(updateDO,initialSize);
        }

        public Integer deleteByInitialSize( Integer initialSize){
            return this.dbMapper.deleteByInitialSize(initialSize);
        }



        public List<DbDO> listByInInitialSize(Collection<Integer> initialSizeList, String... fieldNames){
            return this.dbMapper.listByInInitialSize(initialSizeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInInitialSize(Collection<Integer> initialSizeList, String... fieldNames){
            return this.dbMapper.mapByInInitialSize(initialSizeList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInInitialSize(Collection<Integer> initialSizeList){
            return this.dbMapper.countByInInitialSize(initialSizeList);
        }

        public Integer updateNotNullFieldsByInInitialSize(DbDO updateDO, Collection<Integer> initialSizeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInInitialSize(updateDO,initialSizeList);
        }

        public Integer updateAllFieldsByInInitialSize(DbDO updateDO,  Collection<Integer> initialSizeList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInInitialSize(updateDO,initialSizeList);
        }

        public Integer deleteByInInitialSize( Collection<Integer> initialSizeList){
            return this.dbMapper.deleteByInInitialSize(initialSizeList);
        }


        public List<DbDO> listByMaxActive(Integer maxActive, String... fieldNames){
            return this.dbMapper.listByMaxActive(maxActive,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByMaxActive(Integer maxActive, String... fieldNames){
            return this.dbMapper.mapByMaxActive(maxActive,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMaxActive(Integer maxActive){
            return this.dbMapper.countByMaxActive(maxActive);
        }

        public Integer updateNotNullFieldsByMaxActive(DbDO updateDO, Integer maxActive){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByMaxActive(updateDO,maxActive);
        }

        public Integer updateAllFieldsByMaxActive(DbDO updateDO,  Integer maxActive){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByMaxActive(updateDO,maxActive);
        }

        public Integer deleteByMaxActive( Integer maxActive){
            return this.dbMapper.deleteByMaxActive(maxActive);
        }



        public List<DbDO> listByInMaxActive(Collection<Integer> maxActiveList, String... fieldNames){
            return this.dbMapper.listByInMaxActive(maxActiveList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInMaxActive(Collection<Integer> maxActiveList, String... fieldNames){
            return this.dbMapper.mapByInMaxActive(maxActiveList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMaxActive(Collection<Integer> maxActiveList){
            return this.dbMapper.countByInMaxActive(maxActiveList);
        }

        public Integer updateNotNullFieldsByInMaxActive(DbDO updateDO, Collection<Integer> maxActiveList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInMaxActive(updateDO,maxActiveList);
        }

        public Integer updateAllFieldsByInMaxActive(DbDO updateDO,  Collection<Integer> maxActiveList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInMaxActive(updateDO,maxActiveList);
        }

        public Integer deleteByInMaxActive( Collection<Integer> maxActiveList){
            return this.dbMapper.deleteByInMaxActive(maxActiveList);
        }


        public List<DbDO> listByMinIdle(Integer minIdle, String... fieldNames){
            return this.dbMapper.listByMinIdle(minIdle,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByMinIdle(Integer minIdle, String... fieldNames){
            return this.dbMapper.mapByMinIdle(minIdle,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByMinIdle(Integer minIdle){
            return this.dbMapper.countByMinIdle(minIdle);
        }

        public Integer updateNotNullFieldsByMinIdle(DbDO updateDO, Integer minIdle){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByMinIdle(updateDO,minIdle);
        }

        public Integer updateAllFieldsByMinIdle(DbDO updateDO,  Integer minIdle){
            if (super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByMinIdle(updateDO,minIdle);
        }

        public Integer deleteByMinIdle( Integer minIdle){
            return this.dbMapper.deleteByMinIdle(minIdle);
        }



        public List<DbDO> listByInMinIdle(Collection<Integer> minIdleList, String... fieldNames){
            return this.dbMapper.listByInMinIdle(minIdleList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Map<Long,DbDO> mapByInMinIdle(Collection<Integer> minIdleList, String... fieldNames){
            return this.dbMapper.mapByInMinIdle(minIdleList,super.javaFieldNames2DataBaseNames(fieldNames));
        }

        public Integer countByInMinIdle(Collection<Integer> minIdleList){
            return this.dbMapper.countByInMinIdle(minIdleList);
        }

        public Integer updateNotNullFieldsByInMinIdle(DbDO updateDO, Collection<Integer> minIdleList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateNotNullFieldsByInMinIdle(updateDO,minIdleList);
        }

        public Integer updateAllFieldsByInMinIdle(DbDO updateDO,  Collection<Integer> minIdleList){
            if(super.doChecker != null){
                super.doChecker.checkWhenModify(updateDO);
            }
            return this.dbMapper.updateAllFieldsByInMinIdle(updateDO,minIdleList);
        }

        public Integer deleteByInMinIdle( Collection<Integer> minIdleList){
            return this.dbMapper.deleteByInMinIdle(minIdleList);
        }


}

